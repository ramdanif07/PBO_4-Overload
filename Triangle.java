public class Triangle extends Shape {
    private Double side1, side2, side3;

    public Triangle (String name, Double side1, Double side2, Double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.calculateArea();
    }

    public void calculateArea() {
        Double halfPrimeter = (side1 + side2 + side3) / 2;
        super.area = Math.sqrt(
            halfPrimeter
            * (halfPrimeter - side1)
            * (halfPrimeter - side2)
            * (halfPrimeter - side3)
        );
    }

    public void getInfo() {
        System.out.println("Triangle " + name + " info");
        System.out.println(" area: " + super.area);
        System.out.println(" sith sides: " + side1);
        System.out.println(", " + side2);
        System.out.println(", " + side3);
        System.out.println();
    }
}
