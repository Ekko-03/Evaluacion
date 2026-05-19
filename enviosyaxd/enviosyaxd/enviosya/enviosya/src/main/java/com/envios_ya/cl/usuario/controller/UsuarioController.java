package com.envios_ya.cl.enviosya.controller;

import com.envios_ya.cl.enviosya.dto.UsuarioDTO;
import com.envios_ya.cl.enviosya.model.Usuario;
import com.envios_ya.cl.enviosya.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        List<Usuario> usuarios = usuarioService.findAll();
        if (usuarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerPorId(@PathVariable Integer id) {
        Usuario usuario = usuarioService.findById(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@Valid @RequestBody UsuarioDTO dto) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setRun(dto.getRun());
        nuevoUsuario.setNombre(dto.getNombre());
        nuevoUsuario.setApellido(dto.getApellido());
        nuevoUsuario.setCodigoPostal(dto.getCodigoPostal());
        nuevoUsuario.setDireccion(dto.getDireccion());
        nuevoUsuario.setCorreo(dto.getCorreo());
        nuevoUsuario.setNumeroTelefono(dto.getNumeroTelefono());
        nuevoUsuario.setFechaNacimiento(dto.getFechaNacimiento());

        Usuario usuarioGuardado = usuarioService.save(nuevoUsuario);
        return new ResponseEntity<>(usuarioGuardado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Integer id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}