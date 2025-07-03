
package utp.comando;
public class AsignarTutorCommand implements ComandoAdministrativo {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando comando: asignar tutor");
    }

    @Override
    public void deshacer() {
        System.out.println("Deshaciendo comando: asignar tutor");
    }
}
