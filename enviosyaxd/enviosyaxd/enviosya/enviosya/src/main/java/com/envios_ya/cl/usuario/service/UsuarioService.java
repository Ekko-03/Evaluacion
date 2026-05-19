package com.envios_ya.cl.enviosya.service;

import com.envios_ya.cl.enviosya.model.Usuario;
import com.envios_ya.cl.enviosya.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    // CORRECCIÓN: Se cambia 'long' por 'Integer'
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario save (Usuario run) {
        return usuarioRepository.save(run);
    }

    // CORRECCIÓN: Se cambia 'Long' por 'Integer'
    public void delete (Integer id) {
        usuarioRepository.deleteById(id);
    }
}
