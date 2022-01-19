package edu.tiendung.jpath.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.tiendung.jpath.entity.Hobby;



public interface HobbyRepository extends JpaRepository<Hobby, Integer> {
}
