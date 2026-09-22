package Car;

public class crashedCar extends car{
    private int damageLevel;
    public static final int Damage_LOW = 0;
    public static final int Damage_MEDIUM = 1;
    public static final int Damage_TOTAL = 2;

    public crashedCar(int damageLevel,  String model, int preis) {
        super(preis, model);
        this.damageLevel = damageLevel;
    }

    public double getPrice() {
        double pr = this.getCarPrice();
        switch (this.damageLevel) {
            case Damage_LOW:
                pr *= 0.9;
                break;
            case Damage_MEDIUM:
                pr *= 0.5;
                break;
            case Damage_TOTAL:
                pr = 0;
                break;

        }
        return pr;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
