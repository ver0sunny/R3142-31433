public class Pyato extends Animal implements Pyatochok {
    public Pyato(String name) {
        super(name);
//        setForm(PhysicalForm.THIN);
    }

    @Override
    public void walk() {
        System.out.println(this + " продолжал прогулку ");
    }

//    @Override
//    public void plant(GrowthStage plant) {
//        System.out.println(this + " посадил" + GrowthStage.NUTSEED.getGrowthStage());
//    }

//    @Override
//    public void say(String whatToSay) {
//        System.out.println(whatToSay);
//    }

    @Override
    public void think(String whatToThink) {
        System.out.println(this + " размышлял " + whatToThink);
    }
}
