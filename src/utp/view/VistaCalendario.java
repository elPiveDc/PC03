package utp.view;

import java.util.List;
import utp.model.tutoria.Tutoria;

public class VistaCalendario implements VistaTutoria {
    @Override
    public void mostrar(List<Tutoria> tutorias) {
        System.out.println("Mostrando tutorias en formato calendario:");
        for (Tutoria t : tutorias) {
            System.out.println("[Dia simulado] Tutoria con estado: " + t.getEstado().getNombreEstado());
        }
    }
}

