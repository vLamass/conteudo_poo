public final class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe)
            throws Exception {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculos(double pesoCarga, double dias) throws Exception {

        if (dias <= 0)
            throw new Exception("Dias Invalidos. ");

        return valorLocacaoDiaria * dias;
    }

    @Override
    public double calcularIpva() {

        if (calcularIdade() > 20)
            return 0.0;

        else {
            return precoFipe * 0.04;
        }
    }
}
