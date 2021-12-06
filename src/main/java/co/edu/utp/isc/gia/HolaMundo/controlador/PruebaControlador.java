package co.edu.utp.isc.gia.HolaMundo.controlador;

import co.edu.utp.isc.gia.HolaMundo.modelo.Usuario;
import co.edu.utp.isc.gia.HolaMundo.servicios.PruebaServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba")
@AllArgsConstructor
public class PruebaControlador {

    private PruebaServicio pruebaServicio;

    @PostMapping("guardar")
    public Usuario precesarUsuario(@RequestBody Usuario usuario){
        Usuario usuario1 = pruebaServicio.guardarUsuario(usuario);
       return usuario1;
    }
}
