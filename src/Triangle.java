public class Triangle {
    double dimensionA;
    double dimensionB;
    double dimensionC;

    Triangle(double dimensionA, double dimensionB, double dimensionC) {
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.dimensionC = dimensionC;
    }

    double calculateArea(double dimensionA, double dimensionB) {
        double score = (dimensionA / 2) * dimensionB;
        return score;
    }

    double calculatePerimeter(double dimensionA, double dimensionB, double dimensionC){
        double score = dimensionA + dimensionB + dimensionC;
        return  score;
    }
}
