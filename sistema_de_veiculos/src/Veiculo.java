import interfaces.fretavel;
import interfaces.tributavel;

public abstract sealed class Veiculo implements fretavel, tributavel
        permits Caminhao, CarroPasseio {

    protected final String placa;
    protected final String marca;
    protected final double valorLocacaoDiaria;
    protected final int anoFabricacao;
    protected final double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe)
            throws Exception {

        if (placa == null || placa.isEmpty())
            throw new Exception("Placa Invalida. ");

        if (marca == null || marca.isEmpty())
            throw new Exception("Marca Invalida. ");

        if (valorLocacaoDiaria <= 0)
            throw new Exception("Valor da Diária Invalido. ");

        if (anoFabricacao < 1886 || anoFabricacao > calcularIdade())
            throw new Exception("Ano inválido. Deve ter 4 dígitos e ser um ano válido. ");

        if (precoFipe <= 0)
            throw new Exception("Preço FIPE Invalido. ");

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }

    protected int calcularIdade() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoFabricacao;
    }

}
