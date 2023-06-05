package com.proyectojava.proyecto.dao;

import com.proyectojava.proyecto.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtenerEmailConCredenciales(Usuario usuario);
}
