import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        ReadFile reader = new ReadFile();
        reader.Read("/Users/ogkush/IdeaProjects/ReplyCode/inputs/data_scenarios_a_example.txt");
        Grid grid = reader.getGrid();
        
    }
}
