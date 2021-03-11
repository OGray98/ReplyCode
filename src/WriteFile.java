import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WriteFile {


    public WriteFile(){

    }


    public void write(String filePath, HashMap antenne) throws FileNotFoundException {

        PrintWriter out = new PrintWriter(filePath);
        Iterator it = antenne.entrySet().iterator();
        out.println(String.valueOf(antenne.size()));
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Coordinate cord = (Coordinate) pair.getKey();
            Antenna antenna = (Antenna) pair.getValue();
            out.println(String.valueOf(antenna.getID()) + " " + String.valueOf(cord.getX()) + " " + String.valueOf(cord.getY()));
            it.remove(); // avoids a ConcurrentModificationException
        }


    }
}
