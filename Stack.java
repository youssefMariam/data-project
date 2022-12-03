package javaapplication130;
public class Stack {
    wered [] a;
    int currentNb;
    
       public Stack() {
            a = new wered[100];
            this.currentNb = 0;
        }

        public boolean isEmpty(){
            return currentNb == 0;
        }
        public boolean isFull(){
            return currentNb == a.length;
        }
        public int Size(){
            return currentNb;
        }
        public wered Pop(){
            this.currentNb--;
            wered temp = a[currentNb];
            a[currentNb] = null;
            return temp;
        }
           public void Push(wered x){
            if(isFull()){
                System.out.println("the inbox is full");
            }
            a[currentNb] = x;
            currentNb++;
        }
              public void display(){
            int size = currentNb;
            wered [] tempStack = new wered [size];
            for(int i=0;i<size;i++){
                tempStack[i] = this.Pop();
            }
            wered temp;
            int nb = tempStack.length-1;
            for (int j = 0; j < tempStack.length ; j++){
                temp = tempStack[nb];
                tempStack[nb] = null;
                nb--;
                System.out.println("Element at ["+(j+1)+"] = "+temp.toString());
                this.Push(temp);
            }
        }
              
    public wered search(String senderName){
        wered w1 = new wered();
        int size = currentNb;
        wered[] tempStack = new wered[size];
        for(int i = 0; i < size; i++){
            tempStack[i] = this.Pop();
        }
        wered temp;
        int nb = tempStack.length-1;
        for (int j = 0; j < tempStack.length ; j++){
            
            temp = tempStack[nb];
            tempStack[nb] = null;
            nb--;
            
            if(temp.getSender().equalsIgnoreCase(senderName)){
         
                Push(temp);
            }
         
            this.Push(temp);
        }
        return w1;
    }
}
