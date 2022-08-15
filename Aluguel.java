import java.math.BigDecimal;

public class Aluguel extends Cliente {
    Veiculo veiculo;
    String nome;
    int quantidadeDeDias;
    BigDecimal valorDaDiaria;
    
    public Aluguel() { }

    public Aluguel(Veiculo veiculo, String tipoCliente, int quantidadeDeDias, BigDecimal valorDaDiaria) {
        this.veiculo = veiculo;
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorDaDiaria = valorDaDiaria;
    }

    public BigDecimal calcularValorAluguel(Veiculo veiculo, String tipoCliente, int quantidadeDeDias, BigDecimal valorDaDiaria) {
        this.veiculo = veiculo;
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorDaDiaria = valorDaDiaria;
        BigDecimal valorAluguel;
 
        valorAluguel = new BigDecimal(this.quantidadeDeDias).multiply(valorDaDiaria);
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
