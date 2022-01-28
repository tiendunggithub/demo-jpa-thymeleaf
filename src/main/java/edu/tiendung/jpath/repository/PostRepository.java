package edu.tiendung.jpath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.tiendung.jpath.entity.Post;

@Repository("postReposiroty")
public interface PostRepository extends JpaRepository<Post, Integer>{
}
