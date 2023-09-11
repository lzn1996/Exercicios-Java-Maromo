public class LojaTeste {
    public static void main(String[] args) {
        Produto galaxyS21 = new Produto();
        galaxyS21.setNome("Smartphone Samsung Galaxy S21");
        galaxyS21.setDescricao(" Smartphone Android de última geração com tela AMOLED de 6,2 polegadas, câmera de alta resolução, processador rápido e design elegante.");
        galaxyS21.setPrecoUnitario(2499);
        galaxyS21.setQuantidadeEmEstoque(50);

        galaxyS21.imprimir();
    }
}