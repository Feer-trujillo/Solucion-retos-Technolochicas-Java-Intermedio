import java.util.List;
import java.util.Optional;

public class ConfirmacionPedidos {


    public static void main (String [] args){
        List<Pedido> pedido = List.of(
                new Pedido("Juan", "domicilio", "555-1234"),
                new Pedido("María", "local", null),
                new Pedido("Carlos", "domicilio", null),
                new Pedido("Luisa", "domicilio", "555-5678")

        );


        List<String> mensajes = pedido.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio")) // 🔍 Filtrar por entrega a domicilio
                .map(Pedido::getTelefono) // 🔄 Transformar Pedido → Optional<String>
                .filter(Optional::isPresent) // 🔍 Filtrar los Optional con valor
                .map(Optional::get) //  Exrtdel Optional
                .map(tel -> " Confirmación enviada al número: " + tel) //  Crear mensaje
                .toList(); // 📦 Recolectar



        System.out.println(" Confirmaciones de pedidos a domicilio:");
        mensajes.forEach(System.out::println);
    }
}
