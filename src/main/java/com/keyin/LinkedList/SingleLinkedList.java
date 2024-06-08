package com.keyin.LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked List
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insert into a linked list
    //0. If link list doesn't exist
    //1. inserting at the beginning
    //2. Inserting at the ending
    //3. Insert anywhere
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }

    //Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //Search for a Node

    public boolean searchNode (int nodeValue){
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //Deleting a Node from a Single linked List
    //0. If link list doesn't exist
    public Node deleteLinkedList(){
        Node tempNode = head;
        if (head == null) {
            System.out.println("SLL does not exist");
            return null;
        } else {
            head = null;
            tail = null;
            System.out.println("SLL deleted");
        }
        return tempNode;
    }

    //1. deleting at the begining
    public void deleteAtBeginning(){
        if (head == null) {
            System.out.println("SLL does not exist");
            return;
        } else {
            head = head.next;
            size--;
            System.out.println("Node deleted from the beginning");
        }
    }

    //2. deleting at the ending
    public Node deleteAtEnd(){
        if (head == null) {
            System.out.println("SLL does not exist");
            return null;
        } else {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
            System.out.println("Node deleted from the end");
            return tempNode;
        }
    }

    //3. deleting anywhere in the list
    public void deleteAtLocation(int location){
        if (head == null) {
            System.out.println("SLL does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            System.out.println("Node deleted from the beginning");
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = null;
                tail = null;
                size--;
                System.out.println("Node deleted from the end");
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
            System.out.println("Node deleted from location: " + location);
        }
    }

}
