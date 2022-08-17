package br.com.gabrielbmmaia.pepe_pizza;



public class Pizza {

    private int tamanho;
    private String escolhaTamanho;
    private int sabor;
    private String escolhaSabor;
    private int bordaRecheada;
    private static double valor = 0;

    public double getValor() {
        return this.valor;
    }

    public String getTamanho() {
        switch (this.tamanho){
            case 1:
                this.escolhaTamanho = "Pequena";
                break;
            case 2:
                this.escolhaTamanho = "Média";
                break;
            case 3:
                this.escolhaTamanho = "Grande";
                break;
            case 4:
                this.escolhaTamanho = "Família";
                break;
        }
        return this.escolhaTamanho;
    }

    public void setTamanho(int tamanho) {
        switch(tamanho){
            case 1:
                this.tamanho = tamanho;
                this.valor += 15;
                break;
            case 2:
                this.tamanho = tamanho;
                this.valor +=  20;
                break;
            case 3:
                this.tamanho = tamanho;
                this.valor += 25;
                break;
            case 4:
                this.tamanho = tamanho;
                this.valor += 30;
                break;
        }
    }

    public void setSabor(int sabor) {
        if(sabor == 1 | sabor == 2){
            this.sabor = sabor;
            this.valor += 15;
        }
        if(sabor == 3){
            this.sabor = sabor;
            this.valor += 10;
        }
        if(sabor == 4 | sabor == 5){
            this.sabor = sabor;
            this.valor += 5;
        }
    }
    public String getSabor() {
        switch (this.sabor) {
            case 1:
                this.escolhaSabor = "Pepperoni";
                break;
            case 2:
                this.escolhaSabor = "Quatro Queijos";
                break;
            case 3:
                this.escolhaSabor = "Frango e Catupiry";
                break;
            case 4:
                this.escolhaSabor = "Calabresa";
                break;
            case 5:
                this.escolhaSabor = "Marguerita";
                break;
        }
        return this.escolhaSabor;
    }


    public String getBordaRecheada() {
        if (bordaRecheada == 2) {
            return "Borda Recheada";
        }else {
            return "Sem Borda Recheda";
        }
    }

    public void setBordaRecheada(int bordaRecheada) {
        if (bordaRecheada == 2) {
            this.bordaRecheada=bordaRecheada;
            valor += 5;
        }else {
            this.bordaRecheada = bordaRecheada;
        }
    }
}
