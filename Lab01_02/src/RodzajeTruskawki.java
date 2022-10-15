package Lab01_02.src;

public enum RodzajeTruskawki {
    ANANASOWA("Biale owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanow slodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie");
    
    private final String cecha;

    RodzajeTruskawki(final String cecha){
        this.cecha = cecha;
    }

    public String cecha(){
        return this.cecha;
    }
}
