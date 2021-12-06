package co.edu.utp.isc.gia.HolaMundo.servicios;

import co.edu.utp.isc.gia.HolaMundo.modelo.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PruebaServicio {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario guardarUsuario(Usuario usuario){
        if (usuarios.isEmpty()){
            usuario.setId(0);
        } else {
            usuario.setId(usuarios.size());
        }
        usuarios.add(usuario);
        Usuario usuario1 = Usuario.builder().apellido("chavarro")
                .nombre("camilo").build();
        return usuario;

    }

}
