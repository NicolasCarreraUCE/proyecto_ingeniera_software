package com.cine.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "funcion")
public class Funcion {

	@Id
	@Column(name = "func_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_funcion") 
	@SequenceGenerator(name = "seq_funcion", sequenceName = "seq_funcion", allocationSize = 1)
	private Integer id;
	
	@Column(name = "func_numero_sala")
	private String numeroSala;
	
	@Column(name = "func_horario")
	private LocalDateTime horario;
	
	@OneToMany(mappedBy = "funcion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Asiento> acientos;
	
	@ManyToOne
	@JoinColumn(name = "peli_id")
	private Pelicula pelicula;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public List<Asiento> getAcientos() {
		return acientos;
	}

	public void setAcientos(List<Asiento> acientos) {
		this.acientos = acientos;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
}
