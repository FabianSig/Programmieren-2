package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_4_b;

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
