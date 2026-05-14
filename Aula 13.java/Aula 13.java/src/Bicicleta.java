public class Bicicleta implements Veiculos {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a pedalada!!");

    }

    @Override
    public void frear() {
        System.out.println("Acionado frio traseiro.");

    }

    @Override
    public String obterTipo() {
        return "Bicicleta";
    }

}
