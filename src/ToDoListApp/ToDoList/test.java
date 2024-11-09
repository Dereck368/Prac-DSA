package ToDoListApp.ToDoList;

import DataStructure.linked.DoublyLinkedList.Node;

public class test {
    public static void main(String args[]) {
        List l = new List(10);

        l.addToList("1");
        l.addToList("2");
        l.addToList("3");
        l.addToList("4");
        l.addToList("5");
        l.addToList("6");
        l.addToList("7");
        l.addToList("8");
        l.addToList("9");
        l.addToList("10");

        System.out.println(l);

        l.addToList("11"); 

        // testing remove

        // remove head
        Node<String> curr = l.getHead();
        l.deleteItem(curr);

        System.out.println(l);

        // delete tail
        curr = l.getTail();
        l.deleteItem(curr);
        
        System.out.println(l);


        // delete a middle item
        int i = 0;
        curr = l.getHead();
        while(i < 4) {
            curr = curr.getNext();
            i++;
        }

        l.deleteItem(curr);

        System.out.println(l);

        // lets rename head
        curr = l.getHead();
        l.renameItem(curr, "yessir");

        System.out.println(l);

        // works
    }
}
