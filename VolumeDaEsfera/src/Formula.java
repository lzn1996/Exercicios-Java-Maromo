public class Formula {
    private final double pi = Math.PI;
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String calcularVolume() {
        double volume = 4 * this.pi * (Math.pow(raio, 3)) / 3;
        return String.format("%.2f", volume); // Substitua 2 pelo número desejado de casas decimais.
    }
}
