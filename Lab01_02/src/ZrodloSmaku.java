package Lab01_02.src;

public enum ZrodloSmaku {

    OWOCOWY("Owocowy"),
    WARZYWNY("Warzywny"),
    INNY("Inny");
    private final String cecha;

    ZrodloSmaku(String cecha){
        this.cecha = cecha;
    }


    @Override
    public String toString(){
        return cecha;
    }
}
