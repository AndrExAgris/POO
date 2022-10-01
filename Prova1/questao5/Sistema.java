import java.util.*;


public class Sistema {
    

    //lista de professores e alunos | "armazenamento do sistema"

    static List<Professor> professores = new ArrayList<Professor>();    

    static List<Aluno> alunos = new ArrayList<Aluno>();    


    // metodos de adicionar alunos e professores ao sistema

    public void cadastraAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void cadastraProfessor(Professor professor){
        professores.add(professor);
    }


    //metodo para remover aluno e professor 
    /*  se o professor nao tivesse especificado os elementos do 
        objeto eu teria feito isso com um numero de matricula que
        seria um dado unico e mais seguro creio eu                 */

    public void exclui(Pessoa pessoa) {
        for(int i=0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(pessoa.getNome())) {
                alunos.remove(alunos.get(i));
            }
        }
        for(int i=0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(pessoa.getNome())) {
                professores.remove(professores.get(i));
            }
        }
    }


    //metodos para mostrar alunos e professores

    public void mostraAlunos(){
        if(alunos.size()>0){
            for(int i=0; i<alunos.size(); i++){
                System.out.println("Aluno "+ (i+1) + ": ");
                System.out.println("Nome: " + alunos.get(i).getNome());
                System.out.println("Numero: " + alunos.get(i).getNumero());
                System.out.println("Curso: " + alunos.get(i).getCurso());
                System.out.println("");
            }
        }else{
            System.out.println("Sem alunos cadastrados ainda!");
        }
    }

    public  void mostraProfessores(){
        if(professores.size()>0){
            for(int i=0; i<professores.size(); i++){
                System.out.println("Professor "+ (i+1) + ": ");
                System.out.println("Nome: " + professores.get(i).getNome());
                System.out.println("Numero: " + professores.get(i).getNumero());
                String mat[] = professores.get(i).getMaterias();
                System.out.println("Materias: " + mat[0] + ", "+ mat[1] + ", "+ mat[2]);
                System.out.println("");
            }

        }else{
            System.out.println("Sem professores cadastrados ainda!");
        }
    }



    //extra para melhorar o uso

    public void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
