import java.util.Scanner;
/*
    PROBLEMA    NUMERO    191
    LOS PROBLEMAS DE SER RICO
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCasos = entrada.nextInt();
        StringBuilder resultados = new StringBuilder();
        
        for (int i = 0; i < numeroCasos; i++) {
            long numeroCompartimentos = entrada.nextLong();
            long capacidadActual = entrada.nextLong();
            long diferenciaCapacidad = entrada.nextLong();
            long capacidadTotal = 0;
            
            for (int j = 0; j < numeroCompartimentos; j++) {
                capacidadTotal += capacidadActual;
                capacidadActual -= diferenciaCapacidad;
            }
            resultados.append(capacidadTotal).append("\n");
        }
        
        System.out.print(resultados);
        entrada.close();
    }
}
