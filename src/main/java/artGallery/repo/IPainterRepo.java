package artGallery.repo;

import java.util.List;

import artGallery.models.Painter;
import artGallery.models.Painting;

public interface IPainterRepo 
{
	List<Painter> getAll();
	Painter getByID(Long id);
	void addPainter(Painter painter);
	List<Painting> getAllPaintingsByPainter(Long painterID);
}
