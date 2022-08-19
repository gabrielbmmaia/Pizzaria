package br.com.gabrielbmmaia.pepe_pizza;

public class OpcaoInvalidaException extends RuntimeException{

    public OpcaoInvalidaException(String msg){
        super(msg);
    }

}
