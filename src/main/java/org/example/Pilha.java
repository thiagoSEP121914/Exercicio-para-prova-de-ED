package org.example;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha (int capacidade) {
        super(capacidade);
    }

    public Pilha () {
        super();
    }

    public void empilhar (T elemento) {
        super.adicionar(elemento);
    }

    public T topo () {
        if(!vazio()) {
            return this.elemento[tamanho - 1];
        }
        return null;
    }

    public void desimpilhar () {

       if (!vazio()) {
           super.remover(topo());
       }

    }

}
