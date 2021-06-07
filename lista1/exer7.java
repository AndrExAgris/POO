import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exer7 
{
    public static void main(String[] args) 
    {
        int dia, mes, ano, diaa, mesa, anoa, totaldias=0 ,aux=0;
        String data;
        String[] datas = new String[3];
        LocalDate date = LocalDate.now();

        Scanner s = new Scanner(System.in);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd MM yyyy");
        data = form.format(date);
        datas = data.split(" ");
        
        diaa = Integer.parseInt(datas[0]);
        mesa = Integer.parseInt(datas[1]);
        anoa = Integer.parseInt(datas[2]);

        System.out.println("Digite o dia, mes e ano de seu aniversario em linhas separadas:");

        dia =s.nextInt();
        mes =s.nextInt();
        ano =s.nextInt();


        if(diaa>=dia){
            aux = (diaa-dia);
            totaldias+=aux;
            if(mesa>=mes){
                aux = mesa-mes;
                totaldias+=aux*30;
                aux = (anoa-ano)*365;
                totaldias+=aux;
            }else{
                aux=((12-mes)+mesa);
                totaldias+=aux*30;
                aux = (anoa-ano-1)*365;
                totaldias+=aux;
            }
        }else{
            aux=((30-dia)+diaa);
            totaldias+=aux;
            if(mesa>=mes){
                aux = mesa-mes;
                aux-=1;
                totaldias+=aux*30;
                aux = (anoa-ano)*365;
        totaldias+=aux;
            }else{
                aux=((12-mes)+mesa);
                aux-=1;
                totaldias+=aux*30;
                aux = (anoa-ano-1)*365;
                totaldias+=aux;
            }
        }
        //o aproximadamente é pra não usar bibliotecas prontas do java pra calcular a diferença...
        System.out.println("A idade em dias é aproximadamente "+ totaldias);

        s.close();
    }
}
