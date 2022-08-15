import java.text.NumberFormat;
import java.util.Locale;

public class AppAluguel {
    public static void main(String[] args) {
        double valorAluguel;
        double valorDaDiaria;
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
        valorDaDiaria = val1.valorDiaria(tipoPequeno, clientePF, quantidadeDias1);
        Aluguel valor1 = new Aluguel(); 
        valorAluguel = valor1.calcularValorAluguel(tipoPequeno, clientePF, quantidadeDias1, valorDaDiaria);

        Locale moedaBrasil = new Locale("pt", "BR");
        var valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);

        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoPequeno+" cliente "+clientePF+
        " quantidade de dias "+quantidadeDias1+".");
        System.out.println("=========");

        // MEDIO  , PF, 6 DIAS
        ValorDiaria val2 = new ValorDiaria();
        valorDaDiaria = val2.valorDiaria(tipoMedio, clientePF, quantidadeDias6);
        Aluguel valor2 = new Aluguel(); 
        valorAluguel = valor2.calcularValorAluguel(tipoMedio, clientePF, quantidadeDias6, valorDaDiaria);

        valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);

        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoMedio+" cliente "+clientePF+
        " quantidade de dias "+quantidadeDias6+".");
        System.out.println("=========");
 
        // SUV    , PJ, 1 DIA
        ValorDiaria val3 = new ValorDiaria();
        valorDaDiaria = val3.valorDiaria(tipoSUV, clientePJ, quantidadeDias1);
        Aluguel valor3 = new Aluguel(); 
        valorAluguel = valor3.calcularValorAluguel(tipoSUV, clientePJ, quantidadeDias1, valorDaDiaria);
    
        valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);
    
        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoSUV+" cliente "+clientePJ+
        " quantidade de dias "+quantidadeDias1+".");
        System.out.println("=========");
 
        // MEDIO  , PJ, 6 DIAS 
        ValorDiaria val4 = new ValorDiaria();
        valorDaDiaria = val4.valorDiaria(tipoMedio, clientePJ, quantidadeDias6);
        Aluguel valor4 = new Aluguel(); 
        valorAluguel = valor4.calcularValorAluguel(tipoMedio, clientePJ, quantidadeDias6, valorDaDiaria);
    
        valorConvertido = NumberFormat.getCurrencyInstance(moedaBrasil).format(valorAluguel);

        System.out.println("O valor do aluguel é: "+valorConvertido+
        " para veiculo "+tipoMedio+" cliente "+clientePJ+
        " quantidade de dias "+quantidadeDias6+".");
        System.out.println("=========");
    }
}
