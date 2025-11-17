public class Main {

    public static void main(String[] args) {

        System.out.println("=== Ejecución 1 (Elevador carga) ===");
        ElevadorCarga carga = new ElevadorCarga(10, 500);
        carga.subir();
        carga.cargar(200);
        carga.subir();
        carga.descargar(100);
        carga.bajar();

        System.out.println("\n=== Ejecución 2 (Elevador pasajeros) ===");
        ElevadorPasajeros pasajeros = new ElevadorPasajeros(8, 4);
        pasajeros.entrarPersona();
        pasajeros.entrarPersona();
        pasajeros.subir();
        pasajeros.salirPersona();
        pasajeros.bajar();
    }
}
