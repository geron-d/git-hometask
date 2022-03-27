package by.it.academy;


import by.it.academy.square.triangle.IsoscelesTriangleSquare;
import by.it.academy.square.triangle.IsoscelesTriangleSquareImplementation;
import by.it.academy.square.triangle.TriangleSquare;
import by.it.academy.square.triangle.TriangleSquareImplementation;

public class App {
    public static void main(String[] args) {
        TriangleSquare triangleSquare = new TriangleSquareImplementation();
        System.out.println("squareThroughBaseAndHeight : " + triangleSquare.squareThroughBaseAndHeight(5, 5));
        System.out.println("squareThroughTwoSidesAndAngleBetweenThem : " + triangleSquare.squareThroughTwoSidesAndAngleBetweenThem(5, 5, 90));
        System.out.println("squareThroughSidesAndTwoAdjacentAngles : " + triangleSquare.squareThroughSidesAndTwoAdjacentAngles(5, 90, 45));
        System.out.println();

        IsoscelesTriangleSquare isoscelesTriangleSquare = new IsoscelesTriangleSquareImplementation();
        System.out.println("squareThroughBaseAndHeight : " + isoscelesTriangleSquare.squareThroughBaseAndHeight(7.071, 3.536));
        System.out.println("squareThroughSidesAndAngleBetweenThem : " + isoscelesTriangleSquare.squareThroughSidesAndAngleBetweenThem(5, 90));
    }
}
