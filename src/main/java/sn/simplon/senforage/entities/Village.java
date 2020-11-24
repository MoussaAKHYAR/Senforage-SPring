package sn.simplon.senforage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomVillage;
    
    @OneToMany(mappedBy = "village")
    private List<Client> clients = new ArrayList<Client>(); 
    
    public Village() {
    	
    }

    public Village(int id, String nomVillage) {
        this.id = id;
        this.nomVillage = nomVillage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomVillage() {
        return nomVillage;
    }

    public void setNomVillage(String nomVillage) {
        this.nomVillage = nomVillage;
    }
}
