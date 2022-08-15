import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class AppAluguel {
    public static void main(String[] args) {
        BigDecimal valorAluguel;
        BigDecimal valorDaDiaria;
        Double taxaDesconto;
        String clientePF = "PF";
        String clientePJ = "PJ";
        Veiculo tipoPequeno = Veiculo.PEQUENO;
        Veiculo tipoMedio = Veiculo.MEDIO;
        Veiculo tipoSUV = Veiculo.SUV;
        int quantidadeDias1 = 1;
        int quantidadeDias6 = 6;

        // Testes de calculos dos valores de diarias:

        // PEQUENO, PF, 1 DIA
        ValorDiaria val1 = new ValorDiaria();
        Desconto desconto1 = new Desconto();
        taxaDesconto = desconto1.taxaDesconto(clientePF, quantidadeDias1);
        valorDaDiaria = val1.valorDiaria(tipoPequeno);
        Aluguel valor1 = new Aluguel(); 
        valorAluguel = valor1.calcularValorAluguel(tipoPequeno, clientePF, quantidadeDias1, valorDaDiaria, taxaDesconto);

        Locale moedaBrasil = new Locale("pt", "BR");
        var valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);

        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoPequeno+" cliente "+clientePF+
        " quantidade de dias "+quantidadeDias1+".");
        System.out.println("=========");

        // MEDIO  , PF, 6 DIAS
        ValorDiaria val2 = new ValorDiaria();
        Desconto desconto2 = new Desconto();
        taxaDesconto = desconto2.taxaDesconto(clientePF, quantidadeDias6);
        valorDaDiaria = val2.valorDiaria(tipoMedio);
        Aluguel valor2 = new Aluguel(); 
        valorAluguel = valor2.calcularValorAluguel(tipoMedio, clientePF, quantidadeDias6, valorDaDiaria, taxaDesconto);

        valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);

        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoMedio+" cliente "+clientePF+
        " quantidade de dias "+quantidadeDias6+".");
        System.out.println("=========");
 
        // SUV    , PJ, 1 DIA
        ValorDiaria val3 = new ValorDiaria();
        Desconto desconto3 = new Desconto();
        taxaDesconto = desconto3.taxaDesconto(clientePJ, quantidadeDias1);
        valorDaDiaria = val3.valorDiaria(tipoSUV);
        Aluguel valor3 = new Aluguel(); 
        valorAluguel = valor3.calcularValorAluguel(tipoSUV, clientePJ, quantidadeDias1, valorDaDiaria, taxaDesconto);
    
        valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);
    
        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoSUV+" cliente "+clientePJ+
        " quantidade de dias "+quantidadeDias1+".");
        System.out.println("=========");
 
        // MEDIO  , PJ, 6 DIAS 
        ValorDiaria val4 = new ValorDiaria();
        Desconto desconto4 = new Desconto();
        taxaDesconto = desconto4.taxaDesconto(clientePJ, quantidadeDias6);
        valorDaDiaria = val4.valorDiaria(tipoMedio);
        Aluguel valor4 = new Aluguel(); 
        valorAluguel = valor4.calcularValorAluguel(tipoMedio, clientePJ, quantidadeDias6, valorDaDiaria, taxaDesconto);
    
        valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);

        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoMedio+" cliente "+clientePJ+
        " quantidade de dias "+quantidadeDias6+".");
        System.out.println("=========");
    }
}
