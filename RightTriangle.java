public class RightTriangle extends Triangle {
    public RightTriangle (String name, Double base, Double height){
        super (name, base, height, Math.sqrt(base * base + height * height));
    }
}
