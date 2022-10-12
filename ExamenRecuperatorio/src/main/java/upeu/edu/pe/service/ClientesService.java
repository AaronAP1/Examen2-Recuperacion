package upeu.edu.pe.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.dao.*;
import upeu.edu.pe.daoImpl.ClientesDaoImpl;
import upeu.edu.pe.entity.Clientes;

@Service
public class ClientesService implements Operaciones<Clientes> {
	
	@Autowired
	private ClientesDaoImpl impl;

	@Override
	public List<Map<String, Object>> reaAll() {
		// TODO Auto-generated method stub
		return impl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
