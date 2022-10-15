package Lab01.src;

/**

**/



public class KoktajlTruskawkowy extends KoktajlSmakowy implements Smakowalne{

    private final RodzajeTruskawki rodzajTruskawki;
    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajeTruskawki rodzajTruskawki){
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    };
    
    @Override 
    public void pij(){
        System.out.println("Pije koktajl o smaku " + smak() + ", ktore cechuje sie " + rodzajTruskawki.cecha() + ".");
    } 

    @Override
    public RodzajSmaku smak(){
        return super.smak();
    }
}
