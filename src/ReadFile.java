import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {


    private int widthGrid;
    private int heightGrid;
    private int numBuilding;
    private int numAntenna;
    private int reward;
    private Grid grid;

    public ReadFile(){

    }

    public void Read(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while(line!=null) {
            String[] gridDimensions = line.split(" ");
            widthGrid = Integer.parseInt(gridDimensions[0]);
            heightGrid = Integer.parseInt(gridDimensions[1]);
            grid = new Grid(widthGrid, heightGrid);
            line = reader.readLine();
            String[] secondLine = line.split(" ");
            numBuilding = Integer.parseInt(secondLine[0]);
            numAntenna = Integer.parseInt(secondLine[1]);
            reward = Integer.parseInt(secondLine[2]);
            //leggo tutti i buildings
            for (int i = 0; i < numBuilding; i++){
                line = reader.readLine();
                String[] lineBuilding = line.split(" ");
                Coordinate coordinate = new Coordinate(Integer.parseInt(lineBuilding[0]), Integer.parseInt(lineBuilding[1]));
                Building build = new Building(Integer.parseInt(lineBuilding[2]), Integer.parseInt(lineBuilding[3]));
                grid.add_building(coordinate, build);
            }
            //leggo le antenne
            for (int j = 0; j < numAntenna; j++){
                line = reader.readLine();
                String[] lineAntenne = line.split(" ");
                Antenna antenna = new Antenna(Integer.parseInt(lineAntenne[0]), Integer.parseInt(lineAntenne[1]), j);
                grid.add_antenna(antenna);
            }
            line = reader.readLine();
            //END

        }
    }


    public Grid getGrid(){
        return grid;
    }

    public int getWidthGrid() {
        return widthGrid;
    }



    public int getHeightGrid() {
        return heightGrid;
    }



    public int getNumBuilding() {
        return numBuilding;
    }



    public int getNumAntenna() {
        return numAntenna;
    }



    public int getReward() {
        return reward;
    }




}
