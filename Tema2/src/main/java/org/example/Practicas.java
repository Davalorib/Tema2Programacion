package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicas {

    public void practica1(){

        Scanner entrada = new Scanner(System.in);

        int dia1 = 0;
        int mes1 = 0;
        int anyo1 = 0;
        boolean r1 = true;

        System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ");

        while(r1) {
            try {
                String fecha = entrada.nextLine();

                char barra1 = fecha.charAt(2);//cojo la primera barra
                char barra2 = fecha.charAt(5);//cojo la segunda barra

                if (barra1 != '/' || barra2 != '/'){//sinceramente estuve probando un monton y con ' en vez de " me funciono, asi que asi se queda

                    System.out.println("Por favor, usa el formato correcto.");
                    System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ");

                } else {

                    String dia = fecha.substring(0, 2);//escojo solo el dia
                    dia1 = Integer.parseInt(dia);//convierto el dia en int
                    String mes = fecha.substring(3, 5);//escojo solo el mes
                    mes1 = Integer.parseInt(mes);//convierto el mes en int
                    String anyo = fecha.substring(6, 10);//escojo solo el año
                    anyo1 = Integer.parseInt(anyo);//convierto el año en int

                    if (dia1 >= 1 && dia1 <= 31 && mes1 >= 1 && mes1 <= 12 && anyo1 >= 1900 && anyo1 <= 2024) {//puse el año entre 1900-2024 porque no creo que nadie haya nacido antes del 1900
                        r1 = false;

                    } else {
                        System.out.println("Por favor, introduce unos números válidos: ");
                    }
                }
            //el 1º para cuando coje algo que no es numero, el 2º para no poner letras, el 3º por si no se pone nada
            }catch(NumberFormatException | InputMismatchException | StringIndexOutOfBoundsException er){
                System.out.println("ERROR...");
                System.out.println(" ");
                System.out.println("Por favor, introduce unos números válidos: ");
                entrada.nextLine();
            }
        }

        int suma1 = dia1 + mes1 + anyo1;//sumo el dia, mes y año
        String suma2 = Integer.toString(suma1);//convierto la suma anterior en string
        char nc1 = suma2.charAt(0);//escojo el primer valor
        int n1 = Integer.parseInt(String.valueOf(nc1));//convierto el primer valor en int (String.valueOf lo he puesto para cogerlo de string en vez de char)
        char nc2 = suma2.charAt(1);//escojo el segundo valor
        int n2 = Integer.parseInt(String.valueOf(nc2));//convierto el primer valor en int
        char nc3 = suma2.charAt(2);//escojo el tercer valor
        int n3 = Integer.parseInt(String.valueOf(nc3));//convierto el primer valor en int
        char nc4 = suma2.charAt(3);//escojo el cuarto valor
        int n4 = Integer.parseInt(String.valueOf(nc4));//convierto el primer valor en int
        int suma3 = n1+n2+n3+n4;//sumo los valores

        System.out.println(" ");
        System.out.println(dia1 +"+"+ mes1 +"+"+ anyo1 +" = "+ suma1);
        System.out.println(n1 +"+"+ n2 +"+"+ n3 +"+"+ n4 +" = "+ suma3);
        System.out.println(" ");
        System.out.println("Número de la suerte: "+ suma3);

    }
}