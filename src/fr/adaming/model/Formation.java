package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Formation {
@Id
@GeneratedValue
	private int id;
    private String theme;
  
    @ManyToOne
    @JoinColumn(name="idLieu")
    private Lieu lieu;
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
	
	public Formation(String theme) {
	super();
	this.theme = theme;
}
	public Formation(int id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + "]";
	}
	
	
	
}
