package javaapplication130;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaApplication130 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("which file do you want to run?");
    System.out.println("1=the scouts info");
    System.out.println("2=the owners of the troop");
    System.out.println("3=the inbox of thr troop");
    int iii=sc.nextInt();
    switch(iii){
        
    
    
    
    
        case 1:{
ArrayList<members> m = new ArrayList<>();
members member1=new members();
m.add(member1);
System.out.println("how many scouts do you want to add?");
int t=sc.nextInt();

    for (int i = 0; i < t; i++) {
        sc.nextLine();
        System.out.println("enter the #"+(i+1)+" name");
        String namee=sc.nextLine();
        System.out.println("enter the adresse of "+namee);
        String adresse=sc.nextLine();
        System.out.println("enter the age of "+namee);
        int age=sc.nextInt();
        System.out.println("enter the phone number of "+namee);
        int phoneNb=sc.nextInt();
          m.get(0).insert(new infoScout(namee,adresse,age,phoneNb));
    }
    System.out.println("the new sejel of the fr2a is:");
m.get(0).display();
    System.out.println("do you want to delete scouts?");
    char r=sc.next().charAt(0);
    if(r=='y'){
        System.out.println("how many persone do you want to delete?");
        int v=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < v; i++) {
            System.out.println("enter the #"+(i+1)+"name");
            String name=sc.nextLine();
            m.get(0).delete(name);
            }
        }else if(r=='n'){
                System.out.println("okay bro");

    }else{
            System.out.println("invalid letter");
        }
    System.out.println("do you want to search a scout?");
         char p=sc.next().charAt(0);
        sc.nextLine();
        if(p=='y'){
            System.out.println("enter the name do you want to search for");
            String ns=sc.nextLine();
            System.out.println(m.get(0).search(ns));
        }else if(p=='n'){
            System.out.println("okay");
        }else{
            System.out.println("invalid letter");
        }
        
    
    
        }break;
    
    
        case 2:{
LinkedList l1=new LinkedList();
System.out.println("how many owners do you want to add?");
int ta=sc.nextInt();

    for (int i = 0; i < ta; i++) {
        sc.nextLine();
        System.out.println("what is the item?"); 
        String item=sc.nextLine();
        System.out.println("how many "+item+ " we have?");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("what is the quality of the "+item+"?");
        String quality=sc.nextLine();
        System.out.println("what is the source of the "+item+"?");
        String source=sc.nextLine();
        l1.insert(new owners(item,quantity,quality,source));
        
    }
    System.out.println("the owners of the fer2a are:");
    l1.display();
    System.out.println("do you want to search for a item?");
    char o=sc.next().charAt(0);
    if(o=='y'){
        System.out.println("how many elements do you want to search?");
        int b=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < b; i++) {
            System.out.println("enter the "+(i+1)+" elements");
            String j=sc.nextLine();
            l1.search(j);
        }
        }else if(o=='n'){
                System.out.println("okay bro");
                }else{
            System.out.println("invalid letter");
        }
        System.out.println("do you want to delete an item?");
    char op=sc.next().charAt(0);
    if(op=='y'){
        System.out.println("how many elements do you want to delete?");
        int b=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < b; i++) {
            l1.delete();
        }
        }else if(op=='n'){
                System.out.println("okay bro");
                }else{
            System.out.println("invalid letter");
        }
    System.out.println("the new owners are:");
    l1.display();




        }break;

        case 3:{
Stack ss=new Stack();
System.out.println("how many emails do you want to add?");
int t=sc.nextInt();

    for (int i = 0; i < t; i++) {
        sc.nextLine();
        System.out.println("enter the inbox number");
        int inNb=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the topic");
        String topic=sc.nextLine();
        System.out.println("enter the sender");
        String sender=sc.nextLine();
        System.out.println("enter the date");
        int date=sc.nextInt();
        System.out.println("enter the decisions");
        sc.nextLine();
        String decisions=sc.nextLine();
          ss.Push(new wered(inNb,topic,sender,date,decisions));
}ss.display();

 System.out.println("do you want to pop an mail?");
    char opp=sc.next().charAt(0);
    if(opp=='y'){
        System.out.println("how many mails do you want to pop?");
        int b=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < b; i++) {
            ss.Pop();
        }
        }else if(opp=='n'){
                System.out.println("okay bro");
                }else{
            System.out.println("invalid letter");
        }
    System.out.println("the new inbox is:");
    ss.display();

        System.out.println("do you want to search for ana email?");
         char oppp=sc.next().charAt(0);
    if(oppp=='y'){
        System.out.println("input the sender name");
        String test=sc.nextLine();
       ss.search(test);
    }
    
}break;}}}

