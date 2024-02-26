class Node{
    int data;
    Node next;
    Node(int n){
     data=n;
     next=null;
    }
}
class Linked{
    Node head=null;
    Node curr;
    public  void insertf(int n){// insert last
        Node nnode = new Node(n);
        if(head==null){
            head= nnode;
            return;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=nnode;
            return;
        }
    }
    public void inserts(int n){// insert first
        Node nnode = new Node(n);
        if(head== null){
          head= nnode;
        }
        else{
            Node temp =head;
            head= nnode;
            head.next=temp;
        }
    }
    public void insertm(int n,int pos){
        Node nnode= new Node(n);
        Node curr=head;
        Node temp;
        for(int i=1;i<pos-1;i++){
            curr= curr.next;
        }
        temp=curr.next;
        curr.next=nnode;
        curr.next.next=temp;
    

    }
    void delf(){// delete final node of linkedlist...
        Node curr;
        if(head==null){
            System.out.println("no element present");
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
             curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
       }
    }
    void dels(){
        if(head==null){
            System.out.println("no element present in linkedlist");
            return;
        }
        else{
            if(head.next==null){
                head=null;
            }
            else{
                head=head.next;
            }
        }

    }
    void delm(int pos){// delete middle element
      if(head==null){
        System.out.println("no element present in linked list");
        return;
      }
      else if(head.next==null){
        if(pos==1){
            head=null;
            return;
        }
        else{
            System.out.println("no element present in the given index");
            return;
        }
        
      }
       if(pos==1){
        head=head.next;
       }

        Node curr= head;
        Node temp;
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
        temp=curr.next;
        curr=head;
        for(int i=1;i<pos-1;i++){
          curr=curr.next;
        }
        curr.next=temp;
    }
    void updates(int n){
        if(head==null){
            System.out.println("no element present in linked list");
            return;
        }
        head.data= n;

    }
    void updatem(int n,int pos){
        Node curr = head;
        for(int i=1;i<pos;i++){
            curr=curr.next;
            if(curr==null){
                return;
            }
        }
        curr.data=n;
    }
    void updatef(int n){
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.data=n;

    }
    
    void print(){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }
    public static void main(String[]args){
        Linked l1=new Linked();
       l1.insertf(7);//2 
        l1.insertf(8);//3
       l1.insertf(9);//4
       l1.insertf(77);//5
        l1.insertf(7777);//6
         l1.insertf(8888);//7
        l1.insertf(70077);//8
         l1.inserts(89); //1
         l1.insertm(77,9);//9
       l1.delf();
       l1.dels();
        l1.delm(1);
        l1.delm(2);

         l1.print();
    }

}