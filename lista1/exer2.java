import java.util.Random;
import java.util.Scanner;

class Segundo 
{
    public static void main(String[] args) 

    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n, m;


        System.out.println("Digite os dois valores:");
        n = s.nextInt();
        m = s.nextInt();

        int m1[][] = new int[n][m];
        int m2[][] = new int[n][m];
        int m3[][] = new int[n][m];
        int m4[][] = new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                m1[i][j] = r.nextInt();
                m2[i][j] = r.nextInt();
            }
        }//gera as matrizes
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(m1[i][j]>m2[i][j]){
                    m3[i][j] = m1[i][j];
                }
                if(m2[i][j]>m1[i][j]){
                    m3[i][j] = m2[i][j];
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(i>j){
                    if(m1[i][j]<m2[i][j]){
                        m4[i][j] = m1[i][j];
                    }
                    if(m2[i][j]<m1[i][j]){
                        m4[i][j] = m2[i][j];
                    }
                }else{
                    m4[i][j] = 0;
                }  
            }
        }

        System.out.println("Matriz m3:");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
        System.out.println("Matriz m4:");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(m4[i][j]+" ");
            }
            System.out.println();
        }

        s.close();
    }
}
