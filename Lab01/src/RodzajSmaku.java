package Lab01.src;

/**
 * Zadanie:
 * Utwórz enum RodzajSmaku zawierający wartości:
 * Troskawkowy
 * Bananowy
 * Szpinakowy
 * Ciasteczkowy
 * Jabłkowy
 * enum powinien przechowywać dodatkowo informację o poziomie słodkości
 * (int (albo enum jak ktoś bardzo chce),
 * poziomy do ustalenia według indywidualnych preferencji)
 *
 * A następnie zmodyfikować interfejs Smakowy
 * tak aby zwracał rodzaj smaku i dostosować resztę programu
 *
 */

public enum RodzajSmaku {
    TRUSKAWKOWY("truskawkowy", POZIOM_SLODKOSCI.BARDZO_SLODKI),
    BANANOWY("bananowy", POZIOM_SLODKOSCI.MALO_SLODKI),
    SZPINAKOWY("szpinakowy", POZIOM_SLODKOSCI.NIESLODKI),
    CIASTECZKOWY("ciasteczkowy", POZIOM_SLODKOSCI.BARDZO_SLODKI),
    JABLKOWY("jablkowy", POZIOM_SLODKOSCI.SLODKI);

    RodzajSmaku(final String nazwa, POZIOM_SLODKOSCI poziom_slodkosci){
        this.nazwa = nazwa;
        this.poziom_slodkosci = poziom_slodkosci;
    }
    private final String nazwa;
    private final POZIOM_SLODKOSCI poziom_slodkosci;

    public String getNazwa(){ return this.nazwa;}
    public POZIOM_SLODKOSCI getPoziom_slodkosci(){ return this.poziom_slodkosci;}

    @Override
    public String toString(){
        return "" + getNazwa() + " Poziom słodkosci " + getPoziom_slodkosci();
    }

}
