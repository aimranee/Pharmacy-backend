package emsi.pharmacy.backend.controller;

import java.util.List;

import emsi.pharmacy.backend.entity.Pharmacie_garde;
import emsi.pharmacy.backend.service.impl.PharmacieGardeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("api/pharmacieGarde")
public class PharmacieGardeController {

	@Autowired
    private PharmacieGardeService pharmacieGardeService;
	
	@PostMapping("/save")
	public void save(@RequestBody Pharmacie_garde pharmacieGarde){
		pharmacieGardeService.save(pharmacieGarde);
	}
	
	@GetMapping("")
	public List<Pharmacie_garde> findAll(){
	    return pharmacieGardeService.findAll();
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Pharmacie_garde pharmacieGarde){

//		Pharmacie_garde ph = pharmacieGardeService.findById(id);
//		if (ph != null){
//
			pharmacieGardeService.delete(pharmacieGarde);
//		}
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Pharmacie_garde o){
		pharmacieGardeService.update(o);
	}
}
