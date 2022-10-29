package Lab01_02.src;

public class ApplicationLab01 {
    
    public static void main(String[] args) {
        
        KoktajlSmakowy k = new KoktajlSmakowy(20, RodzajSmaku.BANANOWY);

        k.pij();
        System.out.println(k.smak());

    }
}
