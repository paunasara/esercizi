package esercizio;


public class Rettangolo {
    double base;
    double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

   
    public double area() {
        return base * altezza;
    }

  
    public double perimetro() {
        return 2 * (base + altezza);
    }
}
