package _11_Uebungen_Funktionales_und_IO.Aufgabe_2_a_b;

class Kundenrabatt {

    private double rabattsatz = 0.05;

    public double getRabattsatz() {
        return rabattsatz;
    }

    public void setRabattsatz(double rabattsatz) {
        this.rabattsatz = rabattsatz;
    }

    public double berechneRabattpreis(double vollerPreis){

        return vollerPreis - vollerPreis * this.rabattsatz;
    }
}
