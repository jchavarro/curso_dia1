package co.edu.utp.isc.gia.HolaMundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("hola")
public class HolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoApplication.class, args);
	}

	@GetMapping("/{nombre}/{apellido}")
	public String holaMundo(@PathVariable("nombre") String nombre,
							@PathVariable("apellido") String apellido){
		return String.format("Hola %s %s", nombre, apellido);
	}

	@GetMapping("")
	public String holaNuevoMundo(@RequestParam("nombre") String nombre,
								 @RequestParam("apellido") String apellido){
		return String.format("Hola %s %s", nombre, apellido);
	}

}
