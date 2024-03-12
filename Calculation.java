public class Calculation {
    //overloading method
    public Double calculateArea (Double side){
        return side * side;
    }

    public Double calculateArea (Double length, Double width) {
        return length * width;
    }

    //overriding method
    public Double calculatePerimeter(Double side) {
        return 4 * side;
    }
}

