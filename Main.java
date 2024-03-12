public class Main {
    public static void main(String[] args) {
        // Example usage of the classes
        Triangle triangle = new Triangle("MyTriangle", 3.0, 4.0, 5.0);
        triangle.getInfo();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Equilateral", 4.0);
        equilateralTriangle.getInfo();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle("Isosceles", 5.0, 3.0);
        isoscelesTriangle.getInfo();

        RightTriangle rightTriangle = new RightTriangle("RightTriangle", 6.0, 8.0);
        rightTriangle.getInfo();

        Rectangle rectangle = new Rectangle("MyRectangle", 5.0, 7.0);
        rectangle.getInfo();

        Circle circle = new Circle("MyCircle", 3.0);
        circle.getInfo();
    }

}
