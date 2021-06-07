import java.util.Scanner;

class exer1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int tam, soma = 0, menor=1000000, maior=0, primesum=0;
        double media;

        System.out.println("Digite o tamanho do vetor com um valor inteiro:");
        tam = s.nextInt();

        int vetor[] = new int[tam];

        for(int i=0; i<tam; i++)
        {
            System.out.println("Digite um valor inteiro para a posição ["+i+"] do vetor:");
            vetor[i] = s.nextInt();//lendo o vetor

            soma = soma + vetor[i];//somando total do vetor

            if(vetor[i]<menor){
                menor = vetor[i];
            }//verificando menor valor do vetor
            if(vetor[i]>maior){
                maior = vetor[i];
            }//verificando maior valor do vetor
        }

        media = soma/tam;//calcula media

        System.out.println("A soma dos elementos do vetor é: "+soma);
        System.out.println("O menor valor presente no vetor é: "+menor);
        System.out.println("O maior valor presente no vetor é: "+maior);
        System.out.println("A media dos elementos do vetor é: "+media);

        for(int i=0; i<tam; i++)
        {
            if(vetor[i]>0)
            {
                int aux=0;
                for(int j = 2; j < vetor[i]; j++) 
                {
                    if (vetor[i] % j == 0){
                        aux++;
                    }
                }
                if(aux==0){
                    primesum+=vetor[i];
                }//soma numeros primos
            }   
            
        }
        System.out.println("A soma dos elementos primos do vetor é: "+primesum);
        
        s.close();
    }
}

