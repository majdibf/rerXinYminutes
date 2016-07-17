package com.ratp.transport.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ligne")
public class Ligne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "designation")
	private String designation;

	@Column(name = "actif")
	private boolean actif;

	@Column(name = "cssStyle")
	private String cssStyle;

	public Ligne() {
	}

	public Ligne(int id, String designation, boolean actif, String cssStyle) {
		super();
		this.id = id;
		this.designation = designation;
		this.actif = actif;
		this.cssStyle = cssStyle;
	}
	public Ligne(String designation, boolean actif, String cssStyle) {
		super();
	
		this.designation = designation;
		this.actif = actif;
		this.cssStyle = cssStyle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

	@Override
	public String toString() {
		return "Ligne [id=" + id + ", designation=" + designation + ", actif=" + actif + ", cssStyle=" + cssStyle + "]";
	}

}
