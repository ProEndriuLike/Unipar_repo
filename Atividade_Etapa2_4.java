public class Circulo {

    private double raio;
    private String cor;
    private double area;
    private double perimetro;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }
    public double getRaio() {
        return raio;
    }
    public String getCor() {
        return cor;
    }
    public double calcularArea() {
        area = (3.141592 * (raio * raio));
        return area;
    }
    public double calcularPerimetro() {
        perimetro = (2 * 3.141592 * raio);
        return perimetro;
    }
}
