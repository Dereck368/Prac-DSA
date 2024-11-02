package stack;

import linked.SinglyLinkedList.Node;

public class Stack<E> {
    private Node<E> top;

    public Stack() {
        top = null;
    }

    /*
     * 3 <---top "push(can easily add) pop (can easily take this away)"
     * 2
     * 4
     * 5
     * 5
     * 
     * prepend
     */
    public void push(E value) {
        if (top == null) {
            Node<E> element = new Node<E>(value);
            top = element;
        } else {
            Node<E> element = new Node<E>(value, top);
            top = element;
        }
    }

    // top
    public Node<E> get_top(){
        return top;
    }

    // removes value from top of stack
    public void pop() {
        if (top == null) {
            System.out.println("underflow error"); // I'm supprised java doesn't have an under flow error/ exception
        } else {
            top = top.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("[ ");

        Node<E> curr = top;
        while(curr != null) {
            build.append(curr.toString());
            if(curr.next != null) {
                build.append(",");
            }
            build.append(" ");
            curr = curr.next; 
        }

        build.append("]");

        return build.toString();
    }
}
