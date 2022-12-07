package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LesTaches")
public class LesTaches {

	private int id;
	private String titre;
	private String description;
	private String etat;
	
	public LesTaches() {
	}

	public LesTaches(int id, String titre, String description, String etat) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.etat = etat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "LesTaches [id=" + id + ", titre=" + titre + ", description=" + description + ", etat=" + etat + "]";
	}
	
	
	

}
