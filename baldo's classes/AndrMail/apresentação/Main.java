package apresentação;

import java.util.List;
import java.util.Scanner;



import dados.*;
import negocio.*;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        //cria usuarios e adiciona a lista de usuarios
        //precisaremos de 2 usuarios para enviar uma mensagem de um para o outro
        String nome = "Andre";
        String senha ="senhaboa123"; 

        Usuario usuario1 = new Usuario();
        usuario1.setNome(nome);
        usuario1.setSenha(senha);
        Sistema.cadastra(usuario1);
        
        Usuario usuario2 = new Usuario();
        usuario2.setNome("teste");
        usuario2.setSenha("testando");
        Sistema.cadastra(usuario2);

        //um terceiro usuario para testarmos apagar uma conta
        Usuario usuario3 = new Usuario();
        usuario3.setNome("praapagar");
        usuario3.setSenha("praapagar");
        Sistema.cadastra(usuario3);

        Sistema.mostraUsuarios();
        
        Sistema.deleta("praapagar", "praapagar");

        Sistema.mostraUsuarios();

        //teste de login
        if(Sistema.login(nome, senha)){
            System.out.println("logado");
            System.out.println();
        }

        //vamos enviar uma mensagem do usuario logado para o "teste"
        Email mensagem = new Email();
        mensagem.setRemetente(nome);
        mensagem.setDestinatario("teste");
        mensagem.setTitulo("nota");
        mensagem.setConteudo("acho que vale dez abcdefghijklmn");
        //o id e a data são setados pelo sistema
        Sistema.enviaMensagem(mensagem);
        

        //uma mensagem recebida pelo usuario seria assim
        Email mensagem2 = new Email();
        mensagem2.setRemetente("teste");
        mensagem2.setDestinatario("Andre");
        mensagem2.setTitulo("nota reversa");
        mensagem2.setConteudo("vale zero");
        Sistema.enviaMensagem(mensagem2);

        //para testar apagar uma mensagem
        Email teste = new Email();
        teste.setRemetente(nome);
        teste.setDestinatario("teste");
        teste.setTitulo("praapagar");
        teste.setConteudo("apagar yey");
        Sistema.enviaMensagem(teste);

        Sistema.mostraMensagens(nome);

        Sistema.apagaMensagens(nome, 2);

        Sistema.mostraMensagens(nome);

        //responder uma mensagem
        Email resposta = new Email();
        resposta.setRemetente(nome);
        resposta.setTitulo("resposta");
        resposta.setConteudo("resposta seila");
        Sistema.respondeMensagens(nome, 1, resposta);

        Sistema.mostraMensagens(nome);

        System.out.println(Sistema.mostraMensagem(nome, 0));

        String mensagemcodada = Sistema.codaemail(mensagem, 1).toString();
        System.out.println(mensagemcodada);

    }
    
}
