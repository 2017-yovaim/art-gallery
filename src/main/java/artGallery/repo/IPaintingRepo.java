package artGallery.repo;

import java.util.List;

import artGallery.models.Painting;

public interface IPaintingRepo 
{
	List<Painting> getAll();
	Painting getByID(Long id);
	void addPainting(Painting painting);
}
