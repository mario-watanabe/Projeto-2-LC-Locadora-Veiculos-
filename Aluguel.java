public class Aluguel extends Cliente {
    Veiculo veiculo;
    String nome;
    int quantidadeDeDias;
    double valorDaDiaria;
    
    public Aluguel() { }

    public Aluguel(Veiculo veiculo, String tipoCliente, int quantidadeDeDias, double valorDaDiaria) {
        this.veiculo = veiculo;
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorDaDiaria = valorDaDiaria;
    }

    public double calcularValorAluguel(Veiculo veiculo, String tipoCliente, int quantidadeDeDias, double valorDaDiaria) {
        this.veiculo = veiculo;
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorDaDiaria = valorDaDiaria;
        double valorAluguel;
 
        valorAluguel = (valorDaDiaria * quantidadeDeDias);
        return valorAluguel;

    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }
    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public String getCliente() {
        return nome;
    }
    public void setCliente(String nome) {
        this.nome = nome;
    }
    
}
