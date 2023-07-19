
import java.util.Scanner;

public class MergeSort{
    public static void merge_sort(int ar[], int p, int r){
        int q;
        if(p<r){
            q=(p+r)/2;
            merge_sort(ar, p, q);
            merge_sort(ar, q+1, r);
            merge(ar,p,q,r);
        }
    }
    public static void merge(int ar[],int p, int q, int r){
        int b[]=new int[r+1]; 
        int l1=p,r1=q+1,i=p;
        while((l1<=q)&&(r1<=r)){
            if(ar[l1]<ar[r1]){
                b[i]=ar[l1];
                l1=l1+1;
                i++;
            }
            else{
                b[i]=ar[r1];
                r1=r1+1;
                i++;
            }
        }
        while(l1<=q){
            b[i]=ar[l1];
            l1=l1+1;
            i++;
        }
        while(r1<=r){
            b[i]=ar[r1];
            r1=r1+1;
            i++;
        }
        for(i=p;i<=r;i++){
            ar[i]=b[i];
        }
    }
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the list: ");
        int n=sc.nextInt(); 
        int ar[]=new int[n];
        System.out.print("enter the values of the list: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("elements in array: ");
        printarray(ar);
         merge_sort(ar,0,n-1);
        System.out.println("\nafter the merge sort ,the sorted list is: ");
         printarray(ar);
                     
    }
    public static void printarray(int ar[]) {
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
