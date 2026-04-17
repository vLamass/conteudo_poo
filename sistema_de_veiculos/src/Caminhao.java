
public final class Caminhao extends Veiculo {

    private final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe,
            double capacidadeCargaToneladas) throws Exception {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if (capacidadeCargaToneladas < 0)
            throw new Exception("Capacidade de Carga Invalida. ");

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculos(double pesoCarga, double dias) throws Exception {

        if (pesoCarga < 0 || dias <= 0)
            throw new Exception("Parâmetros Invalidos. ");

        double total = valorLocacaoDiaria * dias;

        if (pesoCarga > capacidadeCargaToneladas)
            total *= 1.10;

        return total;
    }

    @Override
    public double calcularIpva() {

        if (calcularIdade() > 20)
            return 0.0;

        else {
            return precoFipe * 0.015;
        }
    }
}
