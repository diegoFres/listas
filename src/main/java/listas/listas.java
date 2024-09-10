package listas;

import java.util.*;

public class listas {

    // Método que combina dos listas ordenadas
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Combina las dos listas mientras haya elementos en ambas
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Añade los elementos restantes de list1 si los hay
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        // Añade los elementos restantes de list2 si los hay
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, ingresa dos listas de números separadas por comas.");
            return;
        }

        // Convertir argumentos en listas de números
        List<Integer> list1 = convertir(args[0]);
        List<Integer> list2 = convertir(args[1]);

        // Llamada al método merge y mostrar resultado
        List<Integer> listaCombinada = merge(list1, list2);
        System.out.println("Lista combinada: " + listaCombinada);
    }

    // Método para convertir la entrada de argumentos a una lista de enteros
    private static List<Integer> convertir(String input) {
        String[] items = input.split(",");
        List<Integer> lista = new ArrayList<>();
        for (String item : items) {
            lista.add(Integer.parseInt(item.trim()));
        }
        return lista;
    }
}