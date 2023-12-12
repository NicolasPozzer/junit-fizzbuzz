package org.example;

import java.util.ArrayList;
import java.util.List;

public class Logica {
    public static List<String> getLista() {
        List<String> listaPosiciones = new ArrayList<>();
        listaPosiciones.add("1");
        listaPosiciones.add("2");
        listaPosiciones.add("3");
        listaPosiciones.add("4");

        return listaPosiciones;
    }

    /* del 0 al 100 cuando es multiplo de 3 dice -> Fizz y cuando es
    * multiplo de 5 dice -> Buzz */

    public List<String> fizzBuzz(){

        List<String> lista = new ArrayList<>();

        for (int i = 0; i <= 100; i++){

            if (i % 3 == 0 && i % 5 == 0){
                lista.add("FizzBuzz");

            } else if (i % 3 == 0) {
                lista.add("Fizz");

            } else if (i % 5 == 0) {
                lista.add("Buzz");
            }
            else {
                lista.add(String.valueOf(i));
            }

        }

        return lista;

    }


}
