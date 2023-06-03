package emsi.pharmacy.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import emsi.pharmacy.backend.entity.Zone;


@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer>{
	
	Zone findById(int id);
	
	List<Zone> findByVilleId(int ville_id);
	
	@Query("select z from Zone z where z.ville.nom= :nom order by z.nom")
    List<Zone> findByNom(@Param("nom") String nom);
}
