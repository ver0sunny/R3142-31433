public enum PhysicalForm {
    DEFAULT(""),
    FAT("толстый"),
    THIN("худой");

    private final String physicalForm;

    PhysicalForm(String physicalForm) { this.physicalForm = physicalForm; }
    public String getPhysicalForm() { return physicalForm; }
}
