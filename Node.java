package javaapplication130;
public class Node {
    Node next;
    owners w;

    public Node() {
        this.next = null;
        this.w = null;
    }

    public Node(owners w){
        this.w = w;
        this.next = null;
    }
}