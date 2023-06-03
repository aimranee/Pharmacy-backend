package emsi.pharmacy.backend.service.impl;

import java.util.List;

import emsi.pharmacy.backend.entity.Zone;
import emsi.pharmacy.backend.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import emsi.pharmacy.backend.dao.IDao;



@Service
public class ZoneService implements IDao<Zone>{

	@Autowired
	private ZoneRepository zoneRepository;

	@Override
	public Zone save(Zone o) {
		// TODO Auto-generated method stub
		return zoneRepository.save(o);
	}
	

	@Override
	public void delete(Zone o) {
		// TODO Auto-generated method stub
		zoneRepository.delete(o);
	}

	@Override
	public Zone findById(int id) {
		// TODO Auto-generated method stub
		return zoneRepository.findById(id);
	}

	@Override
	public List<Zone> findAll() {
		// TODO Auto-generated method stub
		return zoneRepository.findAll();
	}
	
	public List<Zone> findByVilleId(int id) {
		// TODO Auto-generated method stub
		return zoneRepository.findByVilleId(id);
	}

	@Override
	public void update(Zone zoneUp) {
		// TODO Auto-generated method stub
		Zone zone = zoneRepository.findById(zoneUp.getId());
		zone.setNom(zoneUp.getNom());
		zone.setVille(zoneUp.getVille());
		zoneRepository.save(zone);
	}

	public Zone updateNull(Zone zoneUp) {
		// TODO Auto-generated method stub
		Zone zone = zoneRepository.findById(zoneUp.getId());
		zone.setNom(zoneUp.getNom());
		zone.setVille(zoneUp.getVille());
		return zoneRepository.save(zone);
	}
	
	public List<Zone> findByNom(String nom){

        return zoneRepository.findByNom(nom);
    }

	
}
