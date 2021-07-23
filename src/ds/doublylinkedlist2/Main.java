package ds.doublylinkedlist2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("AAA", 1);
        Employee employee2 = new Employee("BBB", 2);
        Employee employee3 = new Employee("CCC", 3);
        Employee employee4 = new Employee("BEfore", 4);

        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addToFront(employee1);
        dList.removeFromFront();
        dList.addToFront(employee2);
        dList.addToBack(employee3);
//        dList.print();
        dList.addBefore(employee4,employee3);
        dList.print();

    }
}
