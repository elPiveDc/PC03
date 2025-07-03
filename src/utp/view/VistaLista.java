package utp.view;

import java.util.List;
import utp.model.tutoria.Tutoria;

public class VistaLista implements VistaTutoria {
    @Override
    public void mostrar(List<Tutoria> tutorias) {
        System.out.println("Mostrando tutorias en formato de lista:");
        for (Tutoria t : tutorias) {
            System.out.println("- Tutoria " + t.getEstado().getNombreEstado());
        }
    }
}
