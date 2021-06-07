import java.util.Scanner;

public class exer6 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira string:");
        String stra = s.nextLine(); 
        System.out.println("Digite a segunda string:");
        String strb = s.nextLine();

        Character vet[] = new Character[26];
        int aux =0;

        for (Character c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) 
        {
            if(stra.toLowerCase().contains(c.toString())){
                if(strb.toLowerCase().contains(c.toString())){
                    vet[aux] = c;
                    aux++;
                }
            }
        }

        for(int i=0; i<aux; i++){
            System.out.print(vet[i]+" ");
        }
        System.out.println();
        s.close();
    }
}
