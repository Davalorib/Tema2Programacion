package org.example;

import java.util.Scanner;

public class Excepciones {

    public void excepcion(){

        Scanner teclado = new Scanner(System.in);
        boolean error = false;

        System.out.println("Dividendo: ");
        int dividendo = 0;

        if(teclado.hasNextInt()){
            dividendo = teclado.nextInt();
        }else{
            System.out.println("Has introducido un formato incorrecto");
            error = true;
        }

        System.out.println("Divisor: ");
        String divisor = teclado.next();
        int divisor_entero = 0;

        try{
            divisor_entero = Integer.parseInt(divisor);
        }catch(NumberFormatException e1){
            System.out.println("El divisor no es un número. " + e1.getMessage());
        }

        int resultado = 0;

        try {
            resultado = dividendo/divisor_entero;
        }catch(ArithmeticException e2){
            System.out.println("No se puede dividir entre 0" + e2.getMessage());
        }

        System.out.println("Resultado: " + resultado);

    }
}
