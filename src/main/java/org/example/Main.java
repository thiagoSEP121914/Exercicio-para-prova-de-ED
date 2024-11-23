package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Fila<Integer> fila = new Fila<>();

      fila.enfilerar(1);
      fila.enfilerar(2);
      fila.enfilerar(3);

        System.out.println(fila);
        System.out.println(fila.espiar());
        fila.desenfileirar();
        System.out.println(fila);
        System.out.println(fila.espiar());
        fila.desenfileirar();
        System.out.println(fila);
    }
}