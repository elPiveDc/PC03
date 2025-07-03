package utp.model.tutoria;

import java.util.Stack;

public class HistorialCambios {
    private Stack<EstadoTutoria> historial;

    public HistorialCambios() {
        this.historial = new Stack<>();
    }

    public void registrarCambio(EstadoTutoria estado) {
        historial.push(estado);
    }

    public EstadoTutoria deshacerUltimoCambio() {
        return historial.isEmpty() ? null : historial.pop();
    }

    public Stack<EstadoTutoria> getHistorial() {
        return historial;
    }
}
