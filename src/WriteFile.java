import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WriteFile {


    public WriteFile(){

    }


    public void write(String filePath, Map<Coordinate, Antenna> antenne) throws FileNotFoundException {

        PrintWriter out = new PrintWriter(filePath);
        out.println(antenne.size());

        antenne.forEach( (k,v) -> out.println(v.getID() + " " + k.getX() + " " + k.getY()));

        out.close();
    }
}
