/**
 * Elevador especializado para carga pesada.
 */
public class ElevadorCarga extends Elevador {

    private double pesoMaximo;
    private double pesoActual;

    public ElevadorCarga(int pisoMaximo, double pesoMaximo) {
        super(pisoMaximo);
        this.pesoMaximo = pesoMaximo;
        this.pesoActual = 0;
    }

    public void cargar(double peso) {
        if (pesoActual + peso <= pesoMaximo) {
            pesoActual += peso;
            System.out.println("Cargando " + peso + " kg. Actual: " + pesoActual);
        } else {
            System.out.println("Exceso de peso, no se puede cargar.");
        }
    }

    public void descargar(double peso) {
        pesoActual = Math.max(0, pesoActual - peso);
        System.out.println("Descargando. Actual: " + pesoActual);
    }
}
