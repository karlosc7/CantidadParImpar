/*
 * Pedir una cantidad de números y mostrar la cantidad de
 * pares e impares
 */
package buclespares;
import java.util.Scanner;
/**
 * @author karlosc
 */
public class BuclesPares {
        
        static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n, x, cp=0, ci=0;
        System.out.println("Introduce la cantidad de números a revisar: ");
        n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+"Ingrese un número: ");
            x = scan.nextInt();
            if(x%2==0)
                cp++;
            else
                ci++;
        }
        System.out.println("La cantidad de pares son: " +cp);
        System.out.println("La cantidad de impares son: " +ci);
    }
}
