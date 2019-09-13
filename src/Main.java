import com.sun.java.accessibility.util.java.awt.TextComponentTranslator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Point start = new Point(55.792812, 49.127794);
        Point p1 = new Point(55.766633, 49.154694);
        Point p2 = new Point(55.767133, 49.144530);
        Point p3 = new Point(55.796618, 49.059775);
        Point p4 = new Point(55.835460, 49.153593);
        ArrayList<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);

        TravellingSalesmanProblem tsp = new TravellingSalesmanProblem(start, points);

        tsp.calculateLengthFromStartToEachPoint();

    }
}
