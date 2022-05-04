package artGallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import artGallery.models.Painting;
import artGallery.repo.IPaintingRepo;

@Controller
@RequestMapping("h/paintings")
public class PaintingHtmlDataBaseController 
{
	@Autowired
	private IPaintingRepo repo;

	@GetMapping("/index")
	public String getAll(Model m) 
	{
	List<Painting> p = repo.getAll();
	m.addAttribute("paintings", p);
	return "paintingsIndex";
	}

	@GetMapping("/{id}")
	public String getById(@PathVariable Long id, Model m) 
	{
	Painting p = repo.getByID(id);
	m.addAttribute("currentPainting",p);
	return "painting";
	}

	@GetMapping("/add")
	public String addPainting(Model m) 
	{
	m.addAttribute("toAdd", new Painting());
	return "fPainting";
	}

	@PostMapping("/add")
	public String addPainting(Painting p) 
	{
	repo.addPainting(p);
	return "redirect:paintingsIndex";
	}
}
