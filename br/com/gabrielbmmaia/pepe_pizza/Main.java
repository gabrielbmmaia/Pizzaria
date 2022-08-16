package br.com.gabrielbmmaia.pepe_pizza;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static int resposta;
        public static void main(String[] args) {

            System.out.println("--- Bem-Vindo a Pizzaria Pepe! ---");
            Scanner sc = new Scanner(System.in);
            Pizza pizza = new Pizza();
            System.out.println("-> Este é nosso cardápio! Deseja qual sabor? <-");
            System.out.println("1 - Pepperoni");
            System.out.println("2 - Quatro Queijos");
            System.out.println("3 - Calabresa");
            System.out.println("4 - Frango e Catupiry");
            System.out.println("5 - Marguerita");
            pizza.setSabor(sc.nextInt());
            System.out.println("! Ótima Escolha !");
            System.out.println("-> Agora, qual seria o tamanho da pizza? <-");
            System.out.println("1 - Pequena");
            System.out.println("2 - Média");
            System.out.println("3 - Grande");
            System.out.println("4 - Família");



    }
}
