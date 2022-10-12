package upeu.edu.pe.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.dao.*;
import upeu.edu.pe.daoImpl.OrdenesDaoImpl;
import upeu.edu.pe.entity.Ordenes;


@Service
public class OrdenesService implements Operaciones<Ordenes> {
	
	@Autowired
	private OrdenesDaoImpl daoImplOrd;

	

	@Override
	public List<Map<String,Object>> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoImplOrd.readAll2();
	}
	
	

}
