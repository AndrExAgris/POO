package negocio;

import java.lang.invoke.StringConcatFactory;
import java.text.DateFormat;
import java.util.*;

import dados.*;

public class Sistema {

    static int id = 0;

    //temporarios até a permanencia ser implementada
    static List<Usuario> usuarios = new ArrayList<Usuario>();    
    
    //verifica se o nome do usuario existe para não criar
    //cadastros duplicados ou checar se existe tal destinatario
    public static boolean existeUsuario(String nome) {

        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    //--------------------------------------------------------------
    //relacionado as contas de usuario
    public static boolean login (String usuario, String senha) {

        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(usuario)) {
                if(usuarios.get(i).getSenha().equals(senha)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void cadastra (Usuario usuario ){
        usuarios.add(usuario);
    }

    public static void deleta(String usuario, String senha) {
        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(usuario)) {
                if(usuarios.get(i).getSenha().equals(senha)){
                    usuarios.remove(usuarios.get(i));
                }
            }
        }
    }

    //para testes...
    public static void mostraUsuarios(){
        for(int i=0; i<usuarios.size(); i++){
            System.out.println(usuarios.get(i).getNome());
        }
        System.out.println("");
    }

    //--------------------------------------------------------------
    //mensagens
    public static void enviaMensagem(Email email) {
        String destinatario = email.getDestinatario();
        String remetente = email.getRemetente();

        Date date = new Date();
        DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
        String data = dfs.format(date);
        email.setId(id);
        id++;
        email.setData(data);

        email.setConteudo(codaemail(email, 0).toString());

        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(remetente)) {
                List<Email> emails = usuarios.get(i).getEmails();
                emails.add(email);
                usuarios.get(i).setEmails(emails);
            }
            if (usuarios.get(i).getNome().equals(destinatario)) {
                List<Email> emails = usuarios.get(i).getEmails();
                emails.add(email);
                usuarios.get(i).setEmails(emails);
            }
        }
    }


    //provisorio até ter um menu ou algo do tipo
    public static List<Email> mostraMensagens(String usuario) {
        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(usuario)) {
                for(int j=0; j < usuarios.get(i).getEmails().size(); j++){
                    if(usuarios.get(i).getEmails().get(j).getRemetente()==usuario){
                        System.out.println("Mensagem "+j+ ": "+usuarios.get(i).getEmails().get(j).getTitulo()+" --enviada--");
                    }else{
                        System.out.println("Mensagem "+j+ ": "+usuarios.get(i).getEmails().get(j).getTitulo()+" --recebida--");
                    }
                }
                System.out.println("");
            }
        }
        return null;
    }

    public static List<Email> apagaMensagens(String usuario, int mensagem) {
        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(usuario)) {
                usuarios.get(i).getEmails().remove(mensagem);
            }
        }
        return null;
    }

    public static List<Email> respondeMensagens(String usuario, int mensagem, Email email) {
        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(usuario)) {
                email.setDestinatario(usuarios.get(i).getEmails().get(mensagem).getRemetente());
                enviaMensagem(email);
            }
        }
        return null;
    }

    public static String mostraMensagem(String usuario, int mensagem) {
        for(int i=0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNome().equals(usuario)) {
                return(usuarios.get(i).getEmails().get(mensagem).getConteudo());
            }
        }
        return null;
    }


    public static StringBuilder codaemail(Email email, int decode) {
        String inicial = email.getConteudo().toLowerCase();

        String s = email.getData();
        s = s.substring(s.indexOf("/") + 1);
        s = s.substring(0, s.indexOf("/"));
        int chave = email.getId()%10+Integer.parseInt(s);

        if(decode==1){ 
            chave = 26 - (chave % 26);
        }

        StringBuilder result = new StringBuilder();
        for (char letra : inicial.toCharArray()) {
            if (letra != ' ') {
                int posicaoinicial = letra - 'a';
                int novaposicao = (posicaoinicial + chave) % 26;
                char newCharacter = (char) ('a' + novaposicao);
                result.append(newCharacter);
            } else {
                result.append(letra);
            }
        }
        return result;
    }




    //public static void clearScreen() {
    //    System.out.print("\033[H\033[2J");  
    //    System.out.flush();  
    //}



}