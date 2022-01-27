package edu.tiendung.jpath.service.define;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.tiendung.jpath.entity.Post;
import edu.tiendung.jpath.entity.Category;

public interface PostService {
	Page<Post> findAll(Pageable pageable);

    Post findById(Long id);

    void save(Post post);

    void remove(Long id);

    Iterable<Post> findAllByCategory(Category Category);

    Page<Post> findAllByTitleContaining(String title, Pageable pageable);
}
