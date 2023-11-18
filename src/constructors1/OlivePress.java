package constructors1;

import java.util.List;

/**
 *
 * @author Ramjay Romorosa
 */
public class OlivePress {
    public int getOil(List<Olive> olives) {
        int totalOil = 0;
        for (Olive o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }
}
