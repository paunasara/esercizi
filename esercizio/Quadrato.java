package esercizio;


public class Quadrato {
    double lato;

 
    public Quadrato(double lato) {
        this.lato = lato;
    }


    public double area() {
        return lato * lato;
    }


    public double perimetro() {
        return 4 * lato;
    }
}
