import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Forma2D> listaFormas = new ArrayList<>();
        int option = 0;
        MenuFormas menuFormas = new MenuFormas();
        do{
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1:
                    listaFormas.add(menuFormas.cadaForma2d());
                    // Cadastrar Forma
                    break;
                case 2:
                    // Listar Formar
                    break;
                case 3:
                    // Calcular área
                    break;
                default:
                    break;
            }
        }while (option !=0);
        menuFormas.encerraSistema(); // encerra o scanner        
    }
}