public class Circle {

    private double radius;
    private String color;

    public void area(){
        System.out.println(radius * Math.pow(3.14, 2));
    }

    public void perimeter(){
        System.out.println(2 * 3.14 * radius);
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        return String.format(
                "радиус=%.2f, цвет=%s, площадь=%.2f, периметр=%.2f ",
                radius, color, radius * Math.pow(3.14, 2), 2 * 3.14 * radius
                );
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5, "red");

        System.out.println(circle);


    }
}

