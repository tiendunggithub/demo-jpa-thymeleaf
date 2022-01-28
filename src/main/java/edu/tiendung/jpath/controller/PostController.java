package edu.tiendung.jpath.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.tiendung.jpath.entity.Category;
import edu.tiendung.jpath.entity.Post;
import edu.tiendung.jpath.entity.Tag;
import edu.tiendung.jpath.service.define.BaseService;
import edu.tiendung.jpath.service.define.PostPageService;

@Controller
@RequestMapping("/post")
public class PostController {
	/*
	 * @Autowired private BaseService<Post> postService;
	 */
	
	@Autowired
	private BaseService<Category> categoryService;
	
	@Autowired
	private BaseService<Tag> tagService;
	
	@Autowired
	private PostPageService postPageService;
	
	@ModelAttribute("categoris")
	public List<Category> categories(){
		return categoryService.getAll();
	}
	@ModelAttribute("tags")
	public List<Tag> tags(){
		return tagService.getAll();
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		// LOG.debug("inside show customer-form handler method");
		Post thePost = new Post();
		theModel.addAttribute("post", thePost);
		return "post/create";
	}

	@PostMapping("/savePost")
	public String savePost(@ModelAttribute("post") Post thePost) {
		postPageService.save(thePost);
		return "redirect:/post/list";
	}

	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("postId") int theId, Model theModel) {
		Post thePost = postPageService.findById((long)theId);
		theModel.addAttribute("post", thePost);
		return "post-form";
	}

	@GetMapping("/delete")
	public String deletePost(@RequestParam("postId") int theId) {
		postPageService.remove((long)theId);
		return "redirect:/post/list";
	}
	
	@GetMapping("/list")
	public String listPosts(@RequestParam("s") Optional<String> s, Pageable pageable,  Model theModel) {
		Page<Post> posts;
		if (s.isPresent()) {
			posts = postPageService.findAllByTitleContaining(s.get(), pageable);
		} else {
			posts = postPageService.findAll(pageable);
		}
		theModel.addAttribute("posts", posts);

		return "post/list";
	}
}
