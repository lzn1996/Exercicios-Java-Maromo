public class BibliotecaTeste {
    public static void main(String[] args) {
        Livro littlePrince = new Livro();

        littlePrince.setTitulo("O pequeno príncipe");
        littlePrince.setAutor("Antoine de Saint-Exupéry");
        littlePrince.setPreco(35.00);
        littlePrince.setAnoPublicacao(1943);

        littlePrince.imprimir();

    }
}