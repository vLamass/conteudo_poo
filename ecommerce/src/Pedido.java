
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer numeroPedido;
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Double total;
    private Double entrega_total;

    public Pedido(Integer numeroPedido, LocalDate data, Cliente cliente, List<ItemPedido> itens, Double total) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.total = 0.0;

    }

    public void adicionarItem(ItemPedido objeto) {
        ItemPedido item = new ItemPedido(objeto.getNomeProduto(), objeto.getQuantidade(), objeto.getPrecoUnitario());
        this.itens.add(item);

    }

    public void calcularTotalItens() {
        for (ItemPedido item : itens) {
            this.total += item.calcularSubtotal();
        }

    }

    public void fecharPedido() {
        calcularTotalItens();
        Double frete = (this.total < 250.0) ? 0.0 : 25.0;
        this.entrega_total = this.total + frete;

        System.out.println("===== RECIBO =====");
        System.out.println("Numero do Pedido: " + numeroPedido);
        System.out.println("Data do Pedido: " + LocalDate.now());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Email: " + cliente.getEmail());

        System.out.println("===== ITENS DO PEDIDO =====");
        for (ItemPedido item : itens) {
            System.out.println(" ");
            System.out.println("Nome Do Produto: " + item.getNomeProduto());
            System.out.println("Preço Da Unidade: " + item.getPrecoUnitario());
            System.out.println(" ");
        }

        System.out.println("=========================");
        System.out.println("Total dos Itens: " + this.itens.size());
        System.out.println("Frete : " + frete);
        System.out.println("Total Da Compra: " + this.entrega_total);
        System.out.println("=========================");
    }

}
