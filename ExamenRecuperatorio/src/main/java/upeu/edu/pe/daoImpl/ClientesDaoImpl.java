package upeu.edu.pe.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.dao.*;
import upeu.edu.pe.entity.Clientes;

@Component
public class ClientesDaoImpl implements Operaciones<Clientes>  {
	
	@Autowired
	private JdbcTemplate aaa;

	@Override
	public List<Map<String,Object>> reaAll() {
		// TODO Auto-generated method stub
		String SQL="select r.RegionDescription as region, count(*) as cantidad from orders as o\r\n"
				+ "join customers as c on c.CustomerID=o.CustomerID\r\n"
				+ "join employees as e on e.EmployeeID=o.EmployeeID\r\n"
				+ "join employeeterritories as tr on tr.EmployeeID=e.EmployeeID\r\n"
				+ "join territories as te on te.TerritoryID=tr.TerritoryID\r\n"
				+ "join region as r on r.RegionID=te.RegionID\r\n"
				+ "group by r.RegionDescription\r\n"
				+ "order by RegionDescription;";
		return aaa.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
