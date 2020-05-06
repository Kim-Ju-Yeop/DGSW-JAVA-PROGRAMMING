package class05_06.six;

public abstract class Polygon {

    protected double height;
    protected double width;
    protected double radius;

    public abstract double getArea();
    public abstract String getName();

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void print(){
        System.out.println(String.format("%s의 면적 : %.2f", getName(), getArea()));
    }

    public static void main(String[] args) {
        Polygon rectangle = new Rectangle();
        Polygon triangle = new Triangle();
        Polygon circle = new Circle();

        rectangle.setHeight(8);
        rectangle.setWidth(8);
        rectangle.print();

        triangle.setHeight(5);
        triangle.setWidth(7);
        triangle.print();

        circle.setRadius(5);
        circle.print();
    }
}

class Circle extends Polygon {

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String getName() {
        return "원";
    }

    @Override
    public void print(){
        System.out.println(String.format("원의 면적 : %.2f, 반지름 : %.2f", radius, getArea()));
    }
}

class Triangle extends Polygon {

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public String getName() {
        return "삼각형";
    }
}

class Rectangle extends Polygon {

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "사각형";
    }
}

