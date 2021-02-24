import java.util.*;

public class Apple{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,m,n;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        m=sc.nextInt();
        n=sc.nextInt();

        int ar[]= new int[m];
        int arr[]= new int[n];
        for(int i=0;i<m;i++)
             ar[i]=sc.nextInt();
        for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();
        for(int i=0;i<m;i++)
             ar[i]=ar[i]+c;
        for(int i=0;i<n;i++)
             arr[i]=arr[i]+d;
        
        int k=0,p=0;
        for(int i=0;i<m;i++)
        {
            if(ar[i]>=a && ar[i]<=b)
                k++;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
               p++;
        }
        System.out.println(k);
        System.out.println(p);
        
    }
}
