package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            System.out.println("-----------------------------------");
            System.out.println("---> Bem-Vindo a Pizzaria Pepe <---");
            Pedido pedido = new Pedido();
            pedido.fazerPedido();
        }
}
