package day40.Task2.Package1;

public class Rectangle {

    private int length;
    private int width;

    int area;
    int perimeter;


    private void calculatePerimeter(){
       this.perimeter = 2*(this.length + this.width);
    }

    private void calculateArea(){
        this.area = (this.length * this.width);
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
