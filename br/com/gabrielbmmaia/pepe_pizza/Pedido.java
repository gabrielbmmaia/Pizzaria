package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Pedido {

    Cliente cliente = new Cliente();
    Pizza pizza = new Pizza();
    Scanner sc = new Scanner(System.in);

    public void fazerPedido() {
        System.out.println("-----------------------------------");
        System.out.println("-> Este é nosso cardápio! Deseja qual sabor? <-\n");
        System.out.println("1 - Pepperoni (+ R$ 15,00) \n(Molho de Tomate - Mussarela - Pepperoni)\n");
        System.out.println("2 - Quatro Queijos (+ R$ 15,00)\n(Molho de Tomate - Mussarela - Parmesão - Provolone - Gorgonzola)\n");
        System.out.println("3 - Frango e Catupiry (+ R$ 10,00)\n(Molho de Tomate - Mussarela - Frango Desfiado - Catupiry - Cebola)\n");
        System.out.println("4 - Calabresa (+ R$ 5,00)\n(Molho de Tomate - Mussarela - Calabresa - Cebola)\n");
        System.out.println("5 - Marguerita (+ R$ 5,00)\n(Molho de Tomate - Mussarela - Tomate - Mangericão)\n");
        pizza.setSabor(sc.nextInt());
        System.out.println("-----------------------------------");
        System.out.println("-> Agora, qual seria o tamanho da pizza? <-");
        System.out.println("1 - Pequena (+ R$ 15,00)");
        System.out.println("2 - Média (+ R$ 20,00)");
        System.out.println("3 - Grande (+ R$ 25,00)");
        System.out.println("4 - Família (+ R$ 30,00)");
        pizza.setTamanho(sc.nextInt());
        System.out.println("-----------------------------------");
        System.out.println("-> Gostaria de Borda Recheda ? <-");
        System.out.println("1 - Sem Borda Recheada");
        System.out.println("2 - Com Borda Recheada (+ R$ 5,00)");
        pizza.setBordaRecheada(sc.nextInt());
        System.out.println("-----------------------------------");
        System.out.println("Total do pedido: " + pizza.getValor());
        System.out.println("-----------------------------------");


    }
}
