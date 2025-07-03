package utp.comando;

public class SuspenderTutoriaCommand implements ComandoAdministrativo {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando comando: suspender tutoria");
    }

    @Override
    public void deshacer() {
        System.out.println("Deshaciendo comando: suspender tutoria");
    }
}
