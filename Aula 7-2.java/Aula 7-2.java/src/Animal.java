public class Animal {
    
    private String nome;
    private float peso; 
    private int recinto;

    // Construtores 
    public Animal(String nome, int recinto) {
        this.nome = nome;
        this.recinto = recinto;
    }

    public String getNome(){return this.nome;}
     public void setNome(String nome){this.nome = nome;}

    public float getPeso(){return this.peso;}
    public void setPeso(Float peso){this.peso = peso;}


    public int getRecinto(){return this.recinto;}
    public void setRecinto(int recinto){this.recinto = recinto;}
    

    
    public void andar(){
        this.recinto++;
    }

    public Animal(){}
    //Getters and Setters
    public String toString() {
        return "Animal [ nome=" + nome + ", \t peso" + peso + ", \t recinto=" + recinto + " ]";
    }
        
}

