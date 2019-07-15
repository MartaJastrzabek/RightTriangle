public class RightTriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(2, 4, 6);
        RightTriangle triangleTest = new RightTriangle();

        boolean isRight = triangleTest.isRightTriangle(triangle);
        System.out.println("Triangle is right: " + isRight);
        System.out.println();

        Triangle triangle2 = new Triangle(3,4,5);
        isRight = triangleTest.isRightTriangle(triangle2);
        System.out.println("Triangle is right: " + isRight);
        System.out.println();

        Triangle triangle3 = new Triangle(5,3,4);
        isRight = triangleTest.isRightTriangle(triangle2);
        System.out.println("Triangle is right: " + isRight);
        System.out.println();

        Triangle triangle4 = new Triangle(4,3,5);
        isRight = triangleTest.isRightTriangle(triangle4);
        System.out.println("Triangle is right: " + isRight);
        System.out.println();

        Triangle triangle5 = new Triangle(4,5,3);
        isRight = triangleTest.isRightTriangle(triangle5);
        System.out.println("Triangle is right: " + isRight);
        System.out.println();


    }
}
