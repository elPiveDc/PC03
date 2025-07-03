package utp.model.usuario;

public class Administrador extends Usuario {

    public Administrador(String id, String nombre, String email) {
        super(id, nombre, email);
    }

    public void asignarTutor() {
        System.out.println("Administrador " + nombre + " ha asignado un tutor");
    }

    public void reprogramarSesion() {
        System.out.println("Administrador " + nombre + " ha reprogramado una sesion");
    }

    public void suspenderTutoria() {
        System.out.println("Administrador " + nombre + " ha suspendido una tutoria");
    }

    public void deshacerUltimaAccion() {
        System.out.println("Administrador " + nombre + " ha deshecho la ultima accion");
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificacion para administrador " + nombre + ": " + mensaje);
    }
}
