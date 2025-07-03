package app;

import java.util.*;

import utp.model.usuario.*;

public class Main {

    private static Map<String, Usuario> baseUsuarios = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cargarUsuarios();

        System.out.println("=== Bienvenido al sistema de tutorias ===");
        System.out.print("Ingrese su ID: ");
        String id = scanner.nextLine();

        Usuario usuario = baseUsuarios.get(id);

        if (usuario == null) {
            System.out.println("Usuario no encontrado. Finalizando.");
            return;
        }

        System.out.println("Hola " + usuario.getNombre() + ", usted ha iniciado sesion como: " + usuario.getClass().getSimpleName());
        mostrarMenu(usuario);
    }

    private static void cargarUsuarios() {
        baseUsuarios.put("E001", new Estudiante("E001", "Carlos", "carlos@correo.com"));
        baseUsuarios.put("T001", new Tutor("T001", "Laura", "laura@correo.com"));
        baseUsuarios.put("A001", new Administrador("A001", "Marco", "marco@correo.com"));
    }

    private static void mostrarMenu(Usuario usuario) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menu principal ---");
            if (usuario instanceof Estudiante) {
                System.out.println("1. Solicitar tutoria");
                System.out.println("2. Ver notificacion (simulada)");
            } else if (usuario instanceof Tutor) {
                System.out.println("1. Aceptar tutoria");
                System.out.println("2. Rechazar tutoria");
                System.out.println("3. Ver notificacion (simulada)");
            } else if (usuario instanceof Administrador) {
                System.out.println("1. Asignar tutor");
                System.out.println("2. Reprogramar sesion");
                System.out.println("3. Suspender tutoria");
                System.out.println("4. Deshacer ultima accion");
                System.out.println("5. Ver notificacion (simulada)");
            }

            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    if (usuario instanceof Estudiante) {
                        ((Estudiante) usuario).solicitarTutoria();
                    } else if (usuario instanceof Tutor) {
                        ((Tutor) usuario).aceptarTutoria();
                    } else if (usuario instanceof Administrador) {
                        ((Administrador) usuario).asignarTutor();
                    }
                    break;
                case "2":
                    if (usuario instanceof Tutor) {
                        ((Tutor) usuario).rechazarTutoria();
                    } else if (usuario instanceof Administrador) {
                        ((Administrador) usuario).reprogramarSesion();
                    } else if (usuario instanceof Estudiante) {
                        usuario.recibirNotificacion("Tu solicitud esta en revision");
                    }
                    break;
                case "3":
                    if (usuario instanceof Administrador) {
                        ((Administrador) usuario).suspenderTutoria();
                    } else if (usuario instanceof Tutor) {
                        usuario.recibirNotificacion("Tienes nuevas solicitudes pendientes");
                    }
                    break;
                case "4":
                    if (usuario instanceof Administrador) {
                        ((Administrador) usuario).deshacerUltimaAccion();
                    }
                    break;
                case "5":
                    if (usuario instanceof Administrador) {
                        usuario.recibirNotificacion("Recordatorio de sesion modificada");
                    }
                    break;
                case "0":
                    salir = true;
                    System.out.println("Sesion finalizada. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
