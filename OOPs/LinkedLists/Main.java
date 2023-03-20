package LinkedLists;

public class Main {
    public static void main(String[] args) {
        SL list = new SL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insert(100,3);

        list.display();
//        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
    }
}
