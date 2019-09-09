/*
Author: Michael Lewis
Date: 9/9/19
 */

import java.util.*;
import java.util.LinkedList;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * Notes: If the two linked lists have no intersection at all, return null. The linked lists must retain their original
 * structure after the function returns. You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node() {}  // Default constructor

    public Node getIntersectionNode(Node headA, Node headB) {
        Set<Node> nodes = new HashSet<>();
        Node currentNodeA = headA;

        while (currentNodeA != null) {
            nodes.add(currentNodeA);
            currentNodeA = currentNodeA.next;
        }

        if (nodes.isEmpty()) return null;

        Node currentNodeB = headB;
        while (currentNodeB != null) {
            if (nodes.contains(currentNodeB)) {
                return currentNodeB;
            } else {
                currentNodeB = currentNodeB.next;
            }
        }
        return null;
    }

    /**
     * Construct two Linked Lists and intersect the lists at the nth node
     * @param args
     */
    public static void main(String[] args) {
        Node headA = new Node(4);
        Node nodeA1 = new Node(1);
        Node nodeA2 = new Node(8);
        Node nodeA3 = new Node(4);
        Node nodeA4 = new Node(5);

        Node headB = new Node(5);
        Node nodeB1 = new Node(0);
        Node nodeB2 = new Node(1);
        Node nodeB3 = new Node(8);
        Node nodeB4 = new Node(4);
        Node nodeB5 = new Node(5);

        headA.next = nodeA1;
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;

        headB.next = nodeB1;
        nodeB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;
        nodeB4.next = nodeB5;

        headA.getIntersectionNode(headA, headB);
    }
}
