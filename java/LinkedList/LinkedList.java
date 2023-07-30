class LinkedList {

    Node head;

    public void addFirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void delFirst() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public void delLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head.next = null;
            return;
        }
        Node temp = head;
        Node temp1 = head.next;
        while (temp1.next != null) {
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp.next = null;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
        }
        return count;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(0);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(20);
        list.show();
        list.delFirst();
        list.show();
        list.delLast();
        list.show();
        System.out.println("The size of the linked list is : " + list.size());

    }
}