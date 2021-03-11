public class Building {

    private int Latency_Weight;
    private int Connection_Speed_Weight;

    public Building(int Latency_Weight, int Connection_Speed_Weight){
        this.Latency_Weight = Latency_Weight;
        this.Connection_Speed_Weight = Connection_Speed_Weight;
    }


    public int getLatency_Weight() {
        return Latency_Weight;
    }

    public int getConnection_Speed_Weight() {
        return Connection_Speed_Weight;
    }


    public void setLatency_Weight(int latency_Weight) {
        Latency_Weight = latency_Weight;
    }

    public void setConnection_Speed_Weight(int connection_Speed_Weight) {
        Connection_Speed_Weight = connection_Speed_Weight;
    }
}
