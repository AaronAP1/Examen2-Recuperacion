package upeu.edu.pe.controller;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.service.ClientesService;

@RestController
@RequestMapping("/api/consultaCL")
public class ClientesController {
	
	@Autowired
	private ClientesService cliSer;
	
	@GetMapping("/clientes_region")
	public List<Map<String, Object>> reaAll() {
		return cliSer.reaAll();
	}

 }
