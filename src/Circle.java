public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        double score = radius * radius * 3.14;
        return score;
    }

    double calculatePerimeter(double radius) {
        double score = 2 * 3.14 * radius;
        return score;
    }
}
