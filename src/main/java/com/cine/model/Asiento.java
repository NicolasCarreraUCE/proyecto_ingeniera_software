package com.cine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "asiento")
public class Asiento {

	@Id
	@Column(name = "asie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_asiento") 
	@SequenceGenerator(name = "seq_asiento", sequenceName = "seq_asiento", allocationSize = 1)
	private Integer id;
	
	@Column(name = "asie_disponible")
	private Boolean disponible;
	@Column(name = "asie_numero")
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "func_id")
	private Funcion funcion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	
}
