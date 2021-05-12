package AS1T6;

public class Rectangle {
    int length, breadth;
    public Rectangle(){
        length = 0;
        breadth = 0;
    }
    public Rectangle(int length, int breadth){
        this.length = 7;
        this.breadth = 5;
    }
    public Rectangle(int length){
        this.length = 3;
        breadth = 9;
    }
    public void area(){
        System.out.println(length*breadth);
    }
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.area();
        Rectangle r2 = new Rectangle(5, 10);
        r2.area();
        Rectangle r3 = new Rectangle(6);
        r3.area();
    }
}
