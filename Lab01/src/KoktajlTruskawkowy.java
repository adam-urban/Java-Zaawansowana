package Lab01.src;

/**

**/



public class KoktajlTruskawkowy extends Koktajl implements Smakowalne{

    private final RodzajeTruskawki rodzajTruskawki;
    private final RodzajSmaku rodzajSmaku;
    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajeTruskawki rodzajTruskawki,
            final RodzajSmaku rodzajSmaku){
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        this.rodzajSmaku = rodzajSmaku;
    };
    
    @Override 
    public void pij(){
        System.out.println("Pije koktajl o smaku " + smak() + ", ktore cechuje sie " + rodzajTruskawki.cecha() + ".");
    } 

    @Override
    public RodzajSmaku smak(){
        return this.rodzajSmaku;
    }
}
