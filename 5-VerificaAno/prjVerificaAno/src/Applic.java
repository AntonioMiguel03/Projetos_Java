import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Antônio Miguel Borges Correa
 */
public class Applic {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano: ");
        ano = entrada.nextInt();
        
        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        
        System.out.println("\nDigite qualquer tecla para continuar...");   
        
        System.in.read();
    }    
}