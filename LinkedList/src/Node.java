/*
Author: Michael Lewis
Date: 9/9/19
 */

/**
 * Creates a Linked Lists and defines it's values
 */
public class Node {
    private int data;
    private Node next;

    Node(int data) {
        this.data = data;
    }

    public int countNodes(Node head) {
        int count = 0;
        Node currentNode = head;
        while(currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(10);
        Node nodeE = new Node(11);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        head.countNodes(head);
    }
}
