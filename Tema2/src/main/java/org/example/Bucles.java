package org.example;

import java.util.Scanner;

public class Bucles {

    public void ej1(){

        Scanner entrada = new Scanner(System.in);



    }

    public void ej2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();

        for (int i=num; i>=1; i--){

            if (i%2==0) {
                System.out.println(i);
            }


        }
    }


}
