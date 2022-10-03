
package mayordeunalista;

import java.util.Scanner;

public class Mayordeunalista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m;
        int mayor = 0;
        
        System.out.println("Cuantos numeros ingresaras: ");
        n = sc.nextInt();
        
        for (int i = 0; i <= n; i++)
        {
            System.out.print("Dame un numero: "); //Ingresar datos
            m = sc.nextInt();
            
            if(m > mayor) //Si arr1 es mayor a el numero en primera psicicion y se guarda
            {mayor = m;}  //y compara con el otro
            
        }
            //Donde se guarda el numero y donde inicia
        System.out.println("El numero mas grande es: " + mayor);
        
        
    }
    
}
