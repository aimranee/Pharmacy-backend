package emsi.pharmacy.backend.service.impl;

import java.util.List;

import emsi.pharmacy.backend.entity.Ville;
import emsi.pharmacy.backend.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emsi.pharmacy.backend.dao.IDao;

@Service
public class VilleService implements IDao<Ville>{

	@Autowired
	private VilleRepository villeRepository;
	
	public VilleService() {
		super();
	}

	@Override
	public Ville save(Ville o) {
		// TODO Auto-generated method stub
		return villeRepository.save(o);
	}

	@Override
	public void update(Ville villeUp) {
		// TODO Auto-generated method stub
		Ville ville = villeRepository.findById(villeUp.getId());
		if (ville!=null) {
			ville.setNom(villeUp.getNom());
			villeRepository.save(ville);
		}
	}

	@Override
	public void delete(Ville villeUp) {
		// TODO Auto-generated method stub
		Ville ville = villeRepository.findById(villeUp.getId());
		if (ville!=null)
			villeRepository.delete(villeUp);
	}

	@Override
	public Ville findById(int id) {
		// TODO Auto-generated method stub 
		return villeRepository.findById(id);
	}

	@Override
	public List<Ville> findAll() {
		// TODO Auto-generated method stub
		return villeRepository.findAll();
	}

	public Ville getVilleById(int id) {
		// TODO Auto-generated method stub
        return villeRepository.findById(id);
	}
}
