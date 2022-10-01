public class Pessoa {
    
    private String nome;
    private Integer numero;


    //constructors 

    public Pessoa(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }


    //getters and setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
