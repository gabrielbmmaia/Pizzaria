package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Pedido {

    private int resposta = 1;
    Pizza pizza = new Pizza();
    Scanner sc = new Scanner(System.in);

    public void fazerPedido() {
        System.out.println("------------------------------");
        System.out.println("-> Este é nosso cardápio! Deseja qual sabor? <-\n");
        System.out.println("1 - Pepperoni \n(Molho de Tomate - Mussarela - Pepperoni)\n");
        System.out.println("2 - Quatro Queijos \n(Molho de Tomate - Mussarela - Parmesão - Provolone - Gorgonzola)\n");
        System.out.println("3 - Calabresa \n(Molho de Tomate - Mussarela - Calabresa - Cebola)\n");
        System.out.println("4 - Frango e Catupiry \n(Molho de Tomate - Mussarela - Frango Desfiado - Catupiry - Cebola)\n");
        System.out.println("5 - Marguerita \n(Molho de Tomate - Mussarela - Tomate - Mangericão)\n");
        pizza.setSabor(sc.nextInt());
        System.out.println("------------------------------");
        System.out.println("-> Agora, qual seria o tamanho da pizza? <-");
        System.out.println("1 - Pequena");
        System.out.println("2 - Média");
        System.out.println("3 - Grande");
        System.out.println("4 - Família");
        pizza.setTamanho(sc.nextInt());
        System.out.println("------------------------------");
        System.out.println("-> Gostaria de Borda Recheda ? <-");
        System.out.println("1 - Sem Borda Recheada");
        System.out.println("2 - Com Borda Recheada");
        pizza.setBordaRecheada(sc.nextInt());
        System.out.println("------------------------------");

    }
}
