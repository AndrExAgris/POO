import java.util.Scanner;

public class exer3 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int tam;

        System.out.println("Digite o tamanho do vetor:");
        tam = s.nextInt();

        int vet[] = new int[tam];

        for(int i=0; i<tam; i++ ){
            vet[i] = s.nextInt();
        }
        System.out.println(buscamaior(vet, 0, 0));

        s.close();
    }

    public static int buscamaior(int vetor[], int maioratual, int indice)
    {
        if(maioratual<vetor[indice]){
            maioratual=vetor[indice];
        }
        if((indice+1)==vetor.length){
            return(maioratual);
        }
        indice++;
        
        return buscamaior(vetor, maioratual, indice);
    }
}
