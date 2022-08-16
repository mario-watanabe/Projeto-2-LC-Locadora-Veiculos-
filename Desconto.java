public class Desconto {
    private String tipoCliente;
    private int quantidadeDeDias;

    public Desconto() {}

    public Desconto(String tipoCliente, int quantidadeDeDias) {
    }
    
    public double taxaDesconto(String tipoCliente, int quantidadeDeDias) {
        this.tipoCliente = tipoCliente;
        this.quantidadeDeDias = quantidadeDeDias;
        double taxaDesconto = 0;
        if(this.tipoCliente == "PF" && this.quantidadeDeDias > 5) {
            taxaDesconto = 5;            
        } else { if(this.tipoCliente == "PJ" && this.quantidadeDeDias > 3) {
            taxaDesconto = 10;
        }
        }
        return taxaDesconto;
    }  
        
}
