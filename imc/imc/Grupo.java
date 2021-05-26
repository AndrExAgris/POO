package imc;

public class Grupo 
{

    private int n = 5;
    private Pessoa[] pessoas = new Pessoa[n];
    private int numeroPessoas = 0;

    public Grupo(){};

    public void setPessoa(Pessoa p){
        if(this.numeroPessoas < n){
            pessoas[this.numeroPessoas] = p;
            this.numeroPessoas++;
        }
    }

    public void ordena(){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(this.pessoas[j].calculaImc()>this.pessoas[i].calculaImc()){
                    Pessoa aux = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = aux;
                }
            }
        }
    }

    public Pessoa[] getPessoas(){
        return this.pessoas;
    }
}
