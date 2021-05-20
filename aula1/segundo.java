package POO.aula1;

import java.util.Scanner;


class LeitorPessoas 
{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String nomes[] = new String[3];
        int idades[] = new int[3];

        for(int i=0; i<nomes.length; i++){
            System.out.println("Digite o nome da pessoa["+(i+1)+"]:");
            nomes[i] = s.nextLine();
            System.out.println("Digite a idade da pessoa["+(i+1)+"]:");
            idades[i] = Integer.valueOf(s.nextLine());
        }

        for(int i=nomes.length-1; i>=0; i--){
            System.out.println("Nome["+(i+1)+"]: " +nomes[i]+" - Idade["+(i+1)+"]: " +idades[i]);
        }
        s.close();
    }
}
