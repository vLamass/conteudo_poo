import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("Lucas", "12345678911", "Lucas@Gmail,.com");
        Cliente cliente2 = new Cliente("Vinicius", "12345678999", "Vinicius@Gmail.com");

        ItemPedido Monitor = new ItemPedido("Monitor", 1, 900.0);
        ItemPedido Teclado = new ItemPedido("Teclado", 1, 250.0);
        ItemPedido Mouse = new ItemPedido("Mouse", 1, 150.0);

        Pedido pedido1 = new Pedido(1, LocalDate.now(), cliente2, null, null);
        pedido1.adicionarItem(Mouse);
        pedido1.adicionarItem(Teclado);

        Pedido pedido2 = new Pedido(2, LocalDate.now(), cliente2, null, null);
        pedido2.adicionarItem(Mouse);

        pedido1.fecharPedido();

    }

}
