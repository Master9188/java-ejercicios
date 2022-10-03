
package calcmenu;
import java.util.*;
public class Calcmenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        int op;
        int i = 0;
        while(i<=2){
        System.out.println("Damer el valor de a: ");
        a = sc.nextFloat();
        System.out.println("Dame el valor de b: ");
        b = sc.nextFloat();
        
        System.out.println("Elije la operacion que quieras realizar: ");
        System.out.println("1- Suma");
        System.out.println("2- resta");
        System.out.println("3- multiplicacion");
        System.out.println("4- division");
        System.out.println("5 modulo");
        System.out.println("6- salir");
        
        op = sc.nextInt();
        switch(op){
            case 1:
                c = a + b;
                System.out.println("La suma de a + b es: " + c);
                break;
            case 2:
                c = a - b;
                System.out.println("La resta de a - b es: " + c);
                break;
            case 3:
                c = a * b;
                System.out.println("La multipliacion de a * b es: " + c);
                break;
            case 4:
                c = a / b;
                System.out.println("La division de a / b es: " + c);
                break;
            case 5:
                c = a % b;
                System.out.println("El modulo de a % b es: " + c);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("No es lo solicitado");
                break;
        }
        i++;
        }
        
    }
    
}
