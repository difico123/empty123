public class LINKEDLIST {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * List Node.
     */
    static class NodeList {
        public Node head;
        public Node tail;

        public NodeList() {
            this.head = null;
            this.tail = null;
        }

        /**
         * insert Node.
         * @param data data of new Node
         */
        public void insertNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        }

        /**
         * @param position the position you want to delete node
         */
        public Node deleteNode(int position) {
            int i = 0;
            Node newHead = this.head;
            if (head == null) {
                return head;
            } else if (position == 0) {
                head = head.next;
                return head;
            } else {
                while (i < position - 1 && this.head.next != null) {
                    this.head = this.head.next;
                    i++;
                }
                head.next = head.next.next;
                return newHead;
            }
        }
        /**
         * DisplayList
         */
        public void disPlayList() {
            int count = 1;

            while (this.head != null) {
                System.out.println(count + " : " + this.head.data);
                head = head.next;
                count++;
            }
        }
    }

    static boolean compareTwoListNode(Node head1, Node head2) {
        if (head1 != null && head2 != null) {
            while (head1 != null && head2 != null ) {
                if(head1.data != head2.data) return false;
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        if (head1 == null && head2 == null) {
            return true;
        }
        else return false;
    }
    static int getNode(Node head, int positionFromTail) {
        int lengOfLink = 0;
        int count = 0;
        Node head1 = head;
        while (head != null) {
            head = head.next;
            lengOfLink ++;
        }

        while (count < lengOfLink - positionFromTail - 1) {
            head1 = head1.next;
            count ++;
        }
        return head1.data;
    }
    static Node reverse(Node head) {
        Node curr = head;
        Node pre = null;
        Node aft = null;
        while (curr != null)
        {
            aft = curr.next;
            curr.next = pre;
            pre = curr;
            curr = aft;
        }
        return pre;

    }

    /**
     * insert Node At Tail By Recursion.
     * @param head Node
     * @param value value of new node
     * @return list
     */
    static Node insertNodeAtTailByRecursion(Node head, int value) {
        Node newHead = head;
        if (head != null) {
            return insertNodeAtTailByRecursion(head.next, value);
        } else {
            Node newNode = new Node(value);
            newNode.data = value;
            head = newNode;
            return newHead;
        }
    }

    static Node insertNodeAtHeadByRecursion(Node head, int data) {
        if (head == null)
            return new Node(data);
        else {
            head.next = insertNodeAtHeadByRecursion(head.next,head.data);
            head.data = data;
        }
        return head;
    }

    static Node displayListByRecursion(Node head) {
        if(head == null) return head;
        else {
            System.out.println(head.data);
            head.next = displayListByRecursion(head.next);
        }
        return head;
    }
    static boolean compareLists(Node head1, Node head2) {
        if(head1 == null && head2 == null) return true;
        else if (head1 == null || head2 == null) {
            return false;
        }
        else return (head1.data == head2.data) && compareLists(head1.next,head2.next);
    }

//    static Node insertA
    /************************************************************
     *
     *
     *
     *
     * MAIN.
     *
     *
     *
     *
     ************************************************************/
    public static void main(String[] args) {
        NodeList head = new NodeList();
        head.insertNode(1);
        head.insertNode(2);
        head.insertNode(3);// 3 2 1
        head.insertNode(4);
        head.insertNode(5);
        head.insertNode(6);
        head.insertNode(7);

        NodeList muscle = new NodeList();
        muscle.insertNode(1);
        muscle.insertNode(2);
        muscle.insertNode(3);// 3 2 1
        muscle.insertNode(4);
        muscle.insertNode(5);
        muscle.insertNode(6);
        muscle.insertNode(8);
//        head.disPlayList();
//        muscle.head = reverse(head.head);
//        muscle.disPlayList();
//
//        System.out.print(compareTwoListNode(muscle.head, head.head));
//        System.out.print(getNode(head.head,0));
//        head.head = insertNodeAtTailByRecursion(head.head,5);
        //head.disPlayList();
        //displayListByRecursion(head.head);
        head.head = insertNodeAtHeadByRecursion(head.head,10);
        head.disPlayList();
    }
}
