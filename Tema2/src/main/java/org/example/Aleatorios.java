package org.example;

import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

    public void random(){

        Random aleatorio = new Random();

        int num = aleatorio.nextInt();
        System.out.println(num);

        num = aleatorio.nextInt(899) +100;
        System.out.println(num);

        double num_d = aleatorio.nextDouble() *3 +1;
        System.out.println(num_d);

        double num_m = Math.random()*3 +1;
        System.out.println(num_m);


    }

    public void ej1(){

        Random al = new Random();

        int dado1 = al.nextInt(6) +1;
        System.out.println("Dado1: " +dado1);

        int dado2 = al.nextInt(6) +1;
        System.out.println("Dado2: " +dado2);

        System.out.println("Suma: " +(dado1+dado2));

    }

    public void ej2(){

        Random al = new Random();

        String carac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contra = "";

        int posi;

        for(int i=0; i<longitud; i++){

            posi = al.nextInt(carac.length());
            contra += carac.charAt(posi);

        }

        System.out.println("La contraseña generada es: "+ contra);

    }

    public void ej3(){

        Random al = new Random();
        Scanner ent = new Scanner(System.in);

        System.out.println("Me vas a dar un rango para tus números random");

        int nummin = 0;
        int nummax = 0;

        do {
            System.out.println("Dame tu mínimo: ");
            nummin = ent.nextInt();
            System.out.println("Dame tu máximo: ");
            nummax = ent.nextInt();
            System.out.println(" ");

            if (nummax<=nummin){
                System.out.println("Tu mínimo tiene que ser menor que tu máximo");
            }

        } while(nummax<=nummin);

        System.out.println("Cuántos números quieres generar? ");
        int gen = ent.nextInt();
        System.out.println(" ");

        for (int i=1; i<=gen; i++){

            int numran = al.nextInt(nummax - nummin + 1) +nummin;
            System.out.println(numran);

        }
    }

    public void ej4(){

        Random al = new Random();

        String carac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = al.nextInt(3) +6;

        String contra = "";

        int posi;

        for(int i=0; i<longitud; i++){

            posi = al.nextInt(carac.length());
            contra += carac.charAt(posi);

        }

        System.out.println("La contraseña generada es: "+ contra);

    }

}