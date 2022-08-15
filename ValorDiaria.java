import java.math.BigDecimal;

public class ValorDiaria extends Cliente {
   Veiculo tipoVeiculo;
   BigDecimal valorDiaria;
   String tipoCliente;
   int quantidadeDeDias;

   public ValorDiaria() {}

   public ValorDiaria(String tipoVeiculo){}

   public BigDecimal valorDiaria (Veiculo tipoVeiculo, String tipoCliente, int quantidadeDeDias) {
      this.tipoVeiculo = tipoVeiculo;
      this.tipoCliente = tipoCliente;
      this.quantidadeDeDias = quantidadeDeDias;
   //   Veiculo tipo = Veiculo.PEQUENO;
   //   Cliente tipo = Cliente.valueOf(tipoCliente); 
      if (tipoCliente == "PF") {
         switch (tipoVeiculo) {
         case PEQUENO:
         if (quantidadeDeDias > 5) {
            valorDiaria = new BigDecimal(95.00);
         }  else { 
            valorDiaria = new BigDecimal(100.00);
         }
         break;
         case MEDIO:
         if (quantidadeDeDias > 5) {
            valorDiaria = new BigDecimal(142.50);
         }  else { 
            valorDiaria = new BigDecimal(150.00);
         }
         break;
         case SUV:
         if (quantidadeDeDias > 5) {
            valorDiaria = new BigDecimal(190.00);
         }  else { 
            valorDiaria = new BigDecimal(200.00);
         }
         break;
         default: 
             throw new IllegalArgumentException("Somente PEQUENO, MEDIO e SUV são veículos válidos.");
      //      System.out.println("Escolha PEQUENO, MEDIO E SUV APENAS");
                 }
      } else {
        if (tipoCliente == "PJ") {
          switch (tipoVeiculo) {
          case PEQUENO:
            if (quantidadeDeDias > 3) {
              valorDiaria = new BigDecimal(90.00);
            }  else { 
              valorDiaria = new BigDecimal(100.00);
            }
            break;
          case MEDIO:
            if (quantidadeDeDias > 3) {
              valorDiaria = new BigDecimal(135.00);
            }  else { 
              valorDiaria = new BigDecimal(150.00);
            }
            break;
          case SUV:
            if (quantidadeDeDias > 3) {
              valorDiaria = new BigDecimal(180.00);
            }  else { 
              valorDiaria = new BigDecimal(200.00);
            }
            break;
          default:
            throw new IllegalArgumentException("Somente PEQUENO, MEDIO e SUV são veículos válidos.");

       //     System.out.println("Escolha PEQUENO, MEDIO E SUV APENAS");
            }
        }
      }
      return valorDiaria;
}
}
