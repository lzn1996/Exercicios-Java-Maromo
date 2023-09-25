import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random randomNumberGenerator = new Random();
        int contador = 0;
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        List<Integer> valoresEncontrados = new ArrayList<>();

        System.out.println("Digite um número de 0 a 100: ");
        n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite outro número de 0 a 100: ");
        n2 = Integer.parseInt(sc.nextLine());

        System.out.println("Os numeros que você digitou foram: " + n1 +" e " + n2);

        System.out.println("Rodando tabuleiro...");


        //loop para adicionar valores aleatorios na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = randomNumberGenerator.nextInt(0,100);
            }
        }

        //loop para contabilizar o contador, e adicionar na lista qual valor foi encontrado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == n1 || matriz[i][j] == n2){
                    contador++;
                    if(!valoresEncontrados.contains(matriz[i][j])){
                        valoresEncontrados.add(matriz[i][j]);  //Adiciona o valor encontrado na lista, apenas uma vez
                    }
                }
            }
        }


        //loop para mostrar o tabuleiro, e adicionar dois espaços onde o valor corresponde com o valor encontrado,
        //para que o usuario consiga ver claramente no tabuleiro onde está o valor que ele digitou
        //detalhe, no uso obrigatorio do 'continue' na condicional, senão as instruçoes serao realizadas duplamente,
        //resultando em uma linha com 11 colunas ao inves de 10, no print

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(valoresEncontrados.contains(matriz[i][j])){
                    System.out.printf("[% 2d ]", matriz[i][j]);
                    continue;
                }
                System.out.printf("[%1d]", matriz[i][j]);
            }
            System.out.println();
        }



        System.out.print("Esses foram os valores encontrados no tabuleiro: ");

        for(int valor : valoresEncontrados){
            System.out.println(valor);
        }

        System.out.println("Totalizando " + contador + " valores encontrados. Logo, seu prêmio é de: R$" + contador * 1000 + ",00");
    }
}