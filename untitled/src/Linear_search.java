public class Linear_search {
    public static int Linear(int []arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int [] arr={1,5,7,9,3,4};
       int target=7;
       int result=Linear(arr,target);
       if(result==-1){
           System.out.println("Element not present in array");
       }
       else{
           System.out.println(target+" found at index " + result);
       }
    }
}
