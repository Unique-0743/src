import java.util.*;
import java.io.*;
import java.lang.*;
public class Sts {
    // STS CAT SYLLABUS PROBLEMS
    public static void main(String[]args){
        //Equisum e= new Equisum();
        //Leader l= new Leader();
       // Majority m= new Majority();
     Select s1= new Select();
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();// size of array
       int  arr [] = new int[n];//array intialization
       //values assigning for array indexes.
       for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
       }
       //l.lead(arr,n);
     // e.equisum(arr,n);
      //System.out.println("THE MAXIMUM EQUILIBRIUM SUM OF GIVEN ARRAY IS"+e.maxsum(arr,n));
     // l.leadright(arr,n);
     //m.major(arr,n);
     //m.major1(arr,n);
     //System.out.print("SORTED ARRAY IS : ");
     //s1.Selection(arr, n);
     int a= s.nextInt();
     int b=s.nextInt();
     System.out.println("no of paths :"+Manuevering.pathnumber(a, b));

    }
   

}
class Equisum{
    // approach 1
    static void equisum(int arr[],int n){
        int m= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prefsum=arr[i];
           for(int k=0;k<i;k++){
            prefsum += arr[k];
           }
           int suffsum=0;
          for(int j=i;j<n;j++){
              suffsum+=arr[j];
          }
          if(suffsum==prefsum){
              m= Math.max(suffsum,m);
          }
        }
  
         
        System.out.println("THE max equilibrium sum is ="+m);  

    }
    // equisum Approach 2
    int maxsum(int arr[],int n){
        int m=Integer.MIN_VALUE;int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        for(int i=0; i<n;i++){
            int prefsum=arr[i];
            for(int j=0; j<i;j++){
                prefsum+=arr[j];
            }
            if(sum==prefsum){
                m=Math.max(m,sum);

            }
            sum-=arr[i];
        }
        return m;
    }

}
class Leader{
    //approach 1
    void lead(int arr[],int n){
        
        System.out.print("THE LEADERS OF THE GIVEN ARRAY ARE ");int a;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    if(j==(n-1)){
                        System.out.print(arr[i]+" ");
                     }
                }
            }
            
        }
        System.out.print(arr[n-1]);
    }
    //approach 2
    void leadright(int arr[],int n){
        int max=Integer.MIN_VALUE;
        System.out.print("THE LEADERS OF THE GIVEN ARRAY ");
        int arrsort[]=new int[n];
        int i=0;
        for(int j=n-1;j>=0;j--){
            
            if(max<arr[j]){
                max=arr[j];
              arrsort[i]=arr[j];
               // System.out.println(arr[j]+" ");
               i++;
            }
            
        }
        for(int k=i-1;k>=0;k--){
            System.out.println(arrsort[k]);
        }
    }
}
class Majority{
    //approach 1
    void major(int arr[],int n){
        int count,max=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            max=Math.max(max,count);

        }
        if(max>(n/2)){
            for(int i=0;i<n;i++){
                count=0;
                for(int j=0;j<n;j++){
                    if(arr[j]==arr[i]){
                      count++;
                    }
                }
                if(count==max){
                    
            System.out.println("THE MAJORITY ELEMENT OF GIVEN ARRAY IS "+arr[i]);
            break;
                }
            }
        }
        else{
            System.out.println("NO MAJORITY ELEMENT FOUND");
        }
    }
    //approach 2
    void major1(int arr[],int n){
        int count=0,candidate=-1;
    int index;
    for(index=0;index<n;index++){
        if(count==0){
            candidate=arr[index];
            count++;
        }
        else{
            if(arr[index]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
    }
    count=0;
    for(int i=0;i<n;i++){
        if(arr[i]==candidate){
            count++;
        }
    }
    if(count>(n/2)){
        System.out.println("THE MAJORITY ELEMENT OF THE ARRAY IS "+candidate);
    }
    else{
        System.out.println("NO MAJORITY ELEMENT IS PRESENT");
    }
    }

}
class Select{
    void Selection(int arr[],int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
class Manuevering{
    static int pathnumber(int m,int n){
        if(m==1|n==1){
            return 1;
        }
        else{
          return  pathnumber(m-1,n)+pathnumber(m,n-1);
        }
    }
   
}
class Combinations{
 public void combo(int arr[],int r,int index,int i){
    int n=arr.length;
    int data[]= new int[r];
  data[index]=arr[i];
for(int j=index+1;j<r;j++){
   data[j]=arr[j];
   System.out.print(data[j]+" ");
   System.out.println("");
}

for(int j=r;j<n;j++){
    int temp=data[j];
    
}




 }
}
