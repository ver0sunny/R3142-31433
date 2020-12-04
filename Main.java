
//        Так они и сделали. Тем временем Винни-Пух и Пятачок продолжали свою прогулку.
//        Пух в стихах сообщал Пятачку, что "неважно, чем он занят, так как он толстеть не станет,
//        а ведь он толстеть не станет"; а Пятачок размышлял о том, скоро ли вырастет посаженный им желудь.

public class Main {
    public static void main(String[] args) {
        Vinni vinni = new Vinni("Винни-Пух");
        Pyato pyatochok = new Pyato("Пяточок");

        vinni.setMovingSpeed(TypeMoves.WALK);
        pyatochok.setMovingSpeed(TypeMoves.WALK);

        vinni.walk();
        pyatochok.walk();

        vinni.readPoetical(vinni,pyatochok);
        vinni.getFatterRhyme();


        pyatochok.think("скоро "+ GrowthStage.NUTSEED.getGrowthStage() + " вырастет?");
    }
}
