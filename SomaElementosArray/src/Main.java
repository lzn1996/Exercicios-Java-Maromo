import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //1- Soma dos Elementos de um Vetor
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<>();

        int soma = 0;

        String opcao = "S";

        while(opcao.equalsIgnoreCase("s")){
            System.out.println("Digite um valor a ser inserido no vetor: ");
            vetor.add(Integer.parseInt(scanner.nextLine()));
            System.out.println("Você deseja inserir mais um? S/N");
            opcao = scanner.nextLine();
        }

        System.out.println("Esse é o seu vetor: " + vetor);
        for (int i = 0; i < vetor.size(); i++) {
            soma += vetor.get(i);

        }

        System.out.println("A soma dos elementos do vetor é: " + soma);

    }
}