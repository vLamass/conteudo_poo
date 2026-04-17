public class Main {

    public static void main(String[] args) {

        try {

            Caminhao caminhao = new Caminhao("ABC1234", "Volvo", 500, 2000, 200000, 10);

            CarroPasseio carro = new CarroPasseio("XYZ5678", "Toyota", 200, 2010, 50000);

            double aluguelCaminhao = caminhao.alugarVeiculos(3, 3);
            double ipvaCaminhao = caminhao.calcularIpva();

            double aluguelCarro = carro.alugarVeiculos(0, 5);
            double ipvaCarro = carro.calcularIpva();

            System.out.println("Caminhão - Aluguel: " + aluguelCaminhao);
            System.out.println("Caminhão - IPVA: " + ipvaCaminhao);

            System.out.println("Carro - Aluguel: " + aluguelCarro);
            System.out.println("Carro - IPVA: " + ipvaCarro);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}