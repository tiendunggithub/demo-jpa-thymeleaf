package edu.tiendung.jpath.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tiendung.jpath.entity.Tag;
import edu.tiendung.jpath.repository.TagRepository;
import edu.tiendung.jpath.service.define.BaseService;

@Service
public class TagServiceImpl implements BaseService<Tag>{
	@Autowired
	private TagRepository tagRepository;

	@Override
	public List<Tag> getAll() {
		return tagRepository.findAll();
	}

	@Override
	public void save(Tag object) {
		tagRepository.save(object);
	}

	@Override
	public Tag getByID(int id) {
		return tagRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		tagRepository.deleteById(id);
	}
}
