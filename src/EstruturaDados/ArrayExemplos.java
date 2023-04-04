package EstruturaDados;

import java.util.Random;

public class ArrayExemplos {
    public static int[] GeraArrayComInteirosAleatorios(int quantidadeItens) {
        int[] array = new int[quantidadeItens];
        
        for (int i = 0; i < quantidadeItens; i++) {
            array[i] = new Random().nextInt();
        }

        return array;
    }
}
