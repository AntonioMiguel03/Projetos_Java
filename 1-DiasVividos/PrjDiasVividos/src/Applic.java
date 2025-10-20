import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Antônio Miguel Borges Correa
 */
public class Applic {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtnasc, hoje;
        String data;
        long dias;
        
        System.out.println("Digite a sua data de nascimento: ");
        data = entrada.next();
                
        dtnasc = LocalDate.parse(data, dtf);
        
        hoje = LocalDate.now();
        
        dias = ChronoUnit.DAYS.between(dtnasc, hoje);
        
        System.out.println("Você já viveu " + dias + " dia(s)!");  
        
        System.out.println("\nDigite qualquer tecla para continuar...");   
        
        System.in.read();
    }
}
