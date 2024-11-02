package linked.SinglyLinkedList;

class Node<E> {
    E item;
    Node<E> next;

    public Node(E element, Node<E> next) {
        item = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(item);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Node) {
            @SuppressWarnings("unchecked")
            Node<E> otherObject = (Node<E>) other;
            return otherObject.next == this.next && otherObject.item == this.item;
        }

        return false;
    }
}
