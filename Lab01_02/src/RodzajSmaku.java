package Lab01_02.src;

public enum RodzajSmaku {
    TRUSKAWKOWY("truskawkowy", PoziomSlodkosci.BARDZO_SLODKI),
    BANANOWY("bananowy", PoziomSlodkosci.MALO_SLODKI),
    SZPINAKOWY("szpinakowy", PoziomSlodkosci.NIESLODKI),
    CIASTECZKOWY("ciasteczkowy", PoziomSlodkosci.BARDZO_SLODKI),
    JABLKOWY("jablkowy", PoziomSlodkosci.SLODKI);
    
    
    private final String nazwa;
    private final PoziomSlodkosci poziom_slodkosci;

    RodzajSmaku(final String nazwa, PoziomSlodkosci poziomSlodkosci){
        this.nazwa = nazwa;
        this.poziom_slodkosci = poziomSlodkosci;
    }


    public String getNazwa(){ return this.nazwa;}
    
    public PoziomSlodkosci getPoziomSlodkosci(){ return this.poziom_slodkosci;}

    @Override
    public String toString(){
        return "" + getNazwa() + " Poziom słodkosci " + getPoziomSlodkosci();
    }

}
