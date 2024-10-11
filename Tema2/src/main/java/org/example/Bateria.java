package org.example;

import java.util.Scanner;

public class Bateria {

    public void bateria_1(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase a eleccción: ");

        String frase = entrada.nextLine();

        System.out.println("Tu frase: " + frase);
        System.out.println("");

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        String noespacios = frase.replace(" ", "");
        System.out.println("La frase sin espacios --> " + noespacios);

    }

    public void bateria_4(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase a eleccción: ");
        String frase = entrada.nextLine();

        System.out.println("Introduce una subcadena: ");
        String subcadena = entrada.nextLine();

    }

    public void bateria_5(){



    }
}