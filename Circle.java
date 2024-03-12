public class Circle extends Shape {
    private Double radius;

    public Circle (String name, Double radius){
        this.name = name;
        this.radius = radius;
        calculateArea();
        
    }


    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void getInfo() {
        System.out.print("Circle " + name + " info");
        System.out.print(" area: " + area);
        System.out.print(" with radius: " + radius);
        System.out.println();
    }
}
