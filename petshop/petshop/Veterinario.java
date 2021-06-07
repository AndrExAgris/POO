package petshop;

public class Veterinario 
{
    private String nome;
    private float salario;
    private Endereco endereco;
    private int quantidadeAnimais = 0;
    private Animal[] animais = new Animal[quantidadeAnimais];
       
    public Veterinario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal a) {
        if(this.quantidadeAnimais<=10){
            animais[this.quantidadeAnimais] = a;
            this.quantidadeAnimais++;
        }
    }

    
}
