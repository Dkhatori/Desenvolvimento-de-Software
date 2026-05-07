import java.lang.Math;

public class Circulo extends Forma2D {
    private double raio;

    public Circulo(double x, String nome) {
        super(x, nome);
        raio = x / 2;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "--- CÍRCULO ---\n\n" + "Nome: " + getNome() + "\nAltura: " + getAltura() + "\nLargura: " + getLargura() + "\nArea: " + area() + "\nRaio: " + this.raio;
    }
}