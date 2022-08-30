package behavioralPattern.memento;

/**
 * Trong ví dụ bên dưới chúng ta sẽ tách biệt các thành phần của Memento Pattern ra từng class riêng lẻ để tiện quản lý.
 * Chương trình cho phép chúng ta có thể khôi phục lại dữ liệu tại một thời điểm đã lưu trữ trước đó.
 */
public class MementoPatternExample {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 10);
        originator.setX(originator.getY() * 51);
        System.out.println("State initial: " + originator);

        careTaker.saveMemento(originator.save(), "SAVE #1");

        originator.setY(originator.getX() / 22);
        System.out.println("State changed: " + originator);

        originator.undo(careTaker.getMemento("SAVE #1"));
        System.out.println("State after undo: " + originator);

        originator.setX(Math.pow(originator.getX(), 3));
        careTaker.saveMemento(originator.save(), "SAVE #2");
        System.out.println("State changed: " + originator);

        originator.setY(originator.getX() - 30);
        careTaker.saveMemento(originator.save(), "SAVE #3");
        System.out.println("State saved #3: " + originator);

        originator.setY(originator.getX() / 22);
        careTaker.saveMemento(originator.save(), "SAVE #4");
        System.out.println("State saved #4: " + originator);

        originator.undo(careTaker.getMemento("SAVE #2"));
        System.out.println("Retrieving at saved #2: " + originator);
    }
}
