public class Professor extends Pessoa{

    private String[] materias = new String[3];


    //constructors

    public Professor(String nome, Integer numero, String[] materias) {
        super(nome, numero);
        this.materias = materias;
    }
    

    //getters and setters

    public String[] getMaterias() {
        return this.materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

}
