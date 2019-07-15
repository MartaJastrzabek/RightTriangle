public class RightTriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(2, 4, 6);
        RightTriangle triangleTest = new RightTriangle();

        boolean isRight = triangleTest.isRightTriangle(triangle);
        System.out.println("Triangle is right: " + isRight);
        System.out.println();

        Triangle triangle2 = new Triangle(3, 4 , 5);
        isRight = triangleTest.isRightTriangle(triangle2);
        System.out.println("Triangle is right: " + isRight);



    }
}
