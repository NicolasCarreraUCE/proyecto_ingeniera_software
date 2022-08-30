package com.cine;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cine.model.Asiento;
import com.cine.model.Funcion;
import com.cine.model.Rol;
import com.cine.model.Usuario;
import com.cine.service.IAsientoServi;
import com.cine.service.IFuncionServi;
import com.cine.service.IPeliculaServi;
import com.cine.service.IUsuarioServi;

@SpringBootApplication
public class CineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CineApplication.class, args);
		
	}

	@Autowired
	private IAsientoServi asientoServi;
	
	@Autowired
	private IPeliculaServi peliculaServi;
	
	@Autowired
	private IFuncionServi funcionServi;
	
	@Autowired
	private IUsuarioServi usuarioServi;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Funcion funcion = new Funcion();
//		funcion.setAcientos(asientoServi.buscarTodos());
//		funcion.setHorario(LocalDateTime.of(2022, Month.SEPTEMBER, 6, 8, 0));
//		funcion.setNumeroSala("Sala 1");
//		funcion.setPelicula(peliculaServi.buscar(1));
//
//		funcionServi.insertar(funcion);
//		
//		Funcion funcion2 = new Funcion();
//		funcion2.setHorario(LocalDateTime.of(2022, Month.SEPTEMBER, 6, 10, 0));
//		funcion2.setNumeroSala("Sala 1");
//		funcion2.setPelicula(peliculaServi.buscar(1));
//
//		funcionServi.insertar(funcion2);
//		
//		Funcion funcion3 = new Funcion();
//		funcion3.setHorario(LocalDateTime.of(2022, Month.SEPTEMBER, 6, 12, 0));
//		funcion3.setNumeroSala("Sala 1");
//		funcion3.setPelicula(peliculaServi.buscar(1));
//
//		funcionServi.insertar(funcion3);
//		
//		Funcion funcion4 = new Funcion();
//		funcion4.setHorario(LocalDateTime.of(2022, Month.SEPTEMBER, 6, 14, 0));
//		funcion4.setNumeroSala("Sala 1");
//		funcion4.setPelicula(peliculaServi.buscar(1));
//
//		funcionServi.insertar(funcion4);
//		
//		Funcion funcion5 = new Funcion();
//		funcion5.setHorario(LocalDateTime.of(2022, Month.SEPTEMBER, 6, 16, 0));
//		funcion5.setNumeroSala("Sala 1");
//		funcion5.setPelicula(peliculaServi.buscar(1));
//
//		funcionServi.insertar(funcion5);

//		Function<Integer, String> fn = (x) -> {
//		switch (x) {
//			case 0:
//				return "A";
//			case 1:
//				return "B";
//			case 2:
//				return "C";
//			case 3:
//				return "D";
//			case 4:
//				return "E";
//			case 5:
//				return "F";
//			case 6:
//				return "G";
//			case 7:
//				return "H";
//			default:
//				return "-1";
//		}
//	};
//	for (int i = 0; i < 5; i++) {
//		for (int j = 0; j < 5; j++) {
//			Asiento aciento = new Asiento();
//			aciento.setFuncion(funcionServi.buscar(1));
//			aciento.setDisponible(true);
//			aciento.setNumero(fn.apply(i) + "-" + (j + 1));
//			asientoServi.insertar(aciento);
//		}
//	}
//
//		
//		Usuario administrador = new Usuario();
//		administrador.setUsername("root");
//		administrador.setPassword("root");
//		administrador.setRol(Rol.ROLE_ADMIN);
//		
//		usuarioServi.insertar(administrador);
//		
//		Usuario empleado = new Usuario();
//		empleado.setUsername("Juan");
//		empleado.setPassword("123");
//		empleado.setRol(Rol.ROLE_EMPLOYEE);
//		
//		usuarioServi.insertar(empleado);
//		
//		Usuario usuario = new Usuario();
//		usuario.setUsername("Nicolas");
//		usuario.setPassword("123");
//		usuario.setRol(Rol.ROLE_USER);
//		
//		usuarioServi.insertar(usuario);
	}

}
