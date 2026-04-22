class Point {
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2){
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
    }

    void display(){
        System.out.println("(" + x + "," + y + ")");
    }
}

public class Assignment4Qn8 {
    public static void main(String[] args){
        Point p1 = new Point(2,3);
        Point p2 = new Point(6,7);

        p1.display();
        p2.display();

        System.out.println("Distance: " + Point.distance(p1,p2));
    }
}