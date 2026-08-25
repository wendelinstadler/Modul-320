package Regatta;

import java.util.ArrayList;

public class Competition {
    private String name;
    private ArrayList<Ship> ships;


    public Competition(String name){
        this.name = name;
        this.ships = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void start() {
        for (Ship ship : ships) {
            ship.race();
        }
    }

    public void printResult(){
        for (Ship ship : ships) {
            System.out.println(ship.getName() + ": " + ship.getTime() + " Sekunden");
        }
    }
}


