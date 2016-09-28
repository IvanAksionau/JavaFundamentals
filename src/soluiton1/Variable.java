package soluiton1;

/**
 * Created by Ivan on 23.09.2016.
 */
public class Variable {
    private double x, y;

    public Variable(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateTheValue() {
        return (1 + Math.pow(Math.sin(x + y), 2))
                / (2 + (Math.abs(x - ((2 * x)
                / (1 + (Math.pow(x, 2) * Math.pow(y, 2))))))) + x;
    }
}
