package task2;

public class Circle {
    private double r;
    private double d;

    public Circle(double r) {
        this.r = r;
        this.d = r*2;
    }


    private double S;
    public double S(){
        S=Math.PI*Math.pow((d/2),2);
        return S;
    }
    private double C;
    public double C(){
        C=2*Math.PI*r;
        return C;
    }
}
