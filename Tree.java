public class Tree {
    private int treeage;
    private GrowthStage stage;

    public Tree(int treeage, GrowthStage stage) {
        this.treeage = treeage;
        this.stage = GrowthStage.NUTSEED;
    }

    public void setStage(GrowthStage stage) { this.stage = stage; }


}
