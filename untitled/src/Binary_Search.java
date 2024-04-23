public class Binary_Search {
    public static int Binary(int [] arr,int key){
    int first=0;
    int last=arr.length-1;
    int mid=(first+last)/2;
    while(first<=last){
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            first=mid+1;
        }
        else{
            last=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
  int [] arr={10,20,30,40,50,60,70,80};
  int key=40;
  int result=Binary(arr,key);
  if(result==-1){
      System.out.println(key+" not found");
  }
  else{
      System.out.println(key+" found at position "+result);
  }
    }
}
