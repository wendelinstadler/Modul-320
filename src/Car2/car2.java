package Car2;

public class car2 {
    private String model;
    private double preis;


    public car2(double preis, String model) {
        this.preis = preis;
        this.model = model;
    }

    protected double getCarPrice() {
        return preis;
    }
}


