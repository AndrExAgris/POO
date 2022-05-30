package dados;

import java.util.*;

public class Usuario {
    
    private String nome;
    private String senha;

    //temporarios até a permanencia ser implementada    
    List<Email> emails = new ArrayList<Email>();


    
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Email> getEmails() {
        return this.emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }


}
