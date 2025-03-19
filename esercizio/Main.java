package esercizio;


public class Main {
    public static void main(String[] args) {
    
        Rettangolo rettangolo = new Rettangolo(5, 3);
        System.out.println("Rettangolo:");
        System.out.println("Area: " + rettangolo.area());
        System.out.println("Perimetro: " + rettangolo.perimetro());

       
        Quadrato quadrato = new Quadrato(4);
        System.out.println("\nQuadrato:");
        System.out.println("Area: " + quadrato.area());
        System.out.println("Perimetro: " + quadrato.perimetro());
    }
}
