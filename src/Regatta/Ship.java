package Regatta;

public class Ship {
    private int nr;
    private String name;
    private int time;

    public Ship(int nr, String name){
        this.nr = nr;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getTime() {
        return time;
    }

    public void race(){
        time = 300 + (int) (Math.random() * 301);
    }
}
