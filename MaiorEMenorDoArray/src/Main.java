import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcao = "s";

        while(opcao.equalsIgnoreCase("s")) {
            System.out.println("Digite um valor para adicionar no array: ");
            array.add(Integer.parseInt(scanner.nextLine()));

            System.out.println("Você quer adicionar mais um? S/N");
            opcao = scanner.nextLine();
        }

        int menor = array.get(0);
        int maior = array.get(0);

        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
            if (elemento < menor) {
                menor = elemento;
            }
        }
        System.out.println("O seu array é: " + array);

        System.out.println("O maior é: " +maior);
        System.out.println("O menor é: " +menor);
    }
    }
