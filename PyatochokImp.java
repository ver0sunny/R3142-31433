public class PyatochokImp extends Animal implements Pyatochok {
    public PyatochokImp(String name) {
        super(name);
//        setForm(PhysicalForm.THIN);
    }
    private Gelud gelud;

    static class Gelud extends Tree {
        public Gelud(int treeage) {
            super(treeage);
        }
    }

    @Override
    public String howOldIsTree(Gelud gelud) {
        String p = "";
        this.gelud = gelud;
        if (gelud.getTreeage() < 5) p = "я еще маленький желудь";
        if (gelud.getTreeage() > 5 && gelud.getTreeage() <10) p = "я уже не простой орех, я росток!";
        if (gelud.getTreeage() > 10) p = "я есть дерево";
        return p;
    }

    @Override
    public int howSoonYouBecomeTree(Gelud gelud) {
        int p = 0;
        this.gelud = gelud;
        p = 10 - gelud.getTreeage();
        return p;
    }

    @Override
    public void walk() {
        System.out.println(this + " " + TypeMoves.WALK.getMove());
    }

    @Override
    public void plant(GrowthStage plant) {
        System.out.println(this + " посадил" + GrowthStage.NUTSEED.getGrowthStage());
    }

//    @Override
//    public void say(String whatToSay) {
//        System.out.println(whatToSay);
//    }

    @Override
    public void think(String whatToThink) {
        System.out.println(this + " размышлял " + whatToThink);
    }
}
