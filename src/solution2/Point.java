package solution2;

/**
 * Created by Ivan on 23.09.2016.
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public  boolean checkPoint(){
        boolean result = false;
        if (x >= -4 & x <= 4 & y <= 5 & y >= 0){
            result = true;
        }
        if (x >= -6 & x <= 6  & y >= -3 & y <= 0){
            result = true;
        }
        return result;
    }

}
