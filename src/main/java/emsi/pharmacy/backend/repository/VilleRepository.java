package emsi.pharmacy.backend.repository;

import emsi.pharmacy.backend.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer> {
	//Ville findByNom(String nom);
	Ville findById(int id);
}
