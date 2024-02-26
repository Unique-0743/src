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
}
