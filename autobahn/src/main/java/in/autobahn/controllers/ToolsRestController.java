package in.autobahn.controllers;

import org.springframework.web.bind.annotation.RestController;

import in.autobahn.core.entities.Tool;
import in.autobahn.core.interfaces.IToolsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ToolsRestController {
	@Autowired
	private IToolsService _toolService;
	
	@GetMapping("path")
	public String getMethodName(@RequestParam String param) {
	    return param;
	}
	@PostMapping("tool")
	public ResponseEntity<Tool> createTool(@RequestBody Tool tool) {
		return new ResponseEntity<>( _toolService.upsert(tool), HttpStatus.OK);
	}
	@GetMapping("tools")
	public ResponseEntity<List<Tool>> getTools() {
		return new ResponseEntity<>( _toolService.getALL(), HttpStatus.OK);
	}

}
