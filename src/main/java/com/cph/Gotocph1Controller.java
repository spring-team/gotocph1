package com.cph;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Gotocph1Controller {

	@GetMapping("/")
	public String root() {
		return "Hello Copenhagen! I'm served by " + getClass().getName();
	}

	@GetMapping("hello/{name}")
	public String person(@PathVariable String name) {
		return "Hello " + name + "!";
	}

}
