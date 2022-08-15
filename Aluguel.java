import java.math.BigDecimal;

public class Aluguel extends Cliente {
    Veiculo veiculo;
    String nome;
    int quantidadeDeDias;
    BigDecimal valorDaDiaria;
    double taxaDesconto;
    
    public Aluguel() { }

    public Aluguel(Veiculo veiculo, String tipoCliente, int quantidadeDeDias, BigDecimal valorDaDiaria, double taxaDesconto) {
        this.veiculo = veiculo;
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorDaDiaria = valorDaDiaria;
        this.taxaDesconto = taxaDesconto;
    }

    public BigDecimal calcularValorAluguel(Veiculo veiculo, String tipoCliente, int quantidadeDeDias, BigDecimal valorDaDiaria, double taxaDesconto) {
        this.veiculo = veiculo;
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorDaDiaria = valorDaDiaria;
        this.taxaDesconto = taxaDesconto;
        BigDecimal valorAluguel;

        BigDecimal taxa = new BigDecimal(taxaDesconto/100); 

        BigDecimal desconto = this.valorDaDiaria.multiply(taxa);
        BigDecimal diaria = valorDaDiaria.subtract(desconto);
 
        valorAluguel = new BigDecimal(this.quantidadeDeDias).multiply(diaria);

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
