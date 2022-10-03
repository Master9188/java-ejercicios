
package alrevespiramide;
import java.util.Scanner;
public class Alrevespiramide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ast = "*";
        System.out.println("Coloca el numero al cual quieres iniciar: ");
        int num = sc.nextInt();
        
        for(int i = num; i >= 1; i--){
            for(int k = i; k >= 1 ; k--)
            {
                System.out.print(ast);  
            }
            System.out.println("");            
            
        }  
    }
    
}
