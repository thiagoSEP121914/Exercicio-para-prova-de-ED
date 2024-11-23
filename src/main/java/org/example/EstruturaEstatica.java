package org.example;

public class EstruturaEstatica<T> {

    public T[] elemento;
    protected int tamanho;


    public T getElemento(int index) {
        return this.elemento[index];
    }

    public EstruturaEstatica (int capacidade) {
        this.elemento = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public EstruturaEstatica () {
        this(10);
    }

    public void aumentarCapacidade () {
        if (this.tamanho == this.elemento.length) {
            T[] novoVetor = (T[]) new Object[elemento.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoVetor[i] = this.elemento[i];
            }
            this.elemento = novoVetor;
        }
    }

    public void adicionar (T elemento) {
        if (this.tamanho >= this.elemento.length) {
            aumentarCapacidade();
        }
        this.elemento[tamanho] = elemento;
        tamanho++;
    }
    public void atualizar (int index, T elemento) {
        if (index > 0 && index < this.elemento.length) {
            this.elemento[index] = elemento;
        }
    }

    private int busca (T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elemento == this.elemento[i]) {
                return i;
            }
        }
        return -1;
    }

    protected void remover (int index) {
        if (index < this.tamanho ) {
            for (int i = index; i < this.tamanho; i++) {
                this.elemento[i] = this.elemento[i + 1];
            }
            this.elemento[this.tamanho - 1] = null;
            tamanho--;
        }
    }

    public void remover (T elemento) {
        int index = busca(elemento);
        if (index != -1) {
            for (int i = index; i < this.tamanho; i++) {
                   this.elemento[i] = this.elemento[i+1];
            }
            this.elemento[tamanho - 1] = null;
            tamanho--;
        } else {
            throw new IllegalArgumentException("O elemento nao existe!");
        }
    }

    protected boolean vazio () {
     return this.tamanho == 0;
    }

    public void limpar () {
        this.elemento = null;
        this.tamanho = 0;
    }

    public String toString () {
        StringBuilder s = new StringBuilder();
        if (vazio()) {
            s.append("[]");
            return s.toString();
        }
        s.append("[");
        for (int i = 0; i < this.tamanho -1; i++) {
            s.append(this.elemento[i]);
            s.append(",");
        }
        s.append(this.elemento[this.tamanho -1]);
        s.append("]");
        return s.toString();
    }

}
