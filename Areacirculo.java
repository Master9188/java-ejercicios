
package areacirculo;
import java.util.Scanner;
public class Areacirculo {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float pi = (float) 3.1426;
        System.out.println("Introduce el valor del radio: ");
        float R = sc.nextFloat();
        
        float Area = pi * (R*R);
        
        System.out.println("El area es: " + Area);
    }
    
}
