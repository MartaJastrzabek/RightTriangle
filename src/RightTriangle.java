public class RightTriangle {

    boolean isRightTriangle(Triangle triangle){
        boolean isRight = ((triangle.a * triangle.a) + (triangle.b * triangle.b)) == (triangle.c * triangle.c);
        return isRight;
    }
}
