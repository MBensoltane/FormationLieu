package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lieu {
@Id
@GeneratedValue
private int idLieu;
private  String adresse;
private String ville;

public int getIdLieu() {
	return idLieu;
}


public Lieu() {
	super();
	// TODO Auto-generated constructor stub
}


public Lieu(String adresse, String ville) {
	super();
	this.adresse = adresse;
	this.ville = ville;
}


public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

@Override
public String toString() {
	return "Lieu [idLieu=" + idLieu + ", adresse=" + adresse + ", ville=" + ville + "]";
}

}
