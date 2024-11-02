package stack;

public class run {
    public static void main(String args []) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);

        System.out.println(s.get_top());

        System.out.println(s);

        s.pop();

        System.out.println(s);
        System.out.println(s.get_top());
    }
}