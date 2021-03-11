public class Antenna {
    private final int range;
    private final int connSpeed;

    public Antenna(int range, int connSpeed) {
        this.range = range;
        this.connSpeed = connSpeed;
    }

    public int getRange() {
        return range;
    }

    public int getConnSpeed() {
        return connSpeed;
    }

}
