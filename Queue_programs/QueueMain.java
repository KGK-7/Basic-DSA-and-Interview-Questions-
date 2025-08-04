package Queue_programs;

class Queue {
    int[] queue;
    int front, rear, capacity;

    Queue(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
    }

    void enqueue(int x) {
        if (rear == capacity) return;
        queue[rear++] = x;
    }

    int dequeue() {
        if (front == rear) return -1;
        int x = queue[front];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        return x;
    }

    boolean isEmpty() {
        return front == rear;
    }
}

public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
