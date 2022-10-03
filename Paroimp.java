
package paroimp;
import java.util.*;
public class Paroimp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.println("Dame un numero: ");
        numero = sc.nextInt();
        
        int par = numero % 2;
        
        if (par == 0)
        {
            System.out.println("El numero que ingresaste es par");
        }
        else if (par == 1)
        {
            System.out.println("El numero ingresado es impar");
        }
        else
        {
            System.out.println("Coloca un numero de nuevo");
        }       
    } 
}
