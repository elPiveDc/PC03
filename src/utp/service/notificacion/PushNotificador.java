package utp.service.notificacion;

import utp.model.usuario.Usuario;

public class PushNotificador implements Notificador {
    @Override
    public void notificar(Usuario usuario, String mensaje) {
        // Envío por push o sistema interno
        System.out.println("Enviando push a " + usuario.getNombre() + ": " + mensaje);
    }
}
