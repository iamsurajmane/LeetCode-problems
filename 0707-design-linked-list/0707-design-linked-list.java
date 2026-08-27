class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.val;
    }

    public void addAtHead(int val) {

        ListNode newNode = new ListNode(val);

        newNode.next = head;
        head = newNode;

        size++;
    }

    public void addAtTail(int val) {

        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
        } else {

            ListNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        // Add at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        // Add at tail
        if (index == size) {
            addAtTail(val);
            return;
        }

        ListNode current = head;

        // Move to node before the index
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        ListNode newNode = new ListNode(val);

        newNode.next = current.next;
        current.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        // Delete head
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        ListNode current = head;

        // Move to node before the target
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Remove the target node
        current.next = current.next.next;

        size--;
    }
}