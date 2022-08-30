package com.cine.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cine.model.Asiento;
import com.cine.model.Funcion;
import com.cine.model.Pelicula;
import com.cine.service.IFuncionServi;
import com.cine.service.IPeliculaServi;

@Controller
@RequestMapping
public class PeliculaController {

	@Autowired
	private IPeliculaServi peliculaServi;
	
	@Autowired
	private IFuncionServi funcionServi;

	// CRUD pelicula
	@GetMapping("/listar/peliculas")
	public String listarPelicula(Model model) {
		List<Pelicula> peliculas = peliculaServi.buscarTodos();
		model.addAttribute("peliculas", peliculas);
		return "pelicula_lista";
	}
	
	@GetMapping("/crear/pelicula")
	public String agregarPelicula(Model model) {
		model.addAttribute("pelicula", new Pelicula());
		return "pelicula_formulario";
	}
	
	@PostMapping("/guardar/pelicula")
    public String guardarPelicula(Pelicula pelicula, @RequestParam("file") MultipartFile imagen) {
        if (!imagen.isEmpty()) {
            Path directorioImagenes = Paths.get("src//main//resources//static/images");
            String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
             
            try {
                
                byte[] bytesImg = imagen.getBytes();
                Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
                Files.write(rutaCompleta, bytesImg);
                
                pelicula.setPortada(imagen.getOriginalFilename());
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        peliculaServi.insertar(pelicula);
        return "redirect:/listar/peliculas";
    }
	
	@GetMapping("/editar/pelicula/{id}")
	public String editarPelicula(@PathVariable int id, Model model) {
		model.addAttribute("pelicula", peliculaServi.buscar(id));
		return "pelicula_formulario";
	}
	
	@GetMapping("/eliminar/pelicula/{id}")
	public String eliminarPelicula(@PathVariable int id, Model model) {
		peliculaServi.eliminar(id);
		return "redirect:/listar/peliculas";
	}
	
	// CRUD funcion
	@GetMapping("/listar/funcion")
	public String listar(Model model) {
		List<Funcion> funciones = funcionServi.buscarTodos();
		model.addAttribute("funciones", funciones);
		return "funcion_lista";
	}
	
	@GetMapping("/crear/funcion")
	public String agregar(Model model) {
		model.addAttribute("funcion", new Funcion());
		return "funcion_formulario";
	}
	
	@PostMapping("/guardar/funcion")
    public String guardar(Funcion funcion, @RequestParam("pelicula") String peliId) {   
		//funcion.setPelicula(peliculaServi.buscar(Integer.parseInt(peliId)));
		System.out.println(Integer.parseInt(peliId));
//		List<Asiento> acientos = new ArrayList<>();
//		Function<Integer, String> fn = (x) -> {
//			switch (x) {
//				case 0:
//					return "A";
//				case 1:
//					return "B";
//				case 2:
//					return "C";
//				case 3:
//					return "D";
//				case 4:
//					return "E";
//				case 5:
//					return "F";
//				case 6:
//					return "G";
//				case 7:
//					return "H";
//				default:
//					return "-1";
//			}
//		};
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				Asiento aciento = new Asiento();
//				aciento.setDisponible(true);
//				aciento.setNumero(fn.apply(i) + "-" + (j + 1));
//				acientos.add(aciento);
//			}
//		}
//		funcion.setAcientos(acientos);
        //funcionServi.insertar(funcion);
        return "redirect:/listar/funcion";
    }
	
	@GetMapping("/editar/funcion/{id}")
	public String editar(@PathVariable int id, Model model) {
		model.addAttribute("funcion", funcionServi.buscar(id));
		return "pelicula_formulario";
	}
	
	@GetMapping("/eliminar/funcion/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		funcionServi.eliminar(id);
		return "redirect:/listar/funcion";
	}
}
