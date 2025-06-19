
import java.util.concurrent.*;

public class AppMovilidad {

    public static void main (String [] args){
        System.out.println("Iniciando la simulación del viaje......");

        CompletableFuture<String> rutaFuture = calcularRuta ();
        CompletableFuture<Double> tarifaFuture = estimarTarifa();


        CompletableFuture<Void> viajeCompleto = rutaFuture.thenCombine(tarifaFuture,
                        (ruta, tarifa) -> {
                            return " Ruta calculada: " + ruta + " | Tarifa estimada: $" + tarifa;
                        })
                .thenAccept(System.out::println)
                .exceptionally(ex -> {
                    System.out.println(" Error al procesar el viaje: " + ex.getMessage());
                    return null;
                });


        viajeCompleto.join();
    }

    public static CompletableFuture<String> calcularRuta() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Calculando ruta...");
            dormir(3);
            return "Centro -> Norte";
        });
    }


    public static CompletableFuture<Double> estimarTarifa() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(" Estimando tarifa...");
            dormir(2);
            return 75.50;
        });
    }


    public static void dormir(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}