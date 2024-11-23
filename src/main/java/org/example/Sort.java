package org.example;

public class Sort {

    public static void main(String[] args) {
        int[] vetor = {7, 5, 10, 6, 8};

        for (int elemento: vetor) {
            System.out.printf(elemento + " ");
        }

        insertSort(vetor);
        System.out.println();
        for (int elemento: vetor) {
            System.out.printf(elemento + " ");
        }
    }

     public static void bubbleSort(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = i; j < vet.length; j++) {

                if (vet[i] > vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
     }
    public static void reverseBubbleSort (int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = i; j < vet.length; j++) {

                if(vet[i] < vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[i] = temp;
                }
            }
        }
    }

    public static void insertSort (int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            int temp = vet[i];
            int j = i - 1;

            while (j >= 0 && vet[j] > temp) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = temp;
        }
    }

}



