package in.autobahn.api;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class VehiclesRestController {
	@GetMapping("/vehicle")
	public ResponseEntity<String> getAll() {
		return new ResponseEntity<>("dd", HttpStatus.OK);
	}

}
