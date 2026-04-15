public class ItemPedido {

    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return this.quantidade * this.precoUnitario;

    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
