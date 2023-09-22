import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int[][] matrizTransposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor a ser colocado na linha: " + i + " posição: " + j );
                matrizTransposta[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                System.out.print(matrizTransposta[j][i] + " ");
            }
            System.out.println();
        }
    }
    }
