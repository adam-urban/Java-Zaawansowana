package Lab01.src;

public enum RodzajeTruskawki {
    ANANASOWA("Biale owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanow slodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie");

    RodzajeTruskawki(final String cecha){
        this.cecha = cecha;
    }
    private final String cecha;

    public String cecha(){
        return this.cecha;
    }
}
