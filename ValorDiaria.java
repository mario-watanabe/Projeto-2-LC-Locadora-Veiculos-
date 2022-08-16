import java.math.BigDecimal;

public class ValorDiaria extends Cliente {
   private BigDecimal valorDiaria;

   public ValorDiaria() {}

   public ValorDiaria(Veiculo tipoVeiculo){}

   public BigDecimal valorDiaria (Veiculo tipoVeiculo) {
      switch (tipoVeiculo) {
      case PEQUENO:
         valorDiaria = new BigDecimal(100.00);
      break;
      case MEDIO:
         valorDiaria = new BigDecimal(150.00);
      break;
      case SUV:
         valorDiaria = new BigDecimal(200.00);
      break;
      default: 
         throw new IllegalArgumentException("Somente PEQUENO, MEDIO e SUV são veículos válidos.");
   //      System.out.println("Escolha PEQUENO, MEDIO E SUV APENAS");
      }
      return valorDiaria;
   }
}
