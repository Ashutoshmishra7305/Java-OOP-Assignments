// 1. Parent Class: Rectangle
class Rectangle {
    int length;
    int breadth;

    // Constructor (Value set karne ke liye)
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void printPerimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
    }
}

// 2. Child Class: Square (Rectangle se juda hua)
class Square extends Rectangle {
    // Square ka constructor
    Square(int side) {
        // super(...) Parent (Rectangle) ke constructor ko dono sides bhej deta hai
        super(side, side);
    }
}

// 3. Main Class
public class Q3 {
    public static void main(String[] args) {
        // Rectangle banaya: length = 10, breadth = 5
        Rectangle r = new Rectangle(10, 5);
        r.printArea();
        r.printPerimeter();

        System.out.println("--------------------");

        // Square banaya: side = 4
        Square s = new Square(4);
        s.printArea();
        s.printPerimeter();
    }
}