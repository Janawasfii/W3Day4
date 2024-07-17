//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(5,7,8,5);
        MovablePoint p2 = new MovablePoint(6,8,9,4);
        MovablePoint p3 = new MovablePoint(7,9,10,3);
        MovablePoint p4 = new MovablePoint(8,10,11,2);

        System.out.println("Moving for the first point: ");
        p1.moveUp();
        p1.moveDown();
        p1.moveRight();
        p1.moveLeft();
        System.out.println("******************");


        System.out.println("Moving for the second point: ");
        p2.moveUp();
        p2.moveDown();
        p2.moveRight();
        p2.moveLeft();
        System.out.println("******************");

        System.out.println("Moving for the third point: ");
        p3.moveUp();
        p3.moveDown();
        p3.moveRight();
        p3.moveLeft();
        System.out.println("******************");



    }
}