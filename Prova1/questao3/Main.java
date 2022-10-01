public class Main {
   
    public static void main(String args[])
    {
        Quadrado quadrado = new Quadrado(5);
        Cubo cubo = new Cubo(3);
        
        System.out.println(quadrado.calcularArea());
        System.out.println(cubo.calcularArea());

    }
    
}