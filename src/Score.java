public class Score {

    public static int score(Antenna a, Building b, Coordinate antCoord, Coordinate buildCoord) {
        return b.getConnection_Speed_Weight()*a.getConnSpeed() - b.getLatency_Weight()*manDistance(antCoord,buildCoord);
    }

    public static int manDistance(Coordinate a, Coordinate b){
        return a.getX()-b.getX() + a.getY()+b.getY();
    }
}
