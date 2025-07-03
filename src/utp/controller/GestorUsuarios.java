package utp.controller;

import utp.model.usuario.Usuario;
import java.util.Map;
import java.util.HashMap;

public class GestorUsuarios {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public Usuario obtenerUsuario(String id) {
        return usuarios.get(id);
    }

    public boolean esAdministrador(String id) {
        Usuario u = usuarios.get(id);
        return u instanceof utp.model.usuario.Administrador;
    }
}
