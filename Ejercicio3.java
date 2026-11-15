import java.util.Scanner;

public class Ejercicio3 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    StringBuilder resultados = new StringBuilder();

    while (true) {
      long envoltoriosNecesarios = entrada.nextLong();
      long chiclesRegalados = entrada.nextLong();
      long chiclesIniciales = entrada.nextLong();

      if (
        envoltoriosNecesarios == 0 &&
        chiclesRegalados == 0 &&
        chiclesIniciales == 0
      ) {
        break;
      }

      long totalChicles = chiclesIniciales;
      long envoltorios = chiclesIniciales;

      if (
        chiclesRegalados >= envoltoriosNecesarios &&
        envoltorios >= envoltoriosNecesarios
      ) {
        resultados.append("RUINA\n");
        
      } else {
        while (envoltorios >= envoltoriosNecesarios) {
          long intercambios = envoltorios / envoltoriosNecesarios;
          long nuevosChicles = intercambios * chiclesRegalados;
          
          totalChicles += nuevosChicles;
          envoltorios = ( envoltorios % envoltoriosNecesarios ) + nuevosChicles;
        }
        
        resultados.append(totalChicles)
          .append(" ")
          .append(envoltorios)
          .append("\n");
      }
    }

    System.out.print(resultados);
    entrada.close();
  }
}
