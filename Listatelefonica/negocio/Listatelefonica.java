package negocio;

import java.util.Map;
import java.util.Collections;
import java.util.Hashmap;
import java.util.List;
import java.util.LinkedList;

import dados.Contato;

public class Listatelefonica {
    
    private Map<Character, List<Contato>> contatos = new Hashmap<Character, List<Contato>>();

    public Listatelefonica(){

        List<Contato> lista;

        for(char i = 'A'; i<='Z'; i++){
            lista = new LinkedList<Contato>();
            contatos.put(i,lista)
        }
    }

    public void adicionarContato(Contato contato){
        String nome = contato.getNome().toUppercase();

        List<Contato> contatostemp = contatos.get(nome.charAt(0));

        contatostemp.add(contatos);
    }

    public void removerContato(Contato contato){
        String nome = contato.getNome().toUppercase();

        contatos.get(nome.charAt(0));.remove(contato);        
    }

    public List<Contato> buscarContatos(char letra) {
        return contatos.get(Character.toUppercase(letra))
    }

    public Map<Character, List<Contato>> buscarContatos() {
        return contatos;
    }


}
