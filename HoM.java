
package hom;

import java.util.Scanner;
public class HoM {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres mujer o hombre?");
        String sexo = sc.nextLine();
        
        if ("mujer".equals(sexo) || "Mujer".equals(sexo))
        {
            System.out.println("Eres del sexo femenino. Eres: " + sexo);}
        else if("hombre".equals(sexo) || "Hombre".equals(sexo))
        {
            System.out.println("Eres del sexo masculino. Eres: " + sexo);}
        else
            System.out.println("NO es lo solicitado");
    }
    
}
