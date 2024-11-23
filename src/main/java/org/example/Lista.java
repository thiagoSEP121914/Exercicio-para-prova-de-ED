package org.example;

public class Lista<T> extends EstruturaEstatica <T> {

    public Lista (int capacidade) {
        super(capacidade);
    }

    public Lista () {
        super();
    }

    public void add (T elemento) {
        super.adicionar(elemento);
    }



}
