package sn.simplon.senforage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomDeFamille;
    private String telephone;
    @ManyToOne
    private Village village = new Village();
    @ManyToOne
    private User user = new User();
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private String adresse;

    public Client() {
    }

    public Client(int id, String nomDeFamille, String telephone, Village village, User user, String adresse) {
		super();
		this.id = id;
		this.nomDeFamille = nomDeFamille;
		this.telephone = telephone;
		this.village = village;
		this.user = user;
		this.adresse = adresse;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDeFamille() {
        return nomDeFamille;
    }

    public void setNomDeFamille(String nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
