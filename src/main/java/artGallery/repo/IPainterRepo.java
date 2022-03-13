package artGallery.repo;

import java.util.List;

import artGallery.models.Painter;

public interface IPainterRepo 
{
	List<Painter> getAll();
	Painter getByID(Long id);
	void addPainter(Painter painter);
}
