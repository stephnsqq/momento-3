/**
 * Elevador para transporte de personas.
 */
public class ElevadorPasajeros extends Elevador {

    private int personasActuales;
    private int maxPersonas;

    public ElevadorPasajeros(int pisoMaximo, int maxPersonas) {
        super(pisoMaximo);
        this.maxPersonas = maxPersonas;
        this.personasActuales = 0;
    }

    public void entrarPersona() {
        if (personasActuales < maxPersonas) {
            personasActuales++;
            System.out.println("Entró una persona. Total: " + personasActuales);
        } else {
            System.out.println("Elevador lleno.");
        }
    }

    public void salirPersona() {
        if (personasActuales > 0) {
            personasActuales--;
            System.out.println("Salió una persona. Total: " + personasActuales);
        } else {
            System.out.println("No hay personas dentro.");
        }
    }
}
