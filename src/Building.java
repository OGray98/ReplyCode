public class Building {

    int CoordinateX;
    int CoordinateY;
    int Latency_Weight;
    int Connection_Speed_Weight;

    public Building(int CoordinateX, int CoordinateY, int Latency_Weight, int Connection_Speed_Weight){
        this.CoordinateX = CoordinateX;
        this.CoordinateY = CoordinateY;
        this.Latency_Weight = Latency_Weight;
        this.Connection_Speed_Weight = Connection_Speed_Weight;
    }
}
