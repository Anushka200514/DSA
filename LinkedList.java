//CODE AT THE END INSERTION
public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // IMPLEMENTATION OF INSERTION OF A NODE AT THE END
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        // LINKEDLIST IS EMPTY
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // Linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insertion at the beginning
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    //Insertion At Any node
    // Insertion At Any node
public void insertAfter(Node prev_Node, int newData) {
    if (prev_Node == null) {
        System.out.println("The previous node cannot contain null values");
        return;
    }
    Node newNode = new Node(newData);
    newNode.next = prev_Node.next;
    prev_Node.next = newNode;
}
// // Deletion of a node in a linked list
// void deleteNode(int position) {
//     // Linked list is empty
//     if (head == null) {
//         return;
//     }
//     Node temp = head;
//     // delete in the beginning
//     if (position == 0) {
//         head = temp.next;
//         return;
//     }
//     // deletion is not in the beginning of the node
//     for (int i = 0; temp != null && i < position - 1; i++) {
//         temp = temp.next;
//     }
//     if (temp == null || temp.next == null) {
//         return;
//     }
//     temp.next = temp.next.next;
// }


    // Implementation of displaying the linked list
    public void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(4);
        System.out.print("Before insertion of 10 ");
        llist.displayLL();
        System.out.println();
        llist.insertAtEnd(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(9);
        System.out.print("After insertion of 10: ");
        llist.displayLL();
        System.out.println();
        
        
        llist.insertAfter (llist.head.next.next,15);
        llist.displayLL();
        System.out.println();
        // llist.deleteNode(3);
        // System.out.println(" deletion of element");
        // llist.displayLL();
        // System.out.println();
        
    }
}

