package by.it.academy.square.triangle;

public class TriangleSquareImplementation implements TriangleSquare{
    @Override
    public double squareThroughBaseAndHeight(double base, double height) {
        double square = 0.5 * base * height;
        return square;
    }

    @Override
    public double squareThroughTwoSidesAndAngleBetweenThem(double sideOne, double sideTwo, double angle) {
        double square = 0.5 * sideOne * sideTwo * Math.sin(angle);
        return square;
    }

    @Override
    public double squareThroughSidesAndTwoAdjacentAngles(double side, double angleOne, double angleTwo) {
        double square = Math.pow(side, 2) * (Math.sin(angleOne) * Math.sin(angleTwo)) / 2 / Math.sin(angleOne + angleTwo);
        return square;
    }
}
