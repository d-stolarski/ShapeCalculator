public class Square {
    double dimensionA;

    Square(double dimensionA) {
        this.dimensionA = dimensionA;
    }

    double calculateArea(double dimensionA) {
        double score = dimensionA * dimensionA;
        return score;
    }

    double calculatePerimeter(double dimensionA) {
        double score = 4 * dimensionA;
        return score;
    }
}
