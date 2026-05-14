public class Circulo extends Forma2D {
    private double raio;

    public Circulo(double altura, String nome) {
        super(altura, nome);
    }

    public double area(){
        double pi = 3.14;
        double raio = getAltura()/2;
        return (raio* raio) * pi;
    }

    @Override
    public String toString() {
        return "Circulo [raio =" + raio + ", Diametro =" + getAltura() + "]";
    }

    
}