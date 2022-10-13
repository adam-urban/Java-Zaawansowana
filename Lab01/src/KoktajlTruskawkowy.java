package Lab01.src;
public class KoktajlTruskawkowy extends Koktajl implements Smakowalne{
    
    public KoktajlTruskawkowy(){};
    
    @Override 
    public void pij(){
        System.out.println("Piję koktajl truskawkowy");
    } 

    @Override
    public void smak(){
        System.out.println("Truskawkowy");
    }
}
