package com.amama.domain;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Intervention {
	@Id
	@GeneratedValue
	private Long id ;
	private String typeIntervention;
	
	 @ManyToOne
	 @JoinColumn(name = "referenceEquip")
	private Equipement referenceEquip;
	 
	private Date dateSortie;
	
	@JsonFormat(pattern = "HH:mm")
	//@JsonDeserialize(using = SqlTimeDeserializer.class)
	private Timestamp heuresortie;
	private String typeIntervenan;
	private String inetervenant;
	private Date dateRetour;
	
	@JsonFormat(pattern = "HH:mm")
	//@JsonDeserialize(using = SqlTimeDeserializer.class)
	private Timestamp heureRetour;
	private String verification;
	private String verificateur;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeIntervention() {
		return typeIntervention;
	}
	public void setTypeIntervention(String typeIntervention) {
		this.typeIntervention = typeIntervention;
	}
	public Equipement getReferenceEquip() {
		return referenceEquip;
	}
	public void setReferenceEquip(Equipement referenceEquip) {
		this.referenceEquip = referenceEquip;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Timestamp getHeuresortie() {
		return heuresortie;
	}
	public void setHeuresortie(Timestamp heuresortie) {
		this.heuresortie = heuresortie;
	}
	public String getTypeIntervenan() {
		return typeIntervenan;
	}
	public void setTypeIntervenan(String typeIntervenan) {
		this.typeIntervenan = typeIntervenan;
	}
	public String getInetervenant() {
		return inetervenant;
	}
	public void setInetervenant(String inetervenant) {
		this.inetervenant = inetervenant;
	}
	public Date getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	public Timestamp getHeureRetour() {
		return heureRetour;
	}
	public void setHeureRetour(Timestamp heureRetour) {
		this.heureRetour = heureRetour;
	}
	public String getVerification() {
		return verification;
	}
	public void setVerification(String verification) {
		this.verification = verification;
	}
	public String getVerificateur() {
		return verificateur;
	}
	public void setVerificateur(String verificateur) {
		this.verificateur = verificateur;
	}
	public Intervention(Long id, String typeIntervention, Equipement referenceEquip, Date dateSortie,Timestamp heuresortie,
			String typeIntervenan, String inetervenant, Date dateRetour, Timestamp heureRetour, String verification,
			String verificateur) {
		super();
		this.id = id;
		this.typeIntervention = typeIntervention;
		this.referenceEquip = referenceEquip;
		this.dateSortie = dateSortie;
		this.heuresortie = heuresortie;
		this.typeIntervenan = typeIntervenan;
		this.inetervenant = inetervenant;
		this.dateRetour = dateRetour;
		this.heureRetour = heureRetour;
		this.verification = verification;
		this.verificateur = verificateur;
	}
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Intervention(Long id) {
		super();
		this.id = id;
	}
	
	
	

}
