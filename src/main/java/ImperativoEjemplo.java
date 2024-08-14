import java.util.ArrayList;
import java.util.List;

public class ImperativoEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        System.out.println("Números pares: " + pares);
    }
}
