public class ShapeCalculator {

    static final double PI = 3.14;

    double squareArea(Square square) {
        double area = square.dimensionA * square.dimensionA;
        return area;
    }

    double circleArea(Circle circle) {
        double area = PI * (circle.radius * circle.radius);
        return area;
    }

    double trianglePerimeter(Triangle triangle) {
        double perimeter = triangle.dimensionA + triangle.dimensionB + triangle.dimensionC;
        return perimeter;
    }

    double rectPerimeter(Rectangle rectangle) {
        double perimeter = (2 * rectangle.dimensionA) + (2 * rectangle.dimensionB);
        return perimeter;
    }
}
