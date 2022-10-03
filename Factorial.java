
package factorial;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 1, fact = 1;
        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();
        for (int i = numero; i > 0; i--)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
  
    
}
