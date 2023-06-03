package emsi.pharmacy.backend.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Zone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name = "ville_id")
	private Ville ville;
	
	@OneToMany(mappedBy = "zone", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Pharmacie> pharmacies;
	

	public Zone() {
		super();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Ville getVille() {
		return ville;
	}


	public void setVille(Ville ville) {
		this.ville = ville;
	}


	public List<Pharmacie> getPharmacies() {
		return pharmacies;
	}


	public void setPharmacies(List<Pharmacie> pharmacies) {
		this.pharmacies = pharmacies;
	}

	

	
}
