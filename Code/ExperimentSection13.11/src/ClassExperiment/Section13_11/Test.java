package ClassExperiment.Section13_11;

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilied(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                "and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
 }

 class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
     private double side;

     public Octagon() { }

     public Octagon(double side) {
         this.side = side;
     }

     public Octagon(double side,String color,boolean filled) {
         super(color,filled);
         this.side = side;
     }
     @Override
     public double getArea() {
         return ((2 + 4 / Math.sqrt(2)) *side *side);
     }

     @Override
     public double getPerimeter() {
         return side * 8;
     }

     public Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

     public int compareTo(Octagon o) {
         if(this.getArea() > o.getArea()) {
             return 1;
         }else if(this.getArea() < o.getArea()) {
             return -1;
         }else {
             return 0;
         }
     }
     public String toString() {
         return super.toString() + "\nside" + side;
     }
 }

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon oct1 = new Octagon(2.0,"blue",true);
        Octagon oct2 = (Octagon)oct1.clone();
        if((oct1.compareTo(oct2)) == 1) {
            System.out.println("c1的面积比c2的大...");
        }else if((oct1.compareTo(oct2)) == -1) {
            System.out.println("oct1的面积比oct2的小...");
        }else {
            System.out.println("oct1的面积与oct2的面积相同...");
        }
    }
}
