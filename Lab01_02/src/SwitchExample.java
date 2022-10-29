package Lab01_02.src;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int index = new Random().nextInt(0, RodzajeTruskawki.values().length);
        RodzajeTruskawki rodzajTruskawki = RodzajeTruskawki.values()[index];
        System.out.println("Wybrany rodzaj: " + rodzajTruskawki);
        switchStatement(rodzajTruskawki);

        switchExpression(rodzajTruskawki);

    }

    private static void switchStatement(RodzajeTruskawki rodzajeTruskawki) {
        switch (rodzajeTruskawki) {
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
                throw new IllegalStateException();
        }
    }

    private static int switchExpression(RodzajeTruskawki rodzajeTruskawki) {
        return switch (rodzajeTruskawki) {
            case ANANASOWA -> {
                System.out.println(rodzajeTruskawki);
                yield 1;
            }
            case HONEOYE -> {
                System.out.println(rodzajeTruskawki);
                yield 2;
            }
            case POLKA -> {
                System.out.println(rodzajeTruskawki);
                yield 3;
            }
            case KENT -> {
                System.out.println(rodzajeTruskawki);
                yield 4;
            }
            case CHRISTINE -> {
                System.out.println(rodzajeTruskawki);
                yield 5;
            }
            case BRAND_NEW -> {
                System.out.println(rodzajeTruskawki);
                yield 6;
            }
        };
    }
}