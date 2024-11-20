package Problem3;

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
    
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (1.5 * (a + b) - Math.sqrt(a * b));
    }
}

