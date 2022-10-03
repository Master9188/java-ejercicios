
package mayordecuatro;
import java.util.*;
public class Mayordecuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = new int [4];
        
        for (int i = 0; i <= 3; i++)
        {
            System.out.print("Dame un numero: "); //Ingresar datos
            arr1[i] = sc.nextInt();
        }
        int mayor;
        mayor = arr1[0];    //Donde se guiarda el numero y donde inicia
        
        for (int s = 0; s < arr1.length; s++)
        {
            if(arr1[s] > mayor) //Si arr1 es mayor a el numero en primera psicicion y se guarda
            {mayor = arr1[s];}  //y compara con el otro
        }
        
        System.out.println("El numero mas grande es: " + mayor);    //Mostrar el mayor
        
        int guardar = 0;       //Guarda el numero de veces que se repite un numero
        int comp = arr1[0];     //desde donde inicia, el cual inicia en el primer numero
        for (int e = 0; e < arr1.length; e++)
        {
            if (comp == arr1[e])    //Si se repite el numero checado con otro suma 1
            {guardar++;}
            else                    //Si no se repite muestra el mensaje
            {System.out.println("El numero " + arr1[e] + " se repite: " + guardar + " Veces");}
        }
        
        
        
    }
    
}
