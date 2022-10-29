package Lab01_02.src;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args){
        int index = new Random().nextInt(0, RodzajeTruskawki.values().length);
        RodzajeTruskawki rodzajTruskawki = RodzajeTruskawki.values()[index];

        switchStatement (rodzajTruskawki);

    }
    private static void switchStatement(RodzajeTruskawki rodzajeTruskawki){
        switch (rodzajeTruskawki){
            case ANANASOWA:
                break;
            case HONEOYE:
                break;
            case POLKA:
                break;
            case KENT:
                break;
            case CHRISTINE:
                break;
            default:
                break;
        }
    }
}
