import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultados = "";

        long numero = scanner.nextLong();
        while (numero != 0) {
            long suma = 0;
            long divisor = 10;
            while (divisor / 10 <= numero) {
                suma += numero % divisor; 
                divisor *= 10;
            }
            resultados = resultados + suma + "\n"; 
            numero = scanner.nextLong();
        }

        //llega al 0: ahora muestra todos los resultados
        System.out.println("resultados:");
        System.out.println(resultados);

        scanner.close();
    }
}