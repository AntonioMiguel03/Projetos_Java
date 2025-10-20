
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Antônio Miguel Borges Correa
 */
public class Applic {
  public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("#,##0.00");
        
        double saldo, compra;
        String continuar;
        
        System.out.println("Informe o seu saldo: ");
        saldo = entrada.nextDouble();
        
        
        System.out.println("\nCompras\n");
        
        do {
            System.out.println("Informe o valor da compra: ");
            compra = entrada.nextDouble();
            
            if (compra > saldo) {
                System.out.println("\nSaldo Insuficiente!\n");
            } else {           
                saldo = saldo - compra;
                System.out.println("\nSaldo atual: R$" + real.format(saldo));
            }
            
            System.out.println("\nDeseja continuar?(S/N)");
            continuar = entrada.next();
        } while(continuar.equals("S") || continuar.equals("s"));
        
        System.out.println("\nDigite qualquer tecla para continuar...");   
        
        System.in.read();
    }    
}
