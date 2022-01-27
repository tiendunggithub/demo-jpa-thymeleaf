package edu.tiendung.jpath.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.tiendung.jpath.entity.Category;
import edu.tiendung.jpath.entity.Post;

@Repository
@Transactional
public interface PostRepository extends JpaRepository<Post, Long> {

	Page<Post> findAllByTitleContaining(String title, Pageable pageable);

	Iterable<Post> findAllByCategory(Category category);
}
