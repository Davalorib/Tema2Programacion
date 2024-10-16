package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Localdate {

    public void generacion(){

        System.out.println("BIENVENIDO A LA CLASIFICACIÓN DE GENERACIONES");
        System.out.println("Elige un modo: ");
        System.out.println("1. Año de nacimiento. ");
        System.out.println("2. Edad. ");

        Scanner entrada = new Scanner(System.in);

        String modo = entrada.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        int anyo_nacimiento = 1800;

        boolean error = false;

        if(modo.equals("1")){

            System.out.println("Introduce tu año de nacimiento: ");
            String anyo = entrada.next();

            try{
                anyo_nacimiento = Integer.parseInt(anyo);
            }catch(NumberFormatException e1){
                System.out.println("El formato del año no es correto. " + e1.getMessage());
            }

            if(anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual){
                System.out.println("El año introducido no es correcto. ");
                error = true;
            }

        } else if (modo.equals("2")) {

            System.out.println("Introduce tu edad: ");
            int edad = 0;

            if(entrada.hasNextInt()){
                edad = entrada.nextInt();
            }else{
                System.out.println("El formato de la edad no es correcto. ");
                error = true;
            }

            if(edad < 0){
                System.out.println("La edad introducida no es correcta. ");
                error = true;
            }else{
                anyo_nacimiento = anyo_actual - edad;
            }

        }else{
            System.out.println("El modo no existe. ");
            error = true;
        }
        if(!error){
            if(anyo_nacimiento >= 1900 && anyo_nacimiento <= 1927){
                System.out.println("Eres de la generación sin bautizar. ");
            }else if(anyo_nacimiento >= 1928 && anyo_nacimiento <= 1944){
                System.out.println("Eres de la generación silent. ");
            }else if(anyo_nacimiento >= 1945 && anyo_nacimiento <= 1964){
                System.out.println("Eres de la generación baby boomer. ");
            }else if(anyo_nacimiento >= 1965 && anyo_nacimiento <= 1981){
                System.out.println("Eres de la generación x. ");
            }else if(anyo_nacimiento >= 1982 && anyo_nacimiento <= 1994){
                System.out.println("Eres de la generación y. ");
            }else if(anyo_nacimiento >= 1995 && anyo_nacimiento <= anyo_actual){
                System.out.println("Eres de la generación z. ");
            }else{
                System.out.println("No tienes generación");

            }
        }
    }
}
