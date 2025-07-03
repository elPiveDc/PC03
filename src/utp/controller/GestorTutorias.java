package utp.controller;

import utp.model.tutoria.Tutoria;
import java.util.List;
import java.util.ArrayList;

public class GestorTutorias {
    private List<Tutoria> tutorias = new ArrayList<>();

    public void registrarTutoria(Tutoria t) {
        tutorias.add(t);
    }

    public List<Tutoria> obtenerTutoriasPorEstudiante(String estudianteId) {
        return tutorias.stream()
            .filter(t -> t.getEstudiante().getId().equals(estudianteId))
            .toList();
    }

    public void cambiarEstadoTutoria(Tutoria tutoria, utp.model.tutoria.EstadoTutoria nuevoEstado) {
        tutoria.cambiarEstado(nuevoEstado);
    }
}
