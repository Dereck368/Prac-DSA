package linked.SinglyLinkedList;

public class LList<E> {
    private Node<E> head;
    
    public LList() {
        head = null; 
    }

    public void add(E value) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Node<E> node = new Node(value, null);
        if(head == null) {
            head = node;
        } else {
            Node<E> curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }

        curr.next = node;
        }
    }

    public Node<E> getHead() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("[ ");

        Node<E> curr = head;
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

    // overflow error and underflow error trying to remove at index over list size
    // when doing fully node implementation make sure that insert runs in 0(1) time
    // insert at index linked list function
    public void insertAfter(int i, int value) {
        @SuppressWarnings({"rawtypes", "unchecked"})
        Node<E> node = new Node(value, null);
        int idx = 0;

        Node<E> curr = head;
        while(idx < i) {
            curr = curr.next;
            idx++;
        }

        node.next = curr.next;
        curr.next = node;
    }

    public void prepand(int value) {
        @SuppressWarnings({"rawtypes", "unchecked"})
        Node<E> node = new Node(value, null);
        node.next = head;
        head = node;
    }

    // overflow error and underflow error trying to remove at index
    // remove node at index
    public void remove(int i) {
        int idx = 0;

        Node<E> curr = head;
        while(idx < i - 1) {
            curr = curr.next;
            idx++;
        }

        curr.next = curr.next.next;
    }
    
    // reverse single linked list function
}
    
