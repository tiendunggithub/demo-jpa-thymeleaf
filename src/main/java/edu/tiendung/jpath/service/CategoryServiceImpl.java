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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Category object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
