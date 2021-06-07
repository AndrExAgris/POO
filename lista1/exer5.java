import java.util.Scanner;

public class exer5 
{
    public static void main(String[] args) 
    {
        int countc=0, countv=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a palavra ou frase sem pontuação ou acentos:");
        String stringuser = s.nextLine();
        String stringuserrev = new StringBuilder(stringuser).reverse().toString();
        String string = stringuser.toLowerCase().replace(" ", "");
        String stringrev = new StringBuilder(string).reverse().toString();

        System.out.println("A string invertida é "+stringuserrev);

        if(string.equals(stringrev)){
            System.out.println(stringrev+" é um palindromo de "+ string);
        }else{
            System.out.println(stringrev+" não é um palindromo de "+ string);
        }

        for (int i=0 ; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
               countv ++;
            }else{
                countc++;
            }
        }

        System.out.println("O numero de vogais da sentença é "+countv);      
        System.out.println("O numero de consoantes da sentença é "+countc);  

        s.close();
    }
}
