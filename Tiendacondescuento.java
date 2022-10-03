
package tiendacondescuento;
import java.util.*;
public class Tiendacondescuento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int cantidadP;
       int cantidadD;
       int precio;
       double descuentomenor, descuentomayor;
       double preciot, preciom;
        System.out.print("Dame el numero de productos: ");
        cantidadP = sc.nextInt();
        System.out.print("Dame el precio de cada producto: ");
        cantidadD = sc.nextInt();
        
        precio = cantidadP * cantidadD;
        descuentomenor = precio * .08;
        descuentomayor = precio * .10;
        preciot = precio - descuentomenor;
        preciom = precio - descuentomayor;
        
        System.out.println("El precio total es: " + precio);
         
        if(precio < 50)
        {
            System.out.println("El descuento es de: " + descuentomenor);
            System.out.println("Precio con descuento: " + preciot);
        }
        else if(precio >= 50)
        {
            System.out.println("El descuento es de: "+ descuentomayor);
            System.out.println("precio con descuento: " + preciom);
        }
        
    }
    
}
