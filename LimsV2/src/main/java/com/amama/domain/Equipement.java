package com.amama.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipement {
	
	@Id
	@GeneratedValue
	private Long id;
	private String designation ;
	private String marque ;
	private String modele;
	private String alimentationelictrique ;
	private String modelePriseCourant  ;
	private Date dateMiseService ;
	private String frequenceVerification ;
	private String frequenceEtalonnage ;
	private String attachementCertificats;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getAlimentationelictrique() {
		return alimentationelictrique;
	}
	public void setAlimentationelictrique(String alimentationelictrique) {
		this.alimentationelictrique = alimentationelictrique;
	}
	public String getModelePriseCourant() {
		return modelePriseCourant;
	}
	public void setModelePriseCourant(String modelePriseCourant) {
		this.modelePriseCourant = modelePriseCourant;
	}
	public Date getDateMiseService() {
		return dateMiseService;
	}
	public void setDateMiseService(Date dateMiseService) {
		this.dateMiseService = dateMiseService;
	}
	public String getFrequenceVerification() {
		return frequenceVerification;
	}
	public void setFrequenceVerification(String frequenceVerification) {
		this.frequenceVerification = frequenceVerification;
	}
	public String getFrequenceEtalonnage() {
		return frequenceEtalonnage;
	}
	public void setFrequenceEtalonnage(String frequenceEtalonnage) {
		this.frequenceEtalonnage = frequenceEtalonnage;
	}
	public String getAttachementCertificats() {
		return attachementCertificats;
	}
	public void setAttachementCertificats(String attachementCertificats) {
		this.attachementCertificats = attachementCertificats;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", designation=" + designation
				+ ", marque=" + marque + ", modele=" + modele
				+ ", alimentationelictrique=" + alimentationelictrique
				+ ", modelePriseCourant=" + modelePriseCourant + ", dateMiseService="
				+ dateMiseService + ", frequenceVerification=" + frequenceVerification
				+ ", frequenceEtalonnage=" + frequenceEtalonnage
				+ ", attachementCertificats=" + attachementCertificats + "]";
	}
	public Equipement(Long id, String designation, String marque, String modele, String alimentationelictrique,
			String modelePriseCourant, Date dateMiseService, String frequenceVerification, String frequenceEtalonnage,
			String attachementCertificats) {
		super();
		this.id = id;
		this.designation = designation;
		this.marque = marque;
		this.modele = modele;
		this.alimentationelictrique = alimentationelictrique;
		this.modelePriseCourant = modelePriseCourant;
		this.dateMiseService = dateMiseService;
		this.frequenceVerification = frequenceVerification;
		this.frequenceEtalonnage = frequenceEtalonnage;
		this.attachementCertificats = attachementCertificats;
	}
	public Equipement(Long id) {
		super();
		this.id = id;
	}
	public Equipement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	


}
