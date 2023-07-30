import java.util.Stack;

public class Tussu {

    public static void pushatbottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushatbottom(top, s);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(8);
        pushatbottom(6, s);
        reverse(s);
        // int mid = ((s.size() - 1) / 2);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

        // while (!s.empty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }
    }
}
