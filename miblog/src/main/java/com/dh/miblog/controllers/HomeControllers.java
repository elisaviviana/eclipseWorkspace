package com.dh.miblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import servicios.MiInterfazServicio;

@Controller
public class HomeControllers {
	@Autowired
	 //private CocineroService(nombreInterfaz) unCocineroService;
	@Qualifier("servA")
	private MiInterfazServicio miAServicio;
	
	@Autowired
	 //private CocineroService(nombreInterfaz) unCocineroService;
	@Qualifier("servB")
	private MiInterfazServicio miBServicio;
	

	/**
	 * mapea "/" hacia la pagina home.html
	 * 
	 * @return home.html
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	/**
	 * Con GetMapping es mas corto, igual a RequestMapping con metodo Get
	 * 
	 * @param mod1
	 * @return
	 */
	@GetMapping("/miblog")
	public String personal(Model modl) {
		return "personal";
	}

	@RequestMapping(value = "/porfolio", method = RequestMethod.GET)
	public String porfolio() {
		return "porfolio";
	}

}
