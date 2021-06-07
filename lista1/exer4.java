import java.util.Scanner;

public class exer4 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.println("Digite os valores A e B:");

        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Digite 1 para a exponenciação A**B:");
        System.out.println("Digite 2 para o resto de divisão de A por B:");


        switch(s.nextInt())
        {
            case 1:
                System.out.println("A exponenciação de "+a+" em "+b+" é "+exponencial(a,b));
            break;
            case 2:
                System.out.println("O resto de divisao de "+a+" por "+b+" é "+resto(a,b));
            break;
        }
        s.close();
    }

    public static int exponencial(int base, int expo){
        int res = base;
        for(int i=0; i<expo-1; i++){
            res*=base;
        }
        return(res);
    }

    public static int resto(int divisor, int dividendo){
        while((divisor-dividendo)>=0){
            divisor-=dividendo;
        }
        return(divisor);
    }
}
