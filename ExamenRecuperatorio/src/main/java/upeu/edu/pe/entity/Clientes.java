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
public class Clientes implements Serializable{
	private static final long serialVersionUID= 1L ;
	private int CustomerID;
	private String CompanyName;
	private String ContactName;
	private String ContactTitle;
	private String Address;
	private String City;
	private String Region;
	private String PostalCode;
	private String Country;
	private String Phone;
	private String Fax;

}
