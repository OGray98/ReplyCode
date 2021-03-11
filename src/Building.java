public class Building {

    private int CoordinateX;
    private int CoordinateY;
    private int Latency_Weight;
    private int Connection_Speed_Weight;

    public Building(int CoordinateX, int CoordinateY, int Latency_Weight, int Connection_Speed_Weight){
        this.CoordinateX = CoordinateX;
        this.CoordinateY = CoordinateY;
        this.Latency_Weight = Latency_Weight;
        this.Connection_Speed_Weight = Connection_Speed_Weight;
    }

    // GETTERS
    public int getCoordinateX() {
        return CoordinateX;
    }

    public int getCoordinateY() {
        return CoordinateY;
    }

    public int getLatency_Weight() {
        return Latency_Weight;
    }

    public int getConnection_Speed_Weight() {
        return Connection_Speed_Weight;
    }

    // SETTERS
    public void setCoordinateX(int coordinateX) {
        CoordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        CoordinateY = coordinateY;
    }

    public void setLatency_Weight(int latency_Weight) {
        Latency_Weight = latency_Weight;
    }

    public void setConnection_Speed_Weight(int connection_Speed_Weight) {
        Connection_Speed_Weight = connection_Speed_Weight;
    }
}
