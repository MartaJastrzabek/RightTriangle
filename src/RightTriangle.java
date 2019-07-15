public class RightTriangle {

    boolean isRightTriangle(Triangle triangle){
        boolean isRightA = ((triangle.b * triangle.b) + (triangle.c * triangle.c)) == (triangle.a * triangle.a);
        boolean isRightB = ((triangle.a * triangle.a) + (triangle.c * triangle.c)) == (triangle.b * triangle.b);
        boolean isRightC = ((triangle.a * triangle.a) + (triangle.b * triangle.b)) == (triangle.c * triangle.c);

        boolean isRight = isRightA || isRightB || isRightC;

        return isRight;
    }
}
