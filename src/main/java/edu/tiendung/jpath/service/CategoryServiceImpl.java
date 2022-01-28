package edu.tiendung.jpath.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tiendung.jpath.entity.Category;
import edu.tiendung.jpath.repository.CategoryRepository;
import edu.tiendung.jpath.service.define.BaseService;

@Service
public class CategoryServiceImpl implements BaseService<Category>{

	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

	@Override
	public void save(Category object) {
		categoryRepository.save(object);
	}

	@Override
	public Category getByID(int id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		categoryRepository.deleteById(id);
	}

}
