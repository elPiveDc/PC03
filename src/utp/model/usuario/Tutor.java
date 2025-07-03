package utp.model.usuario;

public class Tutor extends Usuario {

    public Tutor(String id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void aceptarTutoria() {
        System.out.println("Tutor " + nombre + " ha aceptado la tutoria");
    }

    public void rechazarTutoria() {
        System.out.println("Tutor " + nombre + " ha rechazado la tutoria");
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificacion para tutor " + nombre + ": " + mensaje);
    }
}
