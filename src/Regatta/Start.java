package Regatta;

public class Start {
    static void main() {

        Competition competition = new Competition("Rotsee Regatta");

        Ship ship1 = new Ship(1, "Alinghi");
        Ship ship2 = new Ship(2, "Red Baron");
        Ship ship3 = new Ship(3, "Blue Lagoon");

        competition.addShip(ship1);
        competition.addShip(ship2);
        competition.addShip(ship3);

        competition.start();
        competition.printResult();
    }
}
