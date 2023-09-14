
class Shape {
    void draw() {}
    void erase() {}
}
class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }
    void erase() {
        System.out.println("Circle.erase()");
    }
}
class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
    void erase() {
        System.out.println("Square.erase()");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // fill up the array with shapes:
        for (int i = 0; i < s.length; i++) {
            s[i] = randShape();
        }
        for (int i = 0; i < s.length; i++) {
            s[i].draw();
        }
    }

    static Shape randShape() {
        int randomNum = (int) (Math.random() * 2) + 1;
        if (randomNum == 1) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
