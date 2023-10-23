package algoritmos;

import java.util.List;

public class SelectionSort {
    
     public void sort(List<Integer> lista) {

        for (int j=0; j<lista.size()-1; j++) {
            int menor = j;
            for (int i=j; i<lista.size(); i++) {
                if (lista.get(i) < lista.get(menor)) {
                    menor = i;
                }
            }
            if (lista.get(j) > lista.get(menor)) {
                int aux = lista.get(j);
                lista.set(j, lista.get(menor));
                lista.set(menor, aux);
            }
        }
    }
}
