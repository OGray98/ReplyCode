import java.util.*;

public class Grid {

    private List<Coordinate> Coordinates;

    private List<Antenna> Antenna_List;

    private HashMap<Coordinate, Building> Buildings;
    private HashMap<Coordinate, Antenna> Antennas;

    public Grid(int W, int H){
        List<Coordinate> Coordinates = new ArrayList<>();

        for(int i = 0; i < W; i++){
            for(int j = 0; i < H; i++){
                Coordinates.add(new Coordinate(i, j));
            }
        }

        this.Coordinates = Coordinates;
        this.Antenna_List = new ArrayList<>();

        this.Buildings =  new HashMap<>();
        this.Antennas = new HashMap<>();

    }

    public void add_building(Coordinate coordinate, Building building){
        this.Buildings.put(coordinate, building);
    }


    public void add_antenna(Antenna antenna){
        this.Antenna_List.add(antenna);
    }

    public void add_antenna(Coordinate coordinate, Antenna antenna){
        this.Antenna_List.add(antenna);
        this.Antennas.put(coordinate, antenna);
    }

    public void setPositionAntenna(Coordinate newCoord, Coordinate oldCoord) {
        this.Antennas.put(newCoord, this.Antennas.get(oldCoord));
        this.Antennas.remove(oldCoord);
    }

    public void putAntennas() {
        this.Antenna_List.sort((o1, o2) -> Integer.compare(o2.getConnSpeed(), o1.getConnSpeed()));
        ArrayList<Coordinate> occupied = new ArrayList<>();
        this.Antenna_List.forEach( antenna -> {
            Coordinate bestBuilding = new Coordinate(0,0);

            for (Map.Entry<Coordinate, Building> entry : Buildings.entrySet()) {
                if(Buildings.containsKey(bestBuilding)) {
                    if(entry.getValue().getConnection_Speed_Weight() > Buildings.get(bestBuilding).getConnection_Speed_Weight()
                            && !occupied.contains(entry.getKey())) {
                        bestBuilding = entry.getKey();
                    }
                }
                else {
                    bestBuilding = entry.getKey();
                }
            }

            occupied.add(bestBuilding);
            this.Antennas.put(bestBuilding, antenna);
        });
    }

}
