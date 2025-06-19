package misionespacial;

import java.util.concurrent.Callable;
public class SistemaComunicacion implements Callable<String> {


    @Override
    public String call() throws Exception {
        Thread.sleep(800);
        return "Comunicaciones: enlace con estacion terrestre establecido. ";
    }
}
