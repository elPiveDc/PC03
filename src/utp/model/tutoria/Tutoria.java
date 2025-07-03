package utp.model.tutoria;

import utp.model.usuario.Estudiante;
import utp.model.usuario.Tutor;
import java.util.Date;
import java.util.List;

public class Tutoria {

    private String id;
    private EstadoTutoria estado;
    private Estudiante estudiante;
    private Tutor tutor;
    private Date fecha;
    private HistorialCambios historial;

    public Tutoria(String id, Estudiante estudiante, Tutor tutor, Date fecha) {
        this.id = id;
        this.estudiante = estudiante;
        this.tutor = tutor;
        this.fecha = fecha;
        this.estado = new Solicitada(); // Estado inicial
        this.historial = new HistorialCambios();
    }

    public void cambiarEstado(EstadoTutoria nuevoEstado) {
        historial.registrarCambio(estado);
        this.estado = nuevoEstado;
        estado.manejar(this);
    }

    public EstadoTutoria getEstado() {
        return estado;
    }

    public HistorialCambios getHistorial() {
        return historial;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
