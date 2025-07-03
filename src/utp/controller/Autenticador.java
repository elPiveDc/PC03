package utp.controller;

import utp.model.usuario.Usuario;

public class Autenticador {
    public boolean validarAcceso(Usuario usuario) {
        return usuario instanceof utp.model.usuario.Administrador;
    }
}
