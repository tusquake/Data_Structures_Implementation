public class CircularQueue {
    static class Queue {
        static int size;
        static int[] arr;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int res = arr[front];
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            return res;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // for (int i = 0; i < rear; i++) {
            // arr[i] = arr[i + 1];
            // }
            // rear--;
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("1st removal" + q.remove());
        q.add(6);
        System.out.println("2nd removal" + q.remove());

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
