package br.com.gabrielbmmaia.pepe_pizza;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static int resposta;
        public static void main(String[] args) {

            System.out.println("--- Bem-Vindo a Pizzaria Pepe! ---");
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.println("1- Pepperoni");
            System.out.println("2- 4 Queijos");
            resposta =sc.nextInt();
            if(resposta == 2){
                System.out.println("oi peu");
            }


    }
}
