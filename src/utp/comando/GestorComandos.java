
package utp.comando;


import java.util.Stack;

public class GestorComandos {
    private Stack<ComandoAdministrativo> historial = new Stack<>();

    public void ejecutarComando(ComandoAdministrativo comando) {
        comando.ejecutar();
        historial.push(comando);
    }

    public void deshacerUltimoComando() {
        if (!historial.isEmpty()) {
            ComandoAdministrativo ultimo = historial.pop();
            ultimo.deshacer();
        } else {
            System.out.println("No hay comandos para deshacer");
        }
    }
}
