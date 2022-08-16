package br.com.gabrielbmmaia.pepe_pizza;



public class Pizza {

    private int tamanho;
    private int sabor;
    private int bordaRecheada;
    private double valor;




    public double getValor() {
        return this.valor;
    }

    public String getTamanho() {
        switch (this.tamanho){
            case 1:
                System.out.println("Pequena");
            case 2:
                System.out.println("Média");
            case 3:
                System.out.println("Grande");
            case 4:
                System.out.println("Família");
        }
        return null;
    }

    public void setTamanho(int tamanho) {
        switch(tamanho){
            case 1:
                this.tamanho = tamanho;
                this.valor += 15;
            case 2:
                this.tamanho = tamanho;
                this.valor += 20;
            case 3:
                this.tamanho = tamanho;
                this.valor += 25;
            case 4:
                this.tamanho = tamanho;
                this.valor += 30;
        }
    }

    public void setSabor(int sabor) {
        switch (this.sabor){
            case 1:
                this.sabor = sabor;
                this.valor += 15;
                break;
            case 2:
                this.sabor = sabor;
                this.valor += 15;
                break;
            case 3:
                this.sabor = sabor;
                this.valor += 5;
                break;
            case 4:
                this.sabor = sabor;
                this.valor += 10;
                break;
            case 5:
                this.sabor = sabor;
                this.valor += 5;
                break;

        }

    }


    public String getSabor() {
        switch (this.sabor) {
            case 1:
                System.out.println("Pepperoni");
                break;
            case 2:
                System.out.println("Quatro Queijos");
                break;
            case 3:
                System.out.println("Calabresa");
                break;
            case 4:
                System.out.println("Frango e Catupiry");
                break;
            case 5:
                System.out.println("Marguerita");
                break;
        }
        return null;
    }


    public String getBordaRecheada() {
        if (bordaRecheada == 2) {
            return "Borda Recheada";
        }
        return "Sem Borda Recheda";
    }

    public void setBordaRecheada(int bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
}
