package utp.service.notificacion;

import utp.model.usuario.Usuario;

public interface Notificador {
    void notificar(Usuario usuario, String mensaje);
}
