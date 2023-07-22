package _00_Probeklausur_Light;

import java.io.IOException;

import static _00_Probeklausur_Light.KinoDateiUtil.saveKino;
import static _00_Probeklausur_Light.KinoFactory.getKino;

public class Start {
    public static void main(String[] args) throws IOException {

        Kino k = getKino("test.txt");

        saveKino(k);
    }
}
