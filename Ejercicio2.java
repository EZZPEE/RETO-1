import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultados = "";
        
        long numero = scanner.nextLong();
        while (numero != 0) {
            long suma = 0;
            long divisor = 10;
            while (divisor <= numero * 10) {
                suma += numero % divisor; 
                divisor *= 10;
            }
            resultados = resultados + suma + "\n"; 
            numero = scanner.nextLong();
        }
        
        scanner.close();
        System.out.println("Resultados:");
        System.out.println(resultados);
    }
}
