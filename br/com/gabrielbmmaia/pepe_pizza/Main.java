package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws InterruptedException {

            System.out.println("-----------------------------------");
            System.out.println("---> Bem-Vindo a Pizzaria Pepe <---");

            Pedido pedido = new Pedido();
            pedido.fazerPedido();

            System.out.println("Processando...");
            Thread.sleep(250);

            System.out.println("-----------------------------------");
            System.out.println("--------> DADOS DO PEDIDO <--------");
            System.out.println("Sabor: " + pedido.pizza.getSabor());
            System.out.println("Tamanho: " + pedido.pizza.getTamanho());
            System.out.println(pedido.pizza.getBordaRecheada());
            System.out.println(pedido.pizza.getBordaRecheada());

        }
}
