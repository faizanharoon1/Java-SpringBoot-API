package in.autobahn.api;

import org.springframework.web.bind.annotation.RestController;

import in.autobahn.core.Tool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ToolsRestController {
@GetMapping("/tools")
public String getTools() {
	Tool t = new Tool("Wrench");
    return t.getName();
}

}
