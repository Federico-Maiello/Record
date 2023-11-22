public record Point(double x, double y) {
    public double calcDistance(Point anotherPoint) {
        double deltaX = this.x - anotherPoint.x;
        double deltaY = this.y - anotherPoint.y;
        return deltaX * deltaX + deltaY * deltaY;
    }
}
