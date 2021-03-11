public class Antenna {
    private final int range;
    private final int connSpeed;
    private final int ID;

    public Antenna(int range, int connSpeed, int ID) {
        this.range = range;
        this.connSpeed = connSpeed;
        this.ID = ID;
    }

    public int getRange() {
        return range;
    }

    public int getConnSpeed() {
        return connSpeed;
    }

    public int getID(){
        return ID;
    }

}
