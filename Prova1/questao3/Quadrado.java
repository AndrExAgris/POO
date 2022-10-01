public class Quadrado {
    
    protected double lado;
    

    //constructors

    public Quadrado(double lado){
        this.lado = lado;
    }


    //functions

    public double calcularArea()
    {
        return lado*lado;
    }


    //getters  and setters
    
    public double getLado() {
        return lado;
    }
    
}