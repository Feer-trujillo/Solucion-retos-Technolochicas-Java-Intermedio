public class OrdenPrototipo  extends OrdenProduccion{
    private final String faseDesarrollo;



    public OrdenPrototipo (String codigo, int cantidad, String faseDesarrollo){
        super (codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo ;

    }

    @Override
    public void mostrarResumen() {
        System.out.println("OrdenPrototipo - Código: \" + getCodigo() +\n" +
                "                \" - Cantidad: \" + getCantidad() +\n" +
                "                \" - Fase: \" + faseDesarrollo);");
    }
}
