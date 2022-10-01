import java.util.Scanner;

public class Main {
   
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Remove rem = new Remove();
        int opcao = -1;

        while(opcao != 0)
        {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Remover Vogais");
            System.out.println("2 - Remover Consoantes");
            System.out.println("0 - Sair");

            opcao = Integer.parseInt(scan.nextLine());

            switch(opcao){

                case 0:
                    break;
                
                case 1:
                    System.out.println("Digite a string:");
                    String comVog = scan.nextLine();
                    
                    String semVog = rem.removerVogais(comVog);
                    System.out.println("A string sem vogais ficou: " + semVog);

                    break;


                case 2:
                    System.out.println("Digite a string:");
                    String comCon = scan.nextLine();
                    
                    String semCon = rem.removerConsoantes(comCon);
                    System.out.println("A string sem vogais ficou: " + semCon);

                    break;
            }

        }
        scan.close();
    }
}