package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Pedido {

    Cliente cliente = new Cliente();
    Pizza pizza = new Pizza();
    Scanner sc = new Scanner(System.in);

    public void fazerPedido() {
        System.out.println("-----------------------------------\n" +
                            "-> Este é nosso cardápio! Deseja qual sabor? <-\n\n" +
                            "1 - Pepperoni (+ R$ 15,00) \n(Molho de Tomate - Mussarela - Pepperoni)\n" +
                            "2 - Quatro Queijos (+ R$ 15,00)\n(Molho de Tomate - Mussarela - Parmesão - Provolone - Gorgonzola)\n" +
                            "3 - Frango e Catupiry (+ R$ 10,00)\n(Molho de Tomate - Mussarela - Frango Desfiado - Catupiry - Cebola)\n" +
                            "4 - Calabresa (+ R$ 5,00)\n(Molho de Tomate - Mussarela - Calabresa - Cebola)\n" +
                            "5 - Marguerita (+ R$ 5,00)\n(Molho de Tomate - Mussarela - Tomate - Mangericão)");
        pizza.setSabor(sc.nextInt());
        System.out.println("-----------------------------------\n" +
                            "-> Agora, qual seria o tamanho da pizza? <-\n" +
                            "1 - Pequena (+ R$ 15,00)\n" +
                            "2 - Média (+ R$ 20,00)\n" +
                            "3 - Grande (+ R$ 25,00)\n" +
                            "4 - Família (+ R$ 30,00)");
        pizza.setTamanho(sc.nextInt());
        System.out.println("-----------------------------------\n" +
                            "-> Gostaria de Borda Recheda ? <-\n" +
                            "1 - Sem Borda Recheada\n" +
                            "2 - Com Borda Recheada (+ R$ 5,00)");
        pizza.setBordaRecheada(sc.nextInt());
        System.out.println("-----------------------------------");
        System.out.println("Total do pedido: " + pizza.getValor());
        System.out.println("-----------------------------------");


    }
}
