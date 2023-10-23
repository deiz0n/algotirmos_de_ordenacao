package application;

import java.util.ArrayList;
import java.util.List;


public class App {
    
    public static void main(String[] args)  {


        List<Integer> lista = 
        new ArrayList<>(List.of(3, 3, 1, 5, 23, 0, 3, 2, 8, 10, -1));

        List<Integer> listaOrdenada =
        new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        System.out.println("Lista Original: " + lista);

        
        
        System.out.println("Lista Ordenada: " + lista);

    }
}
