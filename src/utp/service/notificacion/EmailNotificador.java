package utp.service.notificacion;

import utp.model.usuario.Usuario;

public class EmailNotificador implements Notificador {
    @Override
    public void notificar(Usuario usuario, String mensaje) {
        // Lógica simulada para envío por correo
        System.out.println("Enviando email a " + usuario.getEmail() + ": " + mensaje);
    }
}
