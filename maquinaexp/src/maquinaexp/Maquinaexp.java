
package maquinaexp;
import java.util.*;
public class Maquinaexp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int galleta = 15,barra = 15,paleta = 15,refresco = 15;
        int leche = 24, papas=24, agua = 24;
        int congelada = 10,cacahuates = 10,coca = 10;
        int cantidad = 0;
        int op;
        int pago;
        int faltante = 0;
        int cambio = 0;
        
        System.out.println("Productos");
        System.out.println("1-Galletas = 15$");
        System.out.println("2-barras = 15$");
        System.out.println("3-Paleta = 15$");
        System.out.println("4-Refresco = 15$");
        System.out.println("5-Leche = 24$");
        System.out.println("6-Papas = 24$");
        System.out.println("7-Agua = 24$");
        System.out.println("8-Congelada = 10$");
        System.out.println("9-Cacahuate = 10");
        System.out.println("10-Coca = 10$");
        System.out.println("  ");
        System.out.print("Elije el numero del producto que deseas: " );
        op = sc.nextInt();
        
        switch(op)
        {
            case 1:
                cantidad = Galleta(galleta, cantidad);
                break;
            case 2:
                cantidad = Barra(barra,cantidad);
                break;
            case 3:
                cantidad = Paleta(paleta,cantidad);
                break;
            case 4:
                cantidad = Refresco(refresco,cantidad);
                break;
            case 5:
                cantidad = Leche(leche,cantidad);
                break;
            case 6:
                cantidad = Papas(papas,cantidad);
                break;
            case 7:
                cantidad = Agua(agua,cantidad);
                break;
            case 8:
                cantidad = Congelada(congelada,cantidad);
                break;
            case 9:
                cantidad = Cacahuates(cacahuates,cantidad);
                break;
            case 10:
                cantidad = Coca(coca, cantidad);
                break;
                
          
        }
        System.out.println("Pagar: " + cantidad);
        
        System.out.println(" ");
       
            System.out.println("Solo se aceptan nominaciones de 1, 2, 5, 10 , 20, 50, 100");
            
            for(int i = 0; i <= 10; i++){
            System.out.println("Pago: ");
            pago = sc.nextInt();
    
        
           cantidad = Cobrar(cantidad, pago, faltante, cambio);
        }}
        
        

    
    
    static int Galleta(int galleta, int cantidad)
    {cantidad = cantidad + galleta;
        return cantidad;}
    
    static int Barra(int barra, int cantidad)
    {cantidad = cantidad + barra;
        return cantidad;}
    
    static int Paleta(int paleta, int cantidad)
    {cantidad = cantidad + paleta;
        return cantidad;}
    
    static int Refresco(int refresco, int cantidad)
    {cantidad = cantidad +refresco;
        return cantidad;}
    
    static int Leche(int leche, int cantidad)
    {cantidad = cantidad +leche;
        return cantidad;}
    
    static int Papas(int papas, int cantidad)
    {cantidad = cantidad +papas;
        return cantidad;}
    
    static int Agua(int agua, int cantidad)
    {cantidad = cantidad +agua;
        return cantidad;}
    
    static int Congelada(int congelada, int cantidad)
    {cantidad = cantidad +congelada;
        return cantidad;}
    
    static int Cacahuates(int cacahuates, int cantidad)
    {cantidad = cantidad +cacahuates;
        return cantidad;}
    
    static int Coca(int coca, int cantidad)
    {cantidad = cantidad +coca;
        return cantidad;}
    
    static int Cobrar(int cantidad, int pago,int faltante,int cambio)
    {
        
        if(pago == 1 || pago == 2 || pago == 5 || pago == 10 || pago == 20 || pago == 50 || pago == 100)
        {
            
            
            cambio = pago - cantidad;
            
            
            if(pago == cantidad)
            {System.out.println("Producto despachandose " );
                    System.exit(0);}
            else if(pago >= cantidad)
            {cambio = pago - cantidad;
            cantidad = cambio;
                System.out.println("Te sobra:" + cambio);
                    System.exit(0);}
            else if(pago <= cantidad)
            {faltante = cantidad-pago;
            cantidad = faltante;
                System.out.println("Te faltan:" + faltante);}
            }
        
        
        
        else
        {System.out.println("No se acepta esa moneda");
        System.out.println("Introduzca otra moneda");}
        
        
       
        

        return cantidad;
}
}
