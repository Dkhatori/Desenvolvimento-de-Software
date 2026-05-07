import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        ArrayList<Forma2D> formas = new ArrayList<Forma2D>();

        formas.add(new Triangulo(5.0, "triangulozin", "retângulo"));
        formas.add(new Circulo(20, "cicrulozin"));
        
        for (Forma2D f : formas) {
            JOptionPane.showMessageDialog(null, f.toString());
        }
    }
}