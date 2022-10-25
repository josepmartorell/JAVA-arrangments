package RearrangeArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
 
public class rearrangeArray {
 
    public static void main(String[] args) {
 
        Random r = new Random();
        Integer[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        // int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8}; no podemos pasarlo a List
 
        System.out.println(Arrays.asList(arrayEnteros));
 
        // 1º método: posición aleatoria
        for (int i=0; i<arrayEnteros.length; i++) {
            int posAleatoria = r.nextInt(arrayEnteros.length);
            int temp = arrayEnteros[i];
            arrayEnteros[i] = arrayEnteros[posAleatoria];
            arrayEnteros[posAleatoria] = temp;
        }
 
        System.out.println(Arrays.toString(arrayEnteros));
        System.out.println(arrayEnteros[0]);
 /*
        // 2º método: Collection.shuffle
        List<Integer> lista = Arrays.asList(arrayEnteros);
        Collections.shuffle(lista);
        System.out.println(lista);
 
        lista.toArray(arrayEnteros);
 */
    }

}
