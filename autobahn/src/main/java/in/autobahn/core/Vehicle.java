package in.autobahn.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Vehicle {
	private String Brand;
	private String Model;
private Boolean isAvailable;
private Boolean forSale;
}
