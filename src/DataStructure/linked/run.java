package DataStructure.linked;
import DataStructure.linked.SinglyLinkedList.*;

public class run {
    public static void main(String args []) {
        LList<Integer> linkedList = new LList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList.toString());
        linkedList.insertAfter(2, 7);
        System.out.println(linkedList);
        linkedList.prepand(10);
        System.out.println(linkedList);
        linkedList.remove(3);
        System.out.println(linkedList);
    }
}
