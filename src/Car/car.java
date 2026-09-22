package Car;

public class car {
    private String model;
    private double preis;


    public car(double preis, String model) {
        this.preis = preis;
        this.model = model;
    }

    protected double getCarPrice() {
        return preis;
    }
}


