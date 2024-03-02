import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int n){
        data=n;
        next=null;
        prev=null;
    }
}

class Dlinked{
    Node head=null;
    void inserts(int n){
        Node nnode =new Node(n);
       if(head==null){
         head=nnode;
       }
       else{
        Node temp =head;
        head=nnode;
        head.next=temp;
        temp.prev=head;
       }
    }
    void insertm(int n,int pos){
        Node nnode= new Node(n);
        Node curr=head;
        Node temp;
        if(curr==null){
          if(pos==1){
              curr=nnode;
          }
          else{
            System.out.println("no element is present");
          }
          return;
        }
        else{
            for(int i=1;i<pos-1;i++){
                curr=curr.next;
            }
            temp=curr.next;
           curr.next=nnode;
           curr.next.prev=curr;
           curr.next.next=temp;
           temp.prev=curr.next;
        }

    }
    void insertf(int n){
        Node nnode= new Node(n);
        if(head==null){
            head=nnode;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=nnode;
            curr.next.prev=curr;
        }
    }
    void deletes(){
        if(head!=null){
        Node temp=head.next;
        head=temp;
        head.prev=null;
        }
        else{
            System.out.println("no element present");
        }


    }
    void deletem(int pos){
        Node curr=head;
        Node temp;
        for(int i=1;i<pos-1;i++){
           curr=curr.next;
        }
        temp=curr.next.next;
        curr.next=temp;
        temp.prev=curr;
    
    }
    void deletef(){
         Node curr=head;
         if(head==null){
            System.out.println("no element present");
            return;
         }
         else{
         while(curr.next!=null){
            curr=curr.next;
         }
         if(curr==head){
            head=null;
            return;
         }
         Node temp=curr.prev;
         temp.next=null;
        }
    }
    void updates(int n){
        head.data=n;
    }
    void updatem(int pos,int n){
        Node curr= head;
       for(int i=1;i<pos;i++){
        curr=curr.next;
       }
       curr.data=n;
    }
    void updatef(int n){

        if(head==null){
            System.out.println("no element is present in doubly linked list");
        }
        else{
            Node curr= head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.data=n;
        }
    }
  void display(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"<-->");
            cur=cur.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Dlinked d= new Dlinked();
        int f;
        Scanner s= new Scanner(System.in);
     int num=s.nextInt();// enter number of elements to be inserted
     for(int i=0;i<num;i++){
        d.insertf( f=s.nextInt());

     }
     d.deletef();
     d.display();
      
    }
}

        
