import model.Baralho;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.mostrarBaralho();
        System.out.println("Embaralhando...");
        baralho.embaralhar();
        baralho.mostrarBaralho();
    }
}