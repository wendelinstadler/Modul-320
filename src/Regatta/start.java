package Regatta;

public class start {
    public static void main(String[] args) {

        Competition competition = new Competition("Rotsee Regatta");

        Ship ship1= new Ship(1, "Alinghi");
        Ship ship2 = new Ship(2, "Red Baron");
        Ship ship3 = new Ship(3, "Blue Lagoon");

        competition.addShip(ship1); //add ships to competition
        competition.addShip(ship2);
        competition.addShip(ship3);

        competition.start(); //start competition

        competition.printResult(); //print ships with time
    }
}
