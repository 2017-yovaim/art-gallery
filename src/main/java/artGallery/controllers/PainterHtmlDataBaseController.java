package artGallery.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import artGallery.models.Painter;
import artGallery.models.Painting;
import artGallery.repo.IPainterRepo;

@Controller
@RequestMapping("h/painters")
public class PainterHtmlDataBaseController 
{
	
		@Autowired
		private IPainterRepo repo;


		@GetMapping("/index")
		public String getAll(Model m) 
		{
			List<Painter> p = repo.getAll();
			m.addAttribute("painters", p);
			return "paintersIndex";
		}

		@GetMapping("/{id}")
		public String getById(@PathVariable Long id, Model m) 
		{
		Painter p = repo.getByID(id);
		m.addAttribute("currentPainter",p);
		return "painter";
		}

		@GetMapping("/add")
		public String addPainter(Model m) {
		m.addAttribute("toAdd", new Painting());
		return "fPainter";
		}

		@PostMapping("/add")
		public String addPainter(Painter p) {
		repo.addPainter(p);
		return "redirect:paintersIndex";
		}
}
