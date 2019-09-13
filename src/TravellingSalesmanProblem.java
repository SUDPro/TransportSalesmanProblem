import java.lang.reflect.Array;
import java.util.ArrayList;

public class TravellingSalesmanProblem {

    private Point start;
    private ArrayList<Point> points;
    private ArrayList<Double> lengths = new ArrayList<>();
    private static final double EARTH_RADIUS = 6371000;

    public TravellingSalesmanProblem(Point start, ArrayList<Point> points) {
        this.start = start;
        this.points = points;
    }

    void calculateLengthFromStartToEachPoint() {
        int index = 0;
        for (Point point :
                points) {
            double dLat = Math.toRadians(point.getX() - start.getX());
            double dLng = Math.toRadians(point.getY() - start.getY());
            Double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                    Math.cos(Math.toRadians(start.getX())) * Math.cos(Math.toRadians(point.getX())) *
                            Math.sin(dLng/2) * Math.sin(dLng/2);
            Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
            Double length = EARTH_RADIUS * c;
            index++;
            System.out.println("From starter to " + index + " point length is: " + length + "meters");
            lengths.add(length);
        }
    }

    void calculateMatrix(){

    }


}
