package upeu.edu.pe.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ordenes implements Serializable {
	private static final long serialVersionUID= 1L ;
	private int OrderID ;
	private String CustomerID;
	private int EmployeeID;
	private String OrderDate;
	private String RequiredDate;
	private String ShippedDate;
	private int ShipVia;
	private double Freigth;
	private String ShipName; 
	private String ShipAdress;
	private String ShipCity;
	private String ShipRegion;
	private String ShipPostalCode;
	private String ShipCountry;

}
