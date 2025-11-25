package ExerciciExcepcions2;
import java.util.Scanner;
public class MainExcepcions2 {
    public static void main(String[] args) {
        byte number=Entrada.llegirByte("Introduce un número");
      int age=Entrada.llegirInt("Introduce tu edad");
      float tall=Entrada.llegirFloat("Introduce tu altura");
      double weight=Entrada.llegirDouble("Introduce tu peso");
      char inicial=Entrada.llegirChar("Introduce la inicial de tu nombre");
      String name=Entrada.llegirString("Introduce tu nombre");
      boolean accept=Entrada.llegirSiNo("Aceptas condiciones?");
      System.out.println("Número: "+number);
      System.out.println("Edad: "+age);
      System.out.println("Altura: "+tall);
      System.out.println("Peso: "+weight);
      System.out.println("Inicial: "+inicial);
      System.out.println("Nombre: "+name);
      System.out.println("Accept condiciones? "+accept);
    }
}
