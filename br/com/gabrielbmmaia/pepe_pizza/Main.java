package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws InterruptedException {

            System.out.println("-----------------------------------");
            System.out.println("---> Bem-Vindo a Pizzaria Pepe <---");

            Pedido pedido = new Pedido();
            try {
                pedido.fazerPedido();
            } catch (OpcaoInvalidaException ex) {
                System.out.println("Opção Inválida");;
            }
        }
}
