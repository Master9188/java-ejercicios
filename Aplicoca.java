package aplicoca;
import java.util.Scanner;
public class Aplicoca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave, antiguedad;
        String nombre;
        
        System.out.println("Cual es tu nombre: ");
        nombre = sc.next();
        System.out.println("Cual es la clave de tu departamento: ");
        
        System.out.println("1- atencion al clinte");
        System.out.println("2- Loguistica");
        System.out.println("3- Gerencia");
        
        clave = sc.nextInt();
        
        System.out.println("Dame los años de antiguedad del trabajador: ");
        antiguedad = sc.nextInt();
        
        if(clave == 1)
            {if(antiguedad == 1)
                    {System.out.println(nombre + " tienes 7 dias de vacaciones");}
            else if(antiguedad <= 6)
                    {System.out.println(nombre+ " tienes 15 dias de vacaciones");}
            else
            {System.out.println(nombre + " tienes 20 dias de descanso");}
        }
        else if(clave == 2)
            {if(antiguedad == 1)
                    {System.out.println(nombre + " tienes 7 dias de vacaciones");}
            else if(antiguedad <= 6)
                    {System.out.println(nombre+ " tienes 15 dias de vacaciones");}
            else
            {System.out.println(nombre + " tienes 22 dias de descanso");}}
        else if(clave == 3)
            {if(antiguedad == 1)
                    {System.out.println(nombre + " tienes 10 dias de vacaciones");}
            else if(antiguedad <= 6)
                    {System.out.println(nombre+ " tienes 20 dias de vacaciones");}
            else
            {System.out.println(nombre + " tienes 30 dias de descanso");}
        }
        else
        {System.out.println("No es lo que pedi");}
    }
}
