/**
 * Clase base que representa un elevador simple.
 */
public class Elevador {

    protected int pisoActual;
    protected int pisoMaximo;
    protected boolean puertasAbiertas;

    public Elevador(int pisoMaximo) {
        this.pisoActual = 0;
        this.pisoMaximo = pisoMaximo;
        this.puertasAbiertas = false;
    }

    public void subir() {
        if (pisoActual < pisoMaximo) {
            pisoActual++;
            System.out.println("Subiendo al piso " + pisoActual);
        } else {
            System.out.println("Ya estás en el piso máximo.");
        }
    }

    public void bajar() {
        if (pisoActual > 0) {
            pisoActual--;
            System.out.println("Bajando al piso " + pisoActual);
        } else {
            System.out.println("Ya estás en el primer piso.");
        }
    }

    public void abrirPuertas() {
        puertasAbiertas = true;
        System.out.println("Puertas abiertas");
    }

    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("Puertas cerradas");
    }
}
