package ClassHomeWork.section13_6_7;

class MyCircle {
    private double radius = 1.0;
    public MyCircle(){
        radius = 1.0;
    }
    public MyCircle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class ComparableCircle extends MyCircle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super();
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if(this.getArea() > o.getArea()) {
            return 1;
        }else if(this.getArea() < o.getArea()) {
            return -1;
        }else {
            return 0;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(5.6);
        System.out.println("c1的半径为：" + c1.getRadius() + "\nc2的半径为："
                + c2.getRadius());
        if((c1.compareTo(c2)) == 1) {
            System.out.println("c1的面积比c2的大...");
        }else if((c1.compareTo(c2)) == -1) {
            System.out.println("c1的面积比c2的小...");
        }else {
            System.out.println("c1的面积与c2的面积相同...");
        }
    }
}
