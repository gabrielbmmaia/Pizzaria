package br.com.gabrielbmmaia.pepe_pizza;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private String rua;
    private int numero;
    private String complemento;
    private String contato;


    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }
}