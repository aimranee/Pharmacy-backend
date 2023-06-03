package emsi.pharmacy.backend.service.impl;

import java.util.List;

import emsi.pharmacy.backend.entity.Pharmacie_garde;
import emsi.pharmacy.backend.repository.PharmacieGardeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emsi.pharmacy.backend.dao.IDao;

@Service
public class PharmacieGardeService implements IDao<Pharmacie_garde>{
	@Autowired
	private PharmacieGardeRepository pharmacieGardeRepository;

	@Override
	public Pharmacie_garde save(Pharmacie_garde o) {
		// TODO Auto-generated method stub
		return pharmacieGardeRepository.save(o);
	}

	@Override
	public void update(Pharmacie_garde o) {
		// TODO Auto-generated method stub
		pharmacieGardeRepository.save(o);
	}

	@Override
	public void delete(Pharmacie_garde id) {
		// TODO Auto-generated method stub
		pharmacieGardeRepository.delete(id);
	}

	@Override
	public Pharmacie_garde findById(int id) {
		// TODO Auto-generated method stub
		return pharmacieGardeRepository.findById(id);
	}

	@Override
	public List<Pharmacie_garde> findAll() {
		// TODO Auto-generated method stub
		return pharmacieGardeRepository.findAll();
	}


	
}
