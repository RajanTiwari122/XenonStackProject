public class FunToAccessLast {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node fifthElementFromLast(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        Node temp2 = head;
        for (int i = 1; i < 5; i++) {
            temp = temp.next;
        }
        while (temp.next != null) {
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp2;
    }
}