
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Antônio Miguel Borges Correa
 */
public class Applic {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número: ");
        num = entrada.nextInt();
        
        System.out.println("|" + num + "| = " + calcMod(num));
        
        System.out.println("\nDigite qualquer tecla para continuar...");   
        
        System.in.read();
    }  
    
    public static int calcMod(int val){
        if(val < 0) {
            return val * -1;
        } else {
            return val;
        }
    }
}
