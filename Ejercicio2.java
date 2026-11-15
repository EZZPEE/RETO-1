import java.util.Scanner;

/*
    PROBLEMA NUMERO 265
    SUMA    DESCENDENTE
*/

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultados = new StringBuilder();
        
        long numero = scanner.nextLong();
        
        while (numero != 0) {
            long suma = 0;
            long divisor = 10;
            
            while (divisor <= numero * 10) {
                suma += numero % divisor;
                divisor *= 10;
            }
            
            resultados.append(suma).append("\n");
            numero = scanner.nextLong();
        }
        
        scanner.close();
        System.out.print(resultados);
    }
}
