package Programming.Exercises;

class Fan {
    public static final Integer SLOW = 1;
    public static final Integer MEDIUM = 2;
    public static final Integer FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(on)
            return "Speed:" + speed + "\nColor:" + color + "\nRadius:" + radius;
        else
            return "fan is off";
    }

}

public class TheFan {
    public static void main(String[] args) {
        Fan fan1= new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("风扇的速度为：" + fan1.getSpeed() +
                " 半径为" + fan1.getRadius() + " 颜色为" + fan1.getColor()
        + " 状态为" + fan1.isOn());
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("风扇的速度为：" + fan2.getSpeed() +
                " 半径为" + fan2.getRadius() + " 颜色为" + fan2.getColor()
                + " 状态为" + fan2.isOn());
    }
}
