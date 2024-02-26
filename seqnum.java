import java.util.*;
 class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER INITIAL VALUE :");
        int init= s.nextInt();
        System.out.println("ENTER FINAL VALUE :");
        int fin=s.nextInt();
        String str=String.format("%d",fin);
         int a=str.length();
        int arr[]= new int[a];
        for(int i=init;i<=fin;i++){
            int l=i;
            int count=0;
            int k=0;
            while(l!=0){
                int d=l%10;
                l=l/10;
                arr[k]=d;
                k++;
                
            }
            for(int j=0;j<a-1;j++){
                int diff=(arr[j]-arr[j+1]);
               if(diff==1){
                count++;
               }
               else{
                 break;
               }
            }
            if(count==a-1){
                System.out.println(i+"is a sequential number");
            }
           

        }
       
    }
}
