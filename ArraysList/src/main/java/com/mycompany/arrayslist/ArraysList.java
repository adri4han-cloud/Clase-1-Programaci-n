
package com.mycompany.arrayslist;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<String> listaCompras = new ArrayList<>();

        listaCompras.add("Pan");
        listaCompras.add("Leche");
        listaCompras.add("Huevos");
        listaCompras.add("Frutas");

        System.out.println("Lista de Compras:");

        for (String item : listaCompras) {
            System.out.println(item);
        }
    }
}
