package utp.model.usuario;

public class Estudiante extends Usuario {

    public Estudiante(String id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void solicitarTutoria() {
        System.out.println("Estudiante " + nombre + " ha solicitado una tutoria");
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificacion para estudiante " + nombre + ": " + mensaje);
    }
}
