package ClassHomeWork.section13_6_7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface Colorable
{
    public abstract void howToColor();
}

abstract class GeometricObject implements Colorable {
    private String color = "blue";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color +
                "\nfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPrimeter();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        super();
    }
    public Square(double side,String color,boolean filled) {
        super(color,filled);
        this.side = side;
    }
    @Override
    public void howToColor() {
        System.out.println("着色为： " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPrimeter() {
        return side * 4;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        List<Square> list = new ArrayList<>();
        list.add(new Square(1.0,"white",true));
        list.add(new Square(2.3,"blue",false));
        list.add(new Square(9.9,"red",true));
        list.add(new Square(1.0,"orange",true));
        list.add(new Square(6.6,"black",false));
        System.out.println(list.toString());
    }
}
