package org.example;

import java.lang.reflect.Array;
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

    public void fizzBuzz(){

        for (int i = 0; i <= 99; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }

        }

    }


}
