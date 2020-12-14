
//        Так они и сделали. Тем временем Винни-Пух и Пятачок продолжали свою прогулку.
//        Пух в стихах сообщал Пятачку, что "неважно, чем он занят, так как он толстеть не станет,
//        а ведь он толстеть не станет"; а Пятачок размышлял о том, скоро ли вырастет посаженный им желудь.

public class Main {
    public static void main(String[] args) {
        VinniPuxImp vinni = new VinniPuxImp("Винни-Пух");
        PyatochokImp pyatochok = new PyatochokImp("Пяточок");

        vinni.walk();
        pyatochok.walk();

        vinni.readPoetical(pyatochok);
        vinni.getFatterRhyme();

        pyatochok.plant(GrowthStage.NUTSEED);
        pyatochok.think("скоро "+ GrowthStage.NUTSEED.getGrowthStage() + " вырастет?");
    }
}
