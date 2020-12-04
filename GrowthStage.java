public enum GrowthStage {
    NUTSEED(" желудь "),
    SPROUT(" росток "),
    TREE(" дерево ");

    private final String growthStage;

    GrowthStage(String growthStage) { this.growthStage = growthStage; }
    public String getGrowthStage() { return growthStage; }
}

