package _00_Probeklausur_Light;

public class Film {

    private String name;
    private int leange;

    public Film(String name, int leange) {
        this.name = name;
        this.leange = leange;
    }

    public String getName() {
        return name;
    }

    public int getLeange() {
        return leange;
    }

    @Override
    public String toString() {
        return String.format ("%25s : %3d Minuten", name, leange);
    }
}
