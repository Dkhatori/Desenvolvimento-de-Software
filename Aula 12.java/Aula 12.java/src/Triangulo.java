public class Triangulo extends Forma2D{
    private String style;

    Triangulo() {
        super();
        style = "nada";
    }

    Triangulo(String s, double w, double h) {
        super(w, h, "triângulo");
        style = s;
    }

    Triangulo(double x, String nome, String style) {
        super(x, nome);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public double area() {
        return (getAltura() * getLargura()) / 2;
    }

    @Override
    public String toString() {
        return "--- TRIÂNGULO ---\n\n" + "Nome: " + getNome() + "\nAltura: " + getAltura() + "\nLargura: " + getLargura() + "\nArea: " + area() + "\nEstilo: " + this.style;
    }
}