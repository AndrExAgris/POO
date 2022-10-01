public class Aluno extends Pessoa{

    private String curso;


    //generators

    public Aluno(String nome, Integer numero, String curso) {
        super(nome, numero);
        this.curso = curso;
    }


    //getters and setters


    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
