public class Ave extends Animal {

    private String local;
    private boolean migracao;

    public Ave(String nome, int recinto) {
        super(nome, recinto); // Construtor da classe Animal
    }

    public Ave() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isMigracao() {
        return migracao;
    }

    public void setMigracao(boolean migracao) {
        this.migracao = migracao;
    }
    @Override // Sobrescrevi o método da classe mãe
    public void andar(){

        //int novoValor = getRecinto()+2;
        //setRecinto(novoValor);
        setRecinto(getRecinto()+2);
    }
   
    public String toString() {
        return "Ave [ local=" + local
                + "\t migracao= " + migracao
                + "getNome()= " + getNome()
                + "\t getRecinto() = " + getRecinto()
                + "\t get peso()= " + getPeso() + " ]";
    }

}
