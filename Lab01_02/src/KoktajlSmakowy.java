package Lab01_02.src;

public class KoktajlSmakowy extends Koktajl implements Smakowalne{
    
    private final RodzajSmaku rodzajSmaku;

    public KoktajlSmakowy(
            final int kcal,
            final RodzajSmaku rodzajSmaku){
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    };

    @Override
    public void pij(){
        System.out.println("Pije koktajl o smaku " + smak());
    }

    @Override
    public RodzajSmaku smak(){
        return this.rodzajSmaku;
    }
}
