package Car;

public class usedCar extends car {
    private int milage;
    public usedCar(int milage,String model, double preis) {
        super(preis, model);
        this.milage = milage;
    }
    public double getPrice() {

        double priceOneKm = (this.getCarPrice() / 100) * 0.0005;
        double newPrice = this.getCarPrice() - (priceOneKm * this.milage);
        if(newPrice < 0) {
            newPrice = 0;
        }
        return newPrice;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
}
