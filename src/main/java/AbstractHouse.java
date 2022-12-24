abstract class AbstractHouse {
    protected boolean basement;
    protected int numFloors;
    protected int numPitch;
    protected String floorsMaterial;
    protected String roofMaterial;
    protected String decorMaterial;

    public final void build() {
        description();
        basement();
        floors();
        doors();
        windows();
        roof();
        decorateHouse();
    }
    abstract void description();
    abstract void basement();
    abstract void floors();
    abstract void windows();
    abstract void doors();
    abstract void roof();
    abstract void decorateHouse();
}
