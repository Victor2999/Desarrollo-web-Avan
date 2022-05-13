package com.Victor.Practica1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
@GetMapping("/")
public String saludo() {
	return "ejemplo";
}

@GetMapping("Ejemplo1")
public String saludo1() {
	return "ejemplo1";
}
}
