
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        
        int num = 1, suma =0 , n = 0;
        for (int i = 1; i <= 10; i++)
        {
            suma = n;
            n = num + suma;
            num=suma;
            System.out.println(num);
            
        }
    }
    
}
