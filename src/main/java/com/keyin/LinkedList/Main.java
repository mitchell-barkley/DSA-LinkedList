package com.keyin.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 4);
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(4);
        singleLinkedList.deleteAtBeginning();
        singleLinkedList.traverseLinkedList();
        singleLinkedList.deleteAtEnd();
        singleLinkedList.traverseLinkedList();
        singleLinkedList.deleteAtLocation(2);
        singleLinkedList.traverseLinkedList();
        singleLinkedList.deleteLinkedList();
        singleLinkedList.traverseLinkedList();
    }
}



//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
// why when inserting a value at a position that is already occupied, it throws a null pointer exception.
