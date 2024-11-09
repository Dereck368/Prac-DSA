package ToDoListApp.ToDoList;
import DataStructure.linked.DoublyLinkedList.Node;
/*
 * Using this to make a mobile dev app
 * uses a kind of queue datastructure but
 * will never have dequeue because for the 
 * mobile app we want user to be able to delet any
 * item they want
 */

public class List {
    private int size;
    private int capacity;
    private Node<String> head;
    private Node<String> tail;

    public List(int n) {
        size = n;
        capacity = 0;
        head = null;
        tail = null;
    }

    //add item to todo list
    public void addToList(String item) {
        if (capacity < size) {
            if (head == null) {
                Node<String> n = new Node<String>(item);
                head = n;
                tail = n;
                capacity += 1;
            } else {
                Node<String> n = new Node<String>(item, null);
                tail.setNext(n);
                n.setPrev(tail);
                tail = n;
                capacity += 1;
            }
        } else {
            System.out.println("list is full: delete item before adding new one");
        }
    }

    // delete item from todo list
    public void deleteItem(Node<String> item) {
        if (capacity > 0) {
            // removing node that both tail and head are on
            if (item == head && item == tail) {
                head = null;
                tail = null;
                capacity -= 1;
                return;
            }

            // remove head
            if (item == head) {
                head = item.getNext();
                head.setPrev(null);
                capacity -= 1;
                return;
            }

            // remove tail
            if (item == tail) {
                tail = item.getPrev();
                tail.setNext(null);
                capacity -= 1;
                return;
            }

            // remove middle item
            Node<String> prev = item.getPrev();
            Node<String> next = item.getNext();

            prev.setNext(next);
            next.setPrev(prev);            
            capacity -= 1;
        } else {
            System.out.println("no items to delete");
        }
    }

    // rename item
    public void renameItem(Node<String> item, String name) {
        item.setData(name);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("[ ");

        Node<String> curr = head;
        while(curr != null) {
            build.append(curr.toString());
            if(curr.getNext() != null) {
                build.append(",");
            }
            build.append(" ");
            curr = curr.getNext(); 
        }

        build.append("]");

        return build.toString();
    }

    // for testing purposes
    protected Node<String> getHead() {
        return head;
    }

    protected Node<String> getTail() {
        return tail;
    }
}