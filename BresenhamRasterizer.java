import java.util.ArrayList;

class BresenhamRasterizer implements LineRasterizer {
    public Point[] rasterize(Point p1, Point p2) {
    int x1 = p1.x;
    int y1 = p1.y;
    int x2 = p2.x;
    int y2 = p2.y;

    ArrayList<Point> points = new ArrayList<>();

    points.add(new Point(x1, y1));
    points.add(new Point(x2, y2));

    return points.toArray(new Point[0]);
       
    }

}
