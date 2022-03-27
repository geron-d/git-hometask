package by.it.academy;


import by.it.academy.square.rectangle.RectangleSquare;
import by.it.academy.square.rectangle.RectangleSquareImplementation;
import by.it.academy.square.triangle.TriangleSquare;
import by.it.academy.square.triangle.TriangleSquareImplementation;

public class App {
    public static void main(String[] args) {
        TriangleSquare triangleSquare = new TriangleSquareImplementation();
        System.out.println("squareThroughBaseAndHeight : " + triangleSquare.squareThroughBaseAndHeight(5, 5));
        System.out.println("squareThroughTwoSidesAndAngleBetweenThem : " + triangleSquare.squareThroughTwoSidesAndAngleBetweenThem(5, 5, 90));
        System.out.println("squareThroughSidesAndTwoAdjacentAngles : " + triangleSquare.squareThroughSidesAndTwoAdjacentAngles(5, 90, 45));
        System.out.println();

        RectangleSquare rectangleSquare = new RectangleSquareImplementation();
        System.out.println("squareThroughWidthAndLength : " + rectangleSquare.squareThroughWidthAndLength(5, 5));
        System.out.println("squareThroughQuadrilateralFormula : " + rectangleSquare.squareThroughQuadrilateralFormula(7.071, 90));
        System.out.println("squareThroughSideAndDiagonal : " + rectangleSquare.squareThroughSideAndDiagonal(5, 7.071));
    }
}
