package javaapplication130;
import java.util.Arrays;
public class members {
    private infoScout [] a;
    private int currentNb;
    
    public members(){
        this.a=new infoScout[50];
        this.currentNb=0;
    }
    
    public boolean isEmpty(){
        return currentNb==0;
    }
    
    public boolean isFull(){
        return currentNb==a.length;
    }
    public String search(String value){
        for(int i=0;i<currentNb;i++){
            if(a[i].toString().contains(value)){
                return a[i].toString();
            }
        }
        return "scout not found";
    }
    public void insert(infoScout x){
        if(isEmpty()){
            a[0]=x;
            currentNb++;
        }else if(isFull()){
            System.out.println("the group is full!!");
        }else{
            a[currentNb]=x;
            currentNb++;
        }
    }
public void delete(String c){
        int position = -1;
        for(int i = 0; i < currentNb; i++){
            if(a[i].toString().contains(c)) {
                position = i;
                break;
            }
        }
        if(position == -1) return;

        for(int j = position; j<currentNb;j++){
            a[j]=a[j+1];
        }
    System.out.println("Contact "+c+" has been deleted!");
}
public void display(){
    for (int i = 0; i < currentNb; i++) {
        System.out.println(a[i].toString());
    }
}
}
