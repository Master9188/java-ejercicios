
package calcuif;
import java.util.Scanner;
public class Calcuif {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero_1, numero_2, promedio;
        
        System.out.println("Elige la operacion que quieras realizar");
        System.out.println("0- Suma");
        System.out.println("1- Resta");
        System.out.println("2- Division");
        System.out.println("3- Multiplicacion");
        promedio = sc.nextInt();
        
        System.out.println("Dame el valor del primer numero: ");
        numero_1 = sc.nextInt();
        System.out.println("Dame el valor del segundo numero: ");
        numero_2 = sc.nextInt();
        
        
        if(promedio == 0){
            promedio = numero_1 + numero_2;
            System.out.println("La suma de los dos numeros ingresados es: " + promedio);
        }
        else if(promedio == 1){
            promedio = numero_1 - numero_2;
            System.out.println("La resta de estos dos numeros es: " + promedio);
        }
        else if(promedio == 2){
            promedio = numero_1 / numero_2;
            System.out.println("La division de estos dos numeros es: " + promedio);
        }
        else if(promedio == 3){
            promedio = numero_1 * numero_2;
            System.out.println("La multiplicacion de estos dos numeros es: " + promedio);
        }
        else
        {System.out.println("No es lo solcitado");}
    }
    
}
