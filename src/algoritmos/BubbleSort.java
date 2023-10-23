package algoritmos;

import java.util.List;

public class BubbleSort {
    
    public void sort(List<Integer> lista) {

        for (int x=0; x<lista.size()-1; x++) {
            for (int i=0; i<lista.size()-1; i++) {
                if (lista.get(i) > lista.get(i+1)) {
                    int aux = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, aux);
                }
            }
        }
    }
}
