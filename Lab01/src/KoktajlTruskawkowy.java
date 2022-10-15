package Lab01.src;

/**

**/



public class KoktajlTruskawkowy extends Koktajl implements Smakowalne{

    private final RodzajeTruskawki rodzajTruskawki;
    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajeTruskawki rodzajTruskawki){
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
    };
    
    @Override 
    public void pij(){
        System.out.println("Pije koktajl o smaku " + smak() + ", ktore cechuje sie " + rodzajTruskawki.cecha() + ".");
    } 

    @Override
    public String smak(){
        return "Truskawkowy";
    }
}
