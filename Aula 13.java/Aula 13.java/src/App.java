import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculos> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Carro("BMW"));
        System.out.println("Digite o tipo da bicicleta");
        // instanciando e lendo o parametro simultaneamente
        listaVeiculos.add(new Bicicleta(sc.next()));
        for (Veiculos veiculo : listaVeiculos){
            veiculo.acelerar();
            veiculo.frear();
            System.out.println(veiculo.obterTipo());
        }
        sc.close();
    }
}
