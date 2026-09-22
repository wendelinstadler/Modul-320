package Car2;

import java.util.ArrayList;

public class Fleet2 {
    private ArrayList<car2> cars = new ArrayList<>();

    public void addCar(car2 car) {
        cars.add(car);
    }

    public void print() {
        for (car2 car : cars) {
            System.out.println(car.getModel() + " - " + car.getPrice());
        }
    }
}
