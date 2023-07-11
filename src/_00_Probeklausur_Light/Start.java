package _00_Probeklausur_Light;

import static _00_Probeklausur_Light.KinoFactory.getKino;

public class Start {
    public static void main(String[] args) {

        Kino kino = getKino();

        KinoDateiUtil.saveKino(kino);

    }
}
