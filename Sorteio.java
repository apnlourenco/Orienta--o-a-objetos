import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

      private ArrayList<Integer> numeros;

    public Sorteio() {
        numeros = new ArrayList<>();
    }

    public boolean sortear() {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int numero = random.nextInt(60) + 1;

            while (numeros.contains(numero)) {
                numero = random.nextInt(60) + 1;
            }

            numeros.add(numero);
        }
    }

    public Integer[] getNumeros() {
        return numeros.toArray(new Integer[0]);
    }
}
