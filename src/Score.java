public class Score {

    public static int score(Antenna a, Building b) {
        return b.getConnection_Speed_Weight()*a.getConnSpeed() - b.getLatency_Weight()*manDistance(a,b);
    }

    public static int manDistance(Antenna a, Building b){
        return 0;
    }
}
