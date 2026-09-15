// Hissa 1: Pehli Class
class Parent {
    void printParent() {
        System.out.println("This is parent class");
    }
}

// Hissa 2: Doosri Class (Subclass)
class Child extends Parent {
    void printChild() {
        System.out.println("This is child class");
    }
}

// Hissa 3: Main Engine jahan se program start hoga
public class Q1 {
    public static void main(String[] args) {
        // Step A: Dono classes ke objects banaye
        Parent p = new Parent();
        Child c = new Child();

        // Step B: Question ke teen tests
        p.printParent(); // 1 - method of parent class by object of parent class
        c.printChild();  // 2 - method of child class by object of child class
        c.printParent(); // 3 - method of parent class by object of child class
    }
}