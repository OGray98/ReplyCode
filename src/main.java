import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        ReadFile reader = new ReadFile();
        reader.Read("inputs/data_scenarios_a_example.txt");
        Grid grid = reader.getGrid();
        grid.putAntennas();
        WriteFile writer = new WriteFile();
        writer.write("outputs/out.txt", grid.getAntenna());
    }
}
