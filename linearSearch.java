import java.util.Scanner;

public class linearSearch {
    public static  int linear_search(int ar[],int n,int k){
        for(int i=0;i<n;i++){
            if(ar[i]==k){
                return i;
            }
        }        
        return -999;
    }
    public static void main(String arges[]) {
        System.out.println("enter the size of the list: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        System.out.println("enter the list: ");
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();            
        }
        System.out.print("enter data to search X: ");
        int k=sc.nextInt();
        sc.close();
        int index=linear_search(ar, n, k);
        if(index==-999)
            System.out.println("the element is not found");
        else
            System.out.println("the element is found and the element is: "+index);    
    }
}
