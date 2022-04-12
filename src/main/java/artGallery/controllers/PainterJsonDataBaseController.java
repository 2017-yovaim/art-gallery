package artGallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import artGallery.models.Painter;
import artGallery.models.Painting;
import artGallery.repo.IPainterRepo;

@RestController
@RequestMapping("j/painters")
public class PainterJsonDataBaseController 
{
	@Autowired
	private IPainterRepo painterDataBaseRepo;
	
	@GetMapping("/all")
	public List<Painter> getAll()
	{
		return painterDataBaseRepo.getAll();
	}
	
	@GetMapping("/{id}")
	public Painter getByID(@PathVariable Long id)
	{
		return painterDataBaseRepo.getByID(id);
	}
	
	@GetMapping("/allPaintingsBy/{painterID}")
	public List<Painting> getAllPaintingsByPainter(@PathVariable Long painterID)
	{
		return painterDataBaseRepo.getAllPaintingsByPainter(painterID);
	}
}
