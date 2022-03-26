package artGallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import artGallery.models.Painting;
import artGallery.repo.IPaintingRepo;

@RestController
@RequestMapping("j/paintings")
public class PaintingJsonDataBaseController 
{

	@Autowired
	private IPaintingRepo repo;
	
	@GetMapping("/all")
	public List<Painting> getAll()
	{
		return repo.getAll();
	}
	
	@GetMapping("/{id}")
	public Painting getByID(@PathVariable Long id)
	{
		return repo.getByID(id);
	}
}
