public class ConcessionariaTeste {
    public static void main(String[] args) {
        Carro corolla = new Carro();
        corolla.setModelo("Toyota Corolla");
        corolla.setAno(2022);
        corolla.setPreco(100000000);
        corolla.setMarca("Toyota");

        corolla.imprimir();
    }
}