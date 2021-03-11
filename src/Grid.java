import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grid {

    private int Width;
    private int Height;
    private Coordinate[][] Coordinates;

    private List<Antenna> Antenna_List;

    private HashMap<Coordinate, Building> Buildings;
    private HashMap<Coordinate, Antenna> Antennas;

    public Grid(int W, int H){

        this.Width = W;
        this.Height = H;
        this.Coordinates = new Coordinate[W][H];

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


    // All neighborhodd with equal or less manhattan field distance
    public ArrayList<Coordinate> neighborhood (Coordinate c, int range){
        int coordinateX = c.getX();
        int coordinateY = c.getY();
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for(int i = 0; i < range; i++){
            for(int j = 0; j < range; j++){
                int x1 = coordinateX + i;
                int y1 = coordinateY + j;

                if (x1 < this.Width && y1 < this.Height){
                    coordinates.add(this.Coordinates[x1][y1]);
                }

                int x2 = coordinateX - i;
                int y2 = coordinateY - j;
                if(x1 > 0 && y2 > 0){
                    coordinates.add(this.Coordinates[x2][y2]);
                }
            }
        }

        return coordinates;



    }


}
