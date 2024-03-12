public class Rectangle extends Shape{
    private Double length, width;

    public Rectangle (String name, Double length, Double width) {
        this.name = name;
        this.length = length;
        this.width = width;
        calculateArea();
        
    }

    public void calculateArea() {
        area = length * width;
    }

    public void getInfo() {
        System.out.print("Rectangle " + name + " info");
        System.out.print(" area: " + area);
        System.out.print(" width sides: " + length + ", " + width);
        System.out.println();
    }
}
