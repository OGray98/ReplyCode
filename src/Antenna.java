public class Antenna {
    private final int range;
    private final int connSpeed;

    private int x;
    private int y;

    public Antenna(int range, int connSpeed) {
        this.range = range;
        this.connSpeed = connSpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRange() {
        return range;
    }

    public int getConnSpeed() {
        return connSpeed;
    }

    public int getY() {
        return y;
    }
}
