package com.cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cine.model.Funcion;
import com.cine.model.Pelicula;
import com.cine.model.Rol;
import com.cine.model.Usuario;
import com.cine.service.IFuncionServi;
import com.cine.service.IPeliculaServi;
import com.cine.service.IUsuarioServi;

@Controller
public class PaguinaControler {

	@Autowired
	private IPeliculaServi peliculaServi;
	
	@Autowired
	private IFuncionServi funcionServi;
	
	@Autowired
	private IUsuarioServi usuarioServi;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Pelicula> peliculas = peliculaServi.buscarTodos();
		model.addAttribute("peliculas", peliculas);
		model.addAttribute("usuario", new Usuario());
		return "index";
	}
	
	@GetMapping("/login")
	public String loguin(Model model) {
		model.addAttribute("usuario", new Usuario());
		return  "login";
	}
	
	@PostMapping("/ingresar")
	public String ingresarRoles(Usuario usuario) {
		Usuario usuarioValido = usuarioServi.findByUsername(usuario.getUsername());
		if (usuarioValido.getRol().equals(Rol.ROLE_USER))
			return "redirect:/cliente/" +  usuarioValido.getId();
		else if (usuarioValido.getRol().equals(Rol.ROLE_ADMIN))
			return "redirect:/administrador/" +  usuarioValido.getId();
		else if (usuarioValido.getRol().equals(Rol.ROLE_EMPLOYEE))
			return "redirect:/empleado/" +  usuarioValido.getId();
		return "redirect:/login";
	}
	
	@GetMapping("/cliente/{id}")
	public String cliente(@PathVariable int id, Model model) {
		List<Pelicula> peliculas = peliculaServi.buscarTodos();
		model.addAttribute("peliculas", peliculas);
		model.addAttribute("usuario", usuarioServi.buscar(id));
		return "index";
	}
	
	@GetMapping("/registro")
	public String registro() {
		return  "registro";
	}
	
	@GetMapping("/pelicula/{id}")
	public String pelicula(@PathVariable int id, Model model) {
		model.addAttribute("pelicula", peliculaServi.buscar(id));
		List<Funcion> funciones = funcionServi.buscarTodos();
		model.addAttribute("funciones", funciones);
		return "pelicula";
	}
	
	@GetMapping("/compra/{id}")
	public String compra(@PathVariable int id, Model model) {
		model.addAttribute("funcion", funcionServi.buscar(id));
		return "compra";
	}
	
	@GetMapping("/entrada")
	public String entrada() {
		return  "entrada";
	}
	
	@GetMapping("/administrador/{id}")
	public String administrador(@PathVariable int id, Model model) {
		model.addAttribute("usuario", usuarioServi.buscar(id));
		return "administrador";
	}
	
	@GetMapping("/empleado/{id}")
	public String empleado(@PathVariable int id, Model model) {
		model.addAttribute("usuario", usuarioServi.buscar(id));
		return "empleado";
	}
}
