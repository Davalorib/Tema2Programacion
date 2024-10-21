package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicas {

    public void practica1() {

        Scanner entrada = new Scanner(System.in);

        int dia1 = 0;
        int mes1 = 0;
        int anyo1 = 0;
        boolean r1 = true;

        System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ");

        while (r1) {
            try {
                String fecha = entrada.next();

                char barra1 = fecha.charAt(2);//cojo la primera barra
                char barra2 = fecha.charAt(5);//cojo la segunda barra

                if (barra1 != '/' || barra2 != '/') {//sinceramente estuve probando un monton y con ' en vez de " me funciono, asi que asi se queda

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
                //el 1º para cuando coge algo que no es numero, el 2º para no poner letras, el 3º por si no se pone nada
            } catch (NumberFormatException | InputMismatchException er) {
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
        int suma3 = n1 + n2 + n3 + n4;//sumo los valores

        System.out.println(" ");
        System.out.println(dia1 + "+" + mes1 + "+" + anyo1 + " = " + suma1);
        System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + " = " + suma3);
        System.out.println(" ");
        System.out.println("Número de la suerte: " + suma3);

    }


    public void practica2() {

        Scanner elec = new Scanner(System.in);

        int eleccion = 0;
        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        boolean rep1 = true;
        boolean rep2 = true;
        boolean rep3 = true;
        boolean rep4 = true;
        boolean rep5 = true;

        System.out.println("------------CALCULADORA------------");
        System.out.println(" ");
        System.out.println("Por favor, introduce el primer operando: ");

        while (rep1) {

            try {
                num1 = elec.nextInt();
                rep1 = false;

            } catch (InputMismatchException er) {
                System.out.println(" ");
                System.out.println("ERROR... Elige un valor válido: ");
                elec.nextLine();
            }
        }

        System.out.println("Elige la operación que deseas: ");

        while (rep2) {
            System.out.println("Sumar: +      Restar: -       Multiplicar: x       Dividir: /       Raíz: r");
            System.out.println(" ");

            String numelec = elec.next();
            System.out.println(" ");

            while (rep4) {
                try {
                    switch (numelec) {

                        case "+":
                            rep2 = false;
                            System.out.println("Has elegido sumar");

                            System.out.println("Introduce el segundo número");
                            num2 = elec.nextFloat();

                            resultado = num1 + num2;
                            System.out.println(" ");
                            System.out.println("El resultado de la suma es " + resultado);
                            rep4 = false;


                            break;

                        case "-":
                            rep2 = false;
                            System.out.println("Has elegido restar");

                            System.out.println("Introduce el segundo número");
                            num2 = elec.nextFloat();

                            resultado = num1 - num2;
                            System.out.println(" ");
                            System.out.println("El resultado de la resta es " + resultado);

                            break;

                        case "x":
                            rep2 = false;
                            System.out.println("Has elegido multiplicar");

                            System.out.println("Introduce el segundo número");
                            num2 = elec.nextFloat();

                            resultado = num1 * num2;
                            System.out.println(" ");
                            System.out.println("El resultado de la multiplicación es " + resultado);

                            break;

                        case "/":
                            rep2 = false;
                            System.out.println("Has elegido dividir");

                            System.out.println("Introduce el divisor: ");

                            while (rep3) {
                                num2 = elec.nextFloat();

                                if (num2 != 0) {
                                    rep3 = false;
                                    resultado = num1 / num2;
                                    System.out.println(" ");
                                    System.out.println("El resultado de la división es " + resultado);

                                } else {
                                    System.out.println("ERROR... No se puede divir entre 0");
                                    System.out.println("Introduce otro divisor: ");
                                }
                            }
                            break;

                        case "r":
                            rep2 = false;
                            System.out.println("Has elegido raíz cuadrada");

                            while (rep5) {
                                if (num1 >= 0) {
                                    resultado = (float) Math.sqrt(num1);
                                    System.out.println(" ");
                                    System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
                                    rep5 = false;
                                } else {
                                    System.out.println("No puedo hacer la raíz cuadrada de un número negativo");
                                    System.out.println("Elige un número positivo por favor: ");
                                    num1 = elec.nextFloat();
                                }
                            }
                            break;

                        default:
                            System.out.println("ERROR... Elige uno de los siguientes caracteres:");
                            break;

                    }
                    break;

                } catch (InputMismatchException er) {
                    System.out.println(" ");
                    System.out.println("ERROR... Elige un valor válido");
                    System.out.println(" ");
                    elec.nextLine();

                }
            }
        }
    }


    public void practica3(){

        Scanner ent = new Scanner(System.in);

        int suma = 0;
        int sumaf = 0;
        int j = 10;

        System.out.println("Escribe tu ISBN: ");
        String isbn2 = ent.next();

        for (int i=0; i<=10; i++){

            char nc = isbn2.charAt(i);
            int n = Integer.parseInt(String.valueOf(nc));
            suma = n*j;
            sumaf += suma;
            j--;
        }

        System.out.println(sumaf);

//        char n0c = isbn2.charAt(9);
//        int n0 = Integer.parseInt(String.valueOf(n0c));
//        char n1c = isbn2.charAt(8);
//        int n1 = Integer.parseInt(String.valueOf(n1c));
//        char n2c = isbn2.charAt(7);
//        int n2 = Integer.parseInt(String.valueOf(n2c));
//        char n3c = isbn2.charAt(6);
//        int n3 = Integer.parseInt(String.valueOf(n3c));
//        char n4c = isbn2.charAt(5);
//        int n4 = Integer.parseInt(String.valueOf(n4c));
//        char n5c = isbn2.charAt(4);
//        int n5 = Integer.parseInt(String.valueOf(n5c));
//        char n6c = isbn2.charAt(3);
//        int n6 = Integer.parseInt(String.valueOf(n6c));
//        char n7c = isbn2.charAt(2);
//        int n7 = Integer.parseInt(String.valueOf(n7c));
//        char n8c = isbn2.charAt(1);
//        int n8 = Integer.parseInt(String.valueOf(n8c));
//        char n9c = isbn2.charAt(0);
//        int n9 = Integer.parseInt(String.valueOf(n9c));

//        int suma = n9*10 + n8*9 + n7*8 + n6*7 + n5*6 + n4*5 + n3*4 + n2*3 + n1*2 + n0;
//        sumaf %= 11;
//
//        if (sumaf == 0){
//            System.out.println("Tu ISBN es válido");
//
//        } else {
//            System.out.println("Tu ISBN no es válido");
//
//        }
    }
}