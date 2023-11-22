public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(11, 24);
        Point point2 = new Point(36, 48);

        System.out.println("Coordinate di point1: x = " + point1.x() + ", y = " + point1.y());
        System.out.println("Coordinate di point2: x = " + point2.x() + ", y = " + point2.y());

        double distance = point1.calcDistance(point2);
        System.out.println("Distanza tra point1 e point2: " + distance);
    }
}
