package com.envios_ya.cl.enviosya.repository;

import com.envios_ya.cl.enviosya.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByApellido(String apellido);
    Usuario findByCorreo(String correo);
    Usuario findByDireccion(String direccion);
    Usuario findByCodigoPostal(Integer codigoPostal);
}
