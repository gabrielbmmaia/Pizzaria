package br.com.gabrielbmmaia.pepe_pizza;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Pizza {

    private String tamanho;
    private int sabor;
    private boolean bordaRecheada = false;
    private double valor;
    private String ingredientes;

    public String getIngredientes() {
        return ingredientes;
    }

    /*public double getValor() {
        switch (sabor) {
            case 1:


        }
    }*/


    public void setIngredientes(String ingredientes) {
        ;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        switch (this.sabor) {
            case 1:
                System.out.println("Pepperoni");
                this.valor += 15;
                break;
            case 2:
                System.out.println("Quatro Queijos");
                this.valor += 15;
                break;
            case 3:
                System.out.println("Calabresa");
                this.valor += 10;
                break;
            case 4:
                System.out.println("Alho e Óleo");
                this.valor += 5;
                break;
            case 5:
                System.out.println("Frango e Catupiry");
                this.valor += 10;
                break;
            case 6:
                System.out.println("Marguerita");
                this.valor += 5;
                break;
        }
        return null;
    }


    public boolean getBordaRecheada() {
        if (bordaRecheada) {
            System.out.println("Borda Recheada");
            return true;
        }
        return false;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
}
