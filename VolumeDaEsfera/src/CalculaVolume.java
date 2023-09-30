import java.util.Scanner;

public class CalculaVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formula formula = new Formula();
        String resultado = 0;
        System.out.println("Digite o raio à ser calculado: ");
        formula.setRaio(Double.parseDouble(sc.nextLine()));
        resultado = formula.calcularVolume();
        System.out.println(resultado);
    }
}