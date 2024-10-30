package s04;
import java.util.Scanner;
public class s04ex01 {

    public static void main(String[] args) {
        String username =System.getProperty("user.name");
        Scanner text = new Scanner(System.in);
        System.out.println("Olá " + username);
        
        
            
        
        try {
            System.out.println("Insere um numero inteiro");
            int numInt=text.nextInt();
            System.out.println("Insere um numero decimal");
            double numDouble = text.nextDouble();
            double sum = numInt+numDouble; 
            System.out.println("Caro "+username+" Somar "+numInt+" com "+numDouble+" dá "+sum);

        } catch (Exception e) {
           System.out.println("ERRO experimente usar a virgula a proxima vez");
        }
        text.close();
        
    }

}