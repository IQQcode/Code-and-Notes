package displayrandomnumber;

class CircleWithException1 {
    private double radius;
    private static int numberOfObjects = 0;
    
    public CircleWithException1() {
        this(1.0);  //
    }
    
    public CircleWithException1(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double newRadius) throws IllegalArgumentException {

        if(newRadius >= 0) {
            radius = newRadius;
        }else throw new IllegalArgumentException("Radius cannot be negative");
        
    }
    
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    public double findArea() {
        return radius * radius * 3.1415926525;
    }
    
}

public class CircleWithException {
    
    public static void main(String[] args) {
        
        try {
            CircleWithException1 c1 = new CircleWithException1(5.0);
            CircleWithException1 c2 = new CircleWithException1(-5.0);
            CircleWithException1 c3 = new CircleWithException1(0);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        
        System.out.println("Number of objects created: " + 
                CircleWithException1.getNumberOfObjects());
    }
}
