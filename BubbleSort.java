import java.util.Scanner;

public class BubbleSort{
    public static void Bubble_sort(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] arges){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the list: ");
        int n=sc.nextInt();
        System.out.println("enter the elements of the list: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Bubble_sort(arr, n);
        System.out.println("after bubble sort , the list is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
