package org.example;

import javax.swing.*;
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


    public void practica3() {

        Scanner ent = new Scanner(System.in);

        int suma = 0;
        int sumaf = 0;
        int j = 10;
        int i;
        int h;
        boolean a = true;

        while (a) {
            try { //el try
                System.out.println("Escribe tu ISBN: ");
                String isbn = ent.next();
                int tamanyo = isbn.length(); //nos calcula el tamaño de nuestra entrada

                if (tamanyo != 10) { //si no hemos puesto 10 caracteres muestra un mensaje y con un continue volvemos a pedir el isbn
                    System.out.println("ERROR... El ISBN tiene que tener 10 caracteres");
                    System.out.println(" ");
                    continue;
                }

                String reemX = isbn.replace("X", ""); //reemplazo las X por nada
                int tamanyoX = reemX.length(); //medimos el nuevo numero reemplazado

                int finalX = tamanyo-tamanyoX; //restamos el numero con X menos el sin X

                if (finalX != 1 && finalX != 0){ //si esa resta es distinta de 1 y 0
                    System.out.println("ERROR... Solo puedes poner una X"); //dice que solo puedes poner una
                    System.out.println(" ");
                    continue; //volvemos
                }

                String reemSigno = isbn.replace("?", ""); //reemplazo las ? por nada
                int tamanyoSigno = reemSigno.length(); //medimos el nuevo numero reemplazado

                int finalSigno = tamanyo-tamanyoSigno; //restamos el numero con ? menos el sin ?

                if (finalSigno != 1 && finalSigno != 0){ //si esa resta es distinta de 1 y 0
                    System.out.println("ERROR... Solo puedes poner una ?"); //dice que solo puedes poner una
                    System.out.println(" ");
                    continue; //volvemos
                }

                int pos = isbn.lastIndexOf("?"); //nos mira la posicion de '?'

                for (i = 0; i <= 9; i++) { //bucle for

                    char nc = isbn.charAt(i); //vamos cogiendo las posiciones

                    if (nc == 'X') { //si se encuentra una X suma 10 y con un continue hacemos el siguiente for
                        sumaf += 10;
                        j--;
                        continue;

                    } else if (nc == '?') { //si se encuentra un ? no hace ninguna operacion y hacemos el siguiente for
                        j--;
                        continue;
                    }

                    int n = Integer.parseInt(String.valueOf(nc)); //convertimos el valor nc de char a int
                    suma = n * j; //una variable suma en la que multiplicamos ese valor por j (en este primer ciclo es 10)
                    sumaf += suma; //una variable sumaf en la que vamos sumando la variable suma y actualizando el valor cada vez
                    j--; //restamos 1 a j (en este primer ciclo 10-1)
                }

                a = false; //negamos el booleano para que no repita nada (lo podria haber negado antes pero da igual)

                if (pos != -1) { //si no encuentra ningun '?', lo almacena como -1, entonces este if funciona solo cuando hay algun '?'
                    int rep = 10-pos; //una variable rep en la que restamos 10 a la posicion para quedarnos con el valor que deberia multiplicarse

                    for (h = 1; h<=10; h++){ //otro for para ir haciendo ciclos hasta encontrar el número válido
                        int rep2 = rep*h+sumaf; //una variable rep2 en la que vamos multiplicando la variable rep por números del 1 al 10 y luego añadiendolos a sumaf
                        if (rep2%11 == 0){ //cuando al dividir rep2 entre 11 nos de resto 0, terminamos el for con un break, guardandonos así el número correcto
                            break;
                        }
                    }

                    System.out.println("El dígito que te falta es "+ (h == 10 ? "X" : h)); //añadí lo que vimos en clase porque me gustó para estos casos de print, si está al final el '?' y es 10 lo reemplaza por X
                    String reemplazo = isbn.replace("?", ""+h); //esto reemplaza el '?' por su número correcto
                    String reemplazoX = isbn.replace("?", "X"); //esto reemplaza el '?' por X
                    System.out.println("Quedando así: "+ (h == 10? reemplazoX: reemplazo)); //me parecía guay que actualizase el número corrigiendolo, esto lo hace con lo que vimos en clase que ya he dicho que me gusto para estos casos

                } else {

                    if (sumaf%11 == 0) { //si el porcentaje de sumaf es 0 te dice que es valido
                        System.out.println("Tu ISBN es válido");

                    } else { //sino es invalido
                        System.out.println("Tu ISBN no es válido");
                    }
                }

            } catch (InputMismatchException | NumberFormatException er) { //el catch
                System.out.println("ERROR... Solo puedes utilizar números, '?' o 'X'");
                System.out.println(" ");
            }
        }
    }
}