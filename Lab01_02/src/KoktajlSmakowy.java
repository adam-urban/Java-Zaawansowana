package Lab01_02.src;

public class KoktajlSmakowy extends Koktajl implements Smakowalne {

    private final RodzajSmaku rodzajSmaku;

    public KoktajlSmakowy(
            final int kcal,
            final RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    ;

    /*
    Zadanie:
    Przy użyciu switch statement do sformatowanej wiadomosci dodaj
    na podstawie rodzaju smaku informacje o tym czy smak jest:
    owocowy, warzywny czy inne
    informacja ta powinna pochodzić z nowej metody zrodloSmaku
    ktora zwraca nowy enum ZrodloSmaku. Metoda ta powinna zostać umieszczona w klasie
    * */
    @Override
    public void pij() {
        System.out.println("Pije koktajl " + zrodloSmaku() + " o smaku " + smak());
    }

    @Override
    public RodzajSmaku smak() {
        return this.rodzajSmaku;
    }


    public ZrodloSmaku zrodloSmaku() {
        return switch( this.rodzajSmaku){
            case TRUSKAWKOWY -> ZrodloSmaku.OWOCOWY;
            case BANANOWY -> ZrodloSmaku.OWOCOWY;
            case SZPINAKOWY -> ZrodloSmaku.WARZYWNY;
            case CIASTECZKOWY -> ZrodloSmaku.INNY;
            case JABLKOWY -> ZrodloSmaku.OWOCOWY;
        };
    }

}