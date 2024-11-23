package org.example;

public class Fila<T> extends EstruturaEstatica <T> {

    public Fila (int capacidade) {
        super(capacidade);
    }

    public Fila () {
        super();
    }

    public T espiar () {
        if(!vazio()) {
            return this.elemento[0];
        }
        return null;
    }

    public void enfilerar (T elemento) {
        super.adicionar(elemento);
    }

    public void desenfileirar () {
        super.remover(espiar());
    }

}
