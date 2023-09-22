import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Soma das diagonais da matriz
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor a ser colocado na linha: " + i + " posição: " + j);
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Essa é a matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    somaPrincipal += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é: " +somaPrincipal);

        int somaSecundaria = 0;
        int numeroDeElementosNaLinha = matriz[0].length;
        for (int i = 0; i < numeroDeElementosNaLinha; i++) {
            somaSecundaria += matriz[i][numeroDeElementosNaLinha - i  - 1];
        }

        // numeroDeLementosNaLinha = o tanto de elementos que tem por linha, no caso se o length der 3, tem de 0 a 2.
        //faça numeroDeElementosNaLinha - i - 1. o -1 é para ajustar para o array que começa em index 0, se nao usar o -1,
        //o for irá verificar exemplo matriz[i][3] nao existe, por isso precisa diminuir um, para checar matriz[i][2],
        //retornando o 3


        System.out.println("A soma da diagonal secundária é: " +somaSecundaria);
    }
}