package Stack_programs;

class Stack {
    int[] stack;
    int top;
    int capacity;

    Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) return;
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class StackMain {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
