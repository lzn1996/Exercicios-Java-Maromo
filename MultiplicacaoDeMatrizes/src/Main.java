import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Multiplicação de Matrizes
//        Descrição: Escreva um programa que leia duas matrizes 2x2 e calcule o produto
//        das duas matrizes.
//                Instruções:
//        1. Declare duas matrizes 2x2 e uma matriz resultado 2x2.
//        2. Utilize loops aninhados para ler os elementos das duas matrizes.
//        3. Calcule o produto das matrizes.
//        4. Exiba a matriz resultante.
//        Lembre-se de incluir a importação import java.util.Scanner; no início de
//        cada programa e de utilizar a classe Scanner para a entrada de dados.

        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizMultiplicada = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o valor a ser colocado na matriz1 na linha: " + i + " posição: " + j);
                matriz1[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o valor a ser colocado na matriz2 na linha: " + i + " posição: " + j);
                matriz2[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Matriz 1:");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.printf("[%1d]", matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("[%1d]", matriz2[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrizMultiplicada.length; i++) {
            for (int j = 0; j < matrizMultiplicada[i].length; j++) {
                matrizMultiplicada[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        System.out.println("A multiplicação das matrizes é esta: ");
        for (int i = 0; i < matrizMultiplicada.length; i++) {
            for (int j = 0; j < matrizMultiplicada[i].length; j++) {
                System.out.printf("[%1d]", matrizMultiplicada[i][j]);
            }
            System.out.println();
        }
    }
}