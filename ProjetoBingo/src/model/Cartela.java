package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cartela {
    private int[][] matriz = new int[5][5];
    Random random = new Random();


    public Cartela() {
        gerarCartela();
        mostrar();
    }

    private void gerarCartela() {
        List<Integer> lista = new ArrayList<>();
        int valor;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                do{
                    valor = random.nextInt(15) + (15*i);
                }while(lista.contains(valor));
                lista.add(valor);
                matriz[j][i] = valor;
            }
        }
        matriz[2][2] = -1;
    }

    public void mostrar(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%2d]", matriz[i][j]);
            }
            System.out.println();
        }
    }
}


