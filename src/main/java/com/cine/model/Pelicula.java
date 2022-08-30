package com.cine.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@Column(name = "peli_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pelicula") 
	@SequenceGenerator(name = "seq_pelicula", sequenceName = "seq_pelicula", allocationSize = 1)
	private Integer id;
	
	@Column(name = "peli_portada")
	private String portada;
	@Column(name = "peli_titulo")
	private String titulo;
	@Column(name = "peli_sinopsis")
	private String sinopsis;
	@Column(name = "peli_duracion")
	private String duracion;
	@Column(name = "peli_genero")
	private String genero;
	
	@OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Funcion> funciones;

	public Integer getId() {
		return id;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
