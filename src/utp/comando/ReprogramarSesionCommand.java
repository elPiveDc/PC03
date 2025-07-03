package utp.comando;
public class ReprogramarSesionCommand implements ComandoAdministrativo {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando comando: reprogramar sesion");
    }

    @Override
    public void deshacer() {
        System.out.println("Deshaciendo comando: reprogramar sesion");
    }
}
