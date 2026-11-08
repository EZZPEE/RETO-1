import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        StringBuilder resultados = new StringBuilder();

        for (int i = 0; i < casos; i++) {
            long compartimentos = entrada.nextLong();
            long capacidad = entrada.nextLong();
            long diferencia = entrada.nextLong();

            long total = 0;
            for (int j = 0; j < compartimentos; j++) {
                total = total + capacidad;
                capacidad = capacidad - diferencia;
            }
            resultados.append(total).append("\n");
        }
        System.out.println("Resultados:");
        System.out.println(resultados);
        entrada.close();
    }
}


