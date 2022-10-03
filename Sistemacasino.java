
package sistemacasino;
import java.util.*;
public class Sistemacasino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiro1;
        int tiro2;
        int tiro3;
        
        System.out.print("Dame el valor del tiro1: ");
        tiro1 = sc.nextInt();
        System.out.print("Dame el valor del tiro2: ");
        tiro2 = sc.nextInt();
        System.out.print("Dame el valor del tiro3: ");
        tiro3 = sc.nextInt();
        
        if(tiro1 == 6 && tiro2 ==6 && tiro3 == 6)
        {
            System.out.println("Excelente");
        }
        else if(tiro1 == 6 && tiro2 == 6 || tiro3 == 6 && tiro2 == 6 || tiro1 == 6 && tiro3 == 6)
        {
            System.out.println("Muy bien");
        }
        else if(tiro1 == 6 || tiro2 == 6 || tiro3 == 6)
        {
            System.out.println("Regular");
        }
        else
        {System.out.println("Pesimo");}
    }
    
}
