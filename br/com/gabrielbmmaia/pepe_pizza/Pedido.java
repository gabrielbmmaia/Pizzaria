package br.com.gabrielbmmaia.pepe_pizza;

import java.util.Scanner;

public class Pedido {
    Cliente cliente = new Cliente();
    Pizza pizza = new Pizza();
    Scanner sc = new Scanner(System.in);

    public void fazerPedido() throws InterruptedException {

        System.out.println("-----------------------------------\n" +
                            "-> Este é nosso cardápio! Deseja qual sabor? <-\n\n" +
                            "1 - Pepperoni (+ R$ 15,00) \n(Molho de Tomate - Mussarela - Pepperoni)\n" +
                            "2 - Quatro Queijos (+ R$ 15,00)\n(Molho de Tomate - Mussarela - Parmesão - Provolone - Gorgonzola)\n" +
                            "3 - Frango e Catupiry (+ R$ 10,00)\n(Molho de Tomate - Mussarela - Frango Desfiado - Catupiry - Cebola)\n" +
                            "4 - Calabresa (+ R$ 5,00)\n(Molho de Tomate - Mussarela - Calabresa - Cebola)\n" +
                            "5 - Marguerita (+ R$ 5,00)\n(Molho de Tomate - Mussarela - Tomate - Mangericão)");
        pizza.setSabor(sc.nextInt());

        System.out.println("-----------------------------------\n" +
                            "Valor Atual: R$ "+ pizza.getValor() + "\n" +
                            "-----------------------------------\n" +
                            "-> Agora, qual seria o tamanho da pizza? <-\n" +
                            "1 - Pequena (+ R$ 15,00)\n" +
                            "2 - Média (+ R$ 20,00)\n" +
                            "3 - Grande (+ R$ 25,00)\n" +
                            "4 - Família (+ R$ 30,00)");
        pizza.setTamanho(sc.nextInt());

        System.out.println("-----------------------------------\n" +
                            "Valor Atual: R$ "+ pizza.getValor() + "\n" +
                            "-----------------------------------\n" +
                            "-> Gostaria de Borda Recheda ? <-\n" +
                            "1 - Sem Borda Recheada\n" +
                            "2 - Com Borda Recheada (+ R$ 5,00)");
        pizza.setBordaRecheada(sc.nextInt());

        System.out.println("-----------------------------------");
        System.out.println("Total do pedido: R$ " + pizza.getValor());
        System.out.println("-----------------------------------");

        Cliente cliente = new Cliente();

        System.out.println("-> Agora, precisamos de algumas informações para a entrega <-");
        System.out.println("Informe seu nome:");
        String n = sc.next();
        cliente.setNome( n += sc.nextLine());

        System.out.println("Informe seu bairro:");
        String b = sc.next();
        cliente.setBairro( b += sc.nextLine());

        System.out.println("Informe sua rua:");
        String r = sc.next();
        cliente.setRua( r += sc.nextLine());

        System.out.println("Informe o número da edificação:");
        cliente.setNumero(sc.nextInt());

        System.out.println("Complemento:");
        String c = sc.next();
        cliente.setComplemento(c += sc.nextLine());

        System.out.println("Informe um número para contato: ");
        String co = sc.next();
        cliente.setContato(co += sc.nextLine());

        System.out.println("\nProcessando...\n");
        Thread.sleep(250);

        System.out.println("-----------------------------------");
        System.out.println("--------> DADOS DO PEDIDO <--------");
        System.out.println("Sabor: " + pizza.getSabor());
        System.out.println("Tamanho: " + pizza.getTamanho());
        System.out.println(pizza.getBordaRecheada());
        System.out.println("Total do pedido: R$ " + pizza.getValor());
        System.out.println("-----------------------------------");
        System.out.println("-------> DADOS DO CLIENTE <--------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Bairro: " + cliente.getBairro());
        System.out.println("Rua: " + cliente.getRua());
        System.out.println("Numero: " + cliente.getNumero());
        System.out.println("Complemento: " + cliente.getComplemento());
        System.out.println("Contato: " + cliente.getContato());
        System.out.println("-----------------------------------\n");
        System.out.println("Seu pedido sairá em instantes!");
        System.out.println("A Pizzaria Pepe agradece a preferência");
    }
}
