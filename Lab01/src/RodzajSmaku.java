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
    TRUSKAWKOWY("truskawkowy", PoziomSlodkosci.BARDZO_SLODKI),
    BANANOWY("bananowy", PoziomSlodkosci.MALO_SLODKI),
    SZPINAKOWY("szpinakowy", PoziomSlodkosci.NIESLODKI),
    CIASTECZKOWY("ciasteczkowy", PoziomSlodkosci.BARDZO_SLODKI),
    JABLKOWY("jablkowy", PoziomSlodkosci.SLODKI);

    RodzajSmaku(final String nazwa, PoziomSlodkosci poziomSlodkosci){
        this.nazwa = nazwa;
        this.poziom_slodkosci = poziomSlodkosci;
    }
    private final String nazwa;
    private final PoziomSlodkosci poziom_slodkosci;

    public String getNazwa(){ return this.nazwa;}
    public PoziomSlodkosci getPoziomSlodkosci(){ return this.poziom_slodkosci;}

    @Override
    public String toString(){
        return "" + getNazwa() + " Poziom słodkosci " + getPoziomSlodkosci();
    }

}
