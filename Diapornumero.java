
package diapornumero;
import java.util.*;
public class Diapornumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("Dame un numero del 1 al 12: ");
        numero = sc.nextInt();
        
        switch(numero)
        {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Intentalo de nuevo :)");
        }
        
    }
    
}