public class Rectangle {
    double dimensionA;
    double dimensionB;

    Rectangle(double dimensionA, double dimensionB) {
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }

    double calculateArea(double dimensionA, double dimensionB) {
        double score = dimensionA * dimensionB;
        return score;
    }

    double calculatePerimeter(double dimensionA, double dimensionB) {
        double score = (2 * dimensionA) + (2 * dimensionB);
        return score;
    }
}
