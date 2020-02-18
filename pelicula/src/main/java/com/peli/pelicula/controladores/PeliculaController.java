package com.peli.pelicula.controladores;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peli.pelicula.entidades.Pelicula;
import com.peli.pelicula.servicios.PeliculaService;
	
	
	@Controller
	@RequestMapping("/peliculas") 
	public class PeliculaController {
		
		//Inyección de dependencia 
		@Autowired
		private PeliculaService peliServicio;
		
		@GetMapping("")
		public String home() {
			return "home.html";
		}

		
		@GetMapping("/agregar")
		public String agregarPeli(Model model) {
			model.addAttribute("modelAgregarPeli", new Pelicula()); //instancia el objeto pelicula y se lo pasa al html
			return "agregarPelicula";
		}

		//		recibe los datos del formulario
		@PostMapping("/guardar")  
		public String agregarPelicula(@ModelAttribute Pelicula modelAgregarPeli, BindingResult result, Model model) {
			try {
//				peliServicio.guardarPelicula(modelAgregarPeli);
				peliServicio.guardar(modelAgregarPeli); //de aqui llamo al servicio.. no con un new.. sino con inyeccion
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "home";
			}

		
		@GetMapping("/buscar")
		public String buscarPeli() {
			return "buscarPelicula";
		}
		

		
	
	}



