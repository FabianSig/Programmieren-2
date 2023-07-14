package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_5;

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
