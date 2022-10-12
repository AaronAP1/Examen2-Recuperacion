package upeu.edu.pe.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.dao.*;
import upeu.edu.pe.entity.Ordenes;


@Component
public class OrdenesDaoImpl implements Operaciones<Ordenes> {
	
	@Autowired
	private JdbcTemplate xd;

	

	@Override
	public List<Map<String,Object>> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="select te.TerritoryDescription as Territorio, count(*) as cantidad from customers as c\r\n"
				+ "join orders o on o.CustomerID=c.CustomerID\r\n"
				+ "join employees em on em.EmployeeID=o.EmployeeID\r\n"
				+ "join employeeterritories terr on terr.EmployeeID=em.EmployeeID\r\n"
				+ "join territories te on te.TerritoryID=terr.TerritoryID\r\n"
				+ "group by te.TerritoryDescription\r\n"
				+ "order by TerritoryDescription;";
		return xd.queryForList(SQL);
	}
	
	

}
