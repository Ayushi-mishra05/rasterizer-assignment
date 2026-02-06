import java.util.ArrayList;

class MidpointCircle {

    public static Point[] drawCircle(int xc, int yc, int r) {

        ArrayList<Point> points = new ArrayList<>();

        int x = 0;
        int y = r;
        int p = 1 - r;

        addCirclePoints(points, xc, yc, x, y);

        while (x < y) {
            x++;

            if (p < 0) {
                p = p + 2 * x + 1;
            } else {
                y--;
                p = p + 2 * x + 1 - 2 * y;
            }

            addCirclePoints(points, xc, yc, x, y);
        }

        return points.toArray(new Point[0]);
    }

    private static void addCirclePoints(ArrayList<Point> points, int xc, int yc, int x, int y) {
        points.add(new Point(xc + x, yc + y));
        points.add(new Point(xc - x, yc + y));
        points.add(new Point(xc + x, yc - y));
        points.add(new Point(xc - x, yc - y));
        points.add(new Point(xc + y, yc + x));
        points.add(new Point(xc - y, yc + x));
        points.add(new Point(xc + y, yc - x));
        points.add(new Point(xc - y, yc - x));
    }
}
