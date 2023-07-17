import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Antônio Miguel Borges Correa
 */
public class Applic {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        double altura, peso, imc;
        String resultado;

        System.out.println("Calcule o seu Índice de Massa Corporal (IMC)\n");

        System.out.println("Digite a sua altura(m): ");
        altura = entrada.nextDouble();

        System.out.println("Digite o seu peso(kg): ");
        peso = entrada.nextDouble();

        
        imc = peso / Math.pow(altura, 2); 

        resultado = df.format(imc);
        
        
        System.out.println("\nResultado\n");

        System.out.println("IMC: " + resultado + "\n");
        
        if (imc < 17) {
            System.out.println("Situação: Muito abaixo do peso.");
        } else if (imc < 18.49) {
            System.out.println("Situação: Abaixo do peso.");
        } else if (imc > 18.5 && imc < 24.99) {
            System.out.println("Situação: Peso normal.");
        } else if (imc > 25 && imc < 29.99) {
            System.out.println("Situação: Acima do peso.");
        } else if (imc > 30 && imc < 34.99) {
            System.out.println("Situação: Obesidade I.");
        } else if (imc > 35 && imc < 29.99) {
            System.out.println("Situação: Obesidade II(severa).");
        } else {
            System.out.println("Situação: Obesidade III(mórbida).");
        }

        System.out.println("\nDigite qualquer tecla para continuar...");   
        
        System.in.read();
    }
}