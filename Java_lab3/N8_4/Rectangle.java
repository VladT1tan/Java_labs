package N8_4;

public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle(){}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        if(length > 0.0 && length < 20.0){
            this.length = length;
        }
        else {
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
        }
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        if(width > 0.0 && width < 20.0){
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
        }
    }

    public double getWidth(){
        return width;
    }

    public double Perimeter(){
        return 2 * (length + width);
    }

    public double Area(){
        return length * width;
    }

    public String toString() {
        return String.format("Rectangle [Length: %.2f, Width: %.2f, Area: %.2f, Perimeter: %.2f]",
                length, width, Area(), Perimeter());
    }

    public static void main(String[] args){
        try {
            //объект прямоугольника
            Rectangle rect1 = new Rectangle();
            System.out.println("Default Rectangle:");
            System.out.println(rect1);

            //пользовательские значения
            Rectangle rect2 = new Rectangle(7.2, 15.5);
            System.out.println("\nCustom Rectangle:");
            System.out.println(rect2);

            //некорректные значения
            Rectangle rect3 = new Rectangle();
            rect3.setLength(30.0);
            rect3.setWidth(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
