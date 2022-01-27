package edu.tiendung.jpath.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.tiendung.jpath.entity.Category;
import edu.tiendung.jpath.entity.Post;
import edu.tiendung.jpath.repository.PostRepository;
import edu.tiendung.jpath.service.define.PostService;

public class PostServiceImpl implements PostService{

	@Autowired
    private PostRepository postRepository;
	@Override
	public Page<Post> findAll(Pageable pageable) {
		return postRepository.findAll(pageable);
	}

	@Override
	public Post findById(Long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public void save(Post post) {
		postRepository.save(post);
	}

	@Override
	public void remove(Long id) {
		postRepository.deleteById(id);
	}

	@Override
	public Iterable<Post> findAllByCategory(Category category) {
		return postRepository.findAllByCategory(category);
	}

	@Override
	public Page<Post> findAllByTitleContaining(String title, Pageable pageable) {
		return postRepository.findAllByTitleContaining(title, pageable);
	}

}
