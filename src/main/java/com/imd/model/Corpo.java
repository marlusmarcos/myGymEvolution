package com.imd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Corpo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double peso;
	
	private Double ombros;
	
	private Double bicepsDir;
	
	private Double bicepsEsq;
	
	private Double antDir;
	
	private Double antEsq;
	
	private Double peitoral;
	
	private Double abdomem;
	
	private Double quadril;
	
	private Double gluteo;
	
	private Double pernaDir;
	
	private Double pernaEsq;
	
	private Double pantDir;
	
	private Double pantEsq;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getOmbros() {
		return ombros;
	}

	public void setOmbros(Double ombros) {
		this.ombros = ombros;
	}

	public Double getBicepsDir() {
		return bicepsDir;
	}

	public void setBicepsDir(Double bicepsDir) {
		this.bicepsDir = bicepsDir;
	}

	public Double getBicepsEsq() {
		return bicepsEsq;
	}

	public void setBicepsEsq(Double bicepsEsq) {
		this.bicepsEsq = bicepsEsq;
	}

	public Double getAntDir() {
		return antDir;
	}

	public void setAntDir(Double antDir) {
		this.antDir = antDir;
	}

	public Double getAntEsq() {
		return antEsq;
	}

	public void setAntEsq(Double antEsq) {
		this.antEsq = antEsq;
	}

	public Double getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(Double peitoral) {
		this.peitoral = peitoral;
	}

	public Double getAbdomem() {
		return abdomem;
	}

	public void setAbdomem(Double abdomem) {
		this.abdomem = abdomem;
	}

	public Double getQuadril() {
		return quadril;
	}

	public void setQuadril(Double quadril) {
		this.quadril = quadril;
	}

	public Double getGluteo() {
		return gluteo;
	}

	public void setGluteo(Double gluteo) {
		this.gluteo = gluteo;
	}

	public Double getPernaDir() {
		return pernaDir;
	}

	public void setPernaDir(Double pernaDir) {
		this.pernaDir = pernaDir;
	}

	public Double getPernaEsq() {
		return pernaEsq;
	}

	public void setPernaEsq(Double pernaEsq) {
		this.pernaEsq = pernaEsq;
	}

	public Double getPantDir() {
		return pantDir;
	}

	public void setPantDir(Double pantDir) {
		this.pantDir = pantDir;
	}

	public Double getPantEsq() {
		return pantEsq;
	}

	public void setPantEsq(Double pantEsq) {
		this.pantEsq = pantEsq;
	}
	
	
	
	

}
