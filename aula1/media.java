import java.util.Scanner;

class Media 
{
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int valores[] = new int[5];
        float media = 0;

        for(int i=0; i<valores.length; i++){
            System.out.println("Digite um valor inteiro:");
            valores[i] = leitor.nextInt();
            media += valores[i];
        }
        media = media/valores.length;
        System.out.println("A media é:"+ media);

        leitor.close();
    }
}

