public class Cubo extends Quadrado{


    //constructors

    public Cubo(double lado) {
        super(lado);
    }
    

    //functions

    @Override
    public double calcularArea(){
        return 6*(lado*lado);
    }
}