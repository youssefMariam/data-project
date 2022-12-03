package javaapplication130;
public class LinkedList {
    private Node first;
 
    public LinkedList(Node first) {
        this.first = first;
    }

    public LinkedList() {
        first = null;
    }
    
    public boolean isEmpty(){
       return this.first==null;
    }
    public void insert(owners w){
        Node current=this.first;
        Node n=new Node(w);
        if(isEmpty()){
            this.first=n;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=n;
        }
    }
    public void delete(){
        Node current=this.first;
        while(current.next.next!=null){
            current=current.next;
        }current.next=null;
    }
    public void search(String x){
        Node current=this.first;
        if(isEmpty()){
            System.out.println("no elements to search");
        }else{
        while(current.next!=null){
            if(current.w.toString().contains(x)){
                System.out.println(current.w);
            }
            current=current.next;
        } if(current.w.toString().contains(x)){
                System.out.println(current.w);
            }
    }
        
    }
    public void display(){
        Node current=this.first;
        if(isEmpty()){
            System.out.println("no elements to display");
        }else{
            while(current.next!=null){
                System.out.println(current.w);
                current=current.next;
            }
        }
        System.out.println(current.w);
    }
}
