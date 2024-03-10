package in.autobahn.api;

import org.springframework.web.bind.annotation.RestController;

import in.autobahn.core.Vehicle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class VehiclesRestController {
@GetMapping("/vehicles")
public Vehicle getVehicles() {
	Vehicle v1= new Vehicle("Toyota","",true, true);
    return v1;
}

}
