package org.example.learning.dataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 0;
    }

    public void printList() {
        Node printPointer = head;
        while (printPointer != null) {
            System.out.print(printPointer.value + " ");
            printPointer = printPointer.next;
        }
        System.out.println();
    }

    public void addNode(int value) {
        tail.next = new Node(value);
        tail.next.next = null;
        tail = tail.next;
        length++;
    }

    public void removeLastNode() {
        Node tempPointer = head;
        while (tempPointer != null) {
            if (tempPointer.next.next == null) {
                tail = tempPointer;
                tail.next = null;
                length--;
                break;
            }
            tempPointer = tempPointer.next;
        }
    }

    public void addNodeToHead(int value) {
        Node newHeadNode = new Node(value);
        if (length == 0) {
            head = newHeadNode;
            tail = newHeadNode;
            tail.next = null;
        } else {
            newHeadNode.next = head;
            head = newHeadNode;
        }
        length++;
    }

    public void removeFirst() {
        if (length == 0)
            head = null;
        else
            head = head.next;
        length--;
        if (length == 0)
            tail = null;
    }

//    public Node get(int index) {
//        Node temp = null;
//        if (index < 0 || index >= length)
//            return null;
//        for (int i = 0; i <= index; i++) {
//            temp = head.next;
//        }
//        return temp;
//    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node requestedIndexNode = get(index);
        if (requestedIndexNode != null) {
            requestedIndexNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {

        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            addNodeToHead(value);
            return true;
        }
        if (index == length) {
            addNode(value);
            return true;
        }
        Node nodeToInsertAtIndex = new Node(value);
        Node tempNodePointer = get(index - 1);
        nodeToInsertAtIndex.next = tempNodePointer.next;
        tempNodePointer.next = nodeToInsertAtIndex;
        length++;
        return false;
    }

    public boolean remove(int index) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            removeFirst();
            return true;
        }
        if (index == length) {
            removeLastNode();
            return true;
        }
        Node tempPointer = get(index - 1);
        Node toBeDeletedNode = tempPointer.next;
        tempPointer.next = toBeDeletedNode.next;
        toBeDeletedNode.next = null;
        length--;

        return false;
    }

    public void reverse() {
        Node tempPointer = head;
        head = tail;
        tail = tempPointer;
        Node afterPointer = tempPointer.next;
        Node beforePointer = null;

        for (int i = 0; i < length; i++) {
            afterPointer = tempPointer.next;
            tempPointer.next = beforePointer;
            beforePointer = tempPointer;
            tempPointer = afterPointer;
        }
    }

    public Node mergeTwoLists(Node list1, Node list2) {

        ArrayList<Integer> arr = new ArrayList<>();
        while (list1 != null) {
            arr.add(list1.value);
            list1 = list1.next;
        }
        while (list2 != null) {
            arr.add(list2.value);
            list2 = list2.next;
        }

        Collections.sort(arr);

        Node mergedNode = new Node(-1);

        for (int i = 0; i < arr.size() - 1; i++) {
            mergedNode.next = new Node(arr.get(i));
            mergedNode = mergedNode.next;
        }


        return mergedNode;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(40);

        linkedList.printList();
        linkedList.removeLastNode();
        linkedList.printList();
        linkedList.addNodeToHead(99);
        linkedList.addNodeToHead(919);
        linkedList.printList();
        linkedList.removeFirst();
        linkedList.printList();
        System.out.println(linkedList.get(0).value);
        System.out.println(linkedList.set(2, 9971));
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();



    }
}
