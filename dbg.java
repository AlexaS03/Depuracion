import java.util.Random;

public class GeneradorNumerosAleatorios {

    public static void main(String[] args) {
        
        // Creamos un objeto Random
        Random random = new Random();
        
        // Generamos 10 números aleatorios
        for (int i = 1; i < 10; i++) {
            int numeroAleatorio = rando.nextInt(100);
            System.out.println(numeroAleatorio);
        }
    }
}