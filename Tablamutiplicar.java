
package tablamutiplicar;
import java.util.*;
public class Tablamutiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Dame el numero para hacer una tabla de multiplicar: ");
        numero = sc.nextInt();
        
        System.out.println(numero);
        System.out.println(" ");
        
        int i;
        int m = 1;
        
        for(i = 1; i <= 10; i++)
        {
            m = numero * i;
            System.out.println(m);
            
        }
    }
    
}
