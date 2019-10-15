package task1;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 8;
        this.width = 5;

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private int area;
    public int area (){
        area = length*width;
        return area;
    }
    private int perim;
    public int perim(){
        perim = (length+width)*2;
        return perim;
    }
}
