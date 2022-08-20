package br.com.gabrielbmmaia.pepe_pizza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws InterruptedException {
            Pedido pedido = new Pedido();
            try {
                pedido.fazerPedido();
            } catch (OpcaoInvalidaException | InputMismatchException ex) {
                System.out.println("Opção Inválida");;
            }
        }
}
