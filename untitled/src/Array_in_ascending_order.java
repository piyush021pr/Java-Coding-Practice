import java.util.Scanner;

public class Array_in_ascending_order {
    public static void main(String[] args) {
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to insert");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        System.out.println();
        System.out.println("The sorted array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
