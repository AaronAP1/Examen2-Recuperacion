package upeu.edu.pe.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.service.OrdenesService;

@RestController
@RequestMapping("/api/consultaOR")
public class OrdenesController {
	
	@Autowired
	private OrdenesService ordenSer;
	
	@GetMapping("/ordenes_territorio")
	public List<Map<String, Object>> readAll2(){
		return ordenSer.readAll2();
	}
	
	

}
