public int[] quickSort(int[] arr,int lb,int ub){
if(lb<ub){
int store=partiition(arr,lb,ub);
quickSore(arr,lb,store-1);
quickSore(arr,store+1,ub);
}
return arr;
}
public int partition(int[] arr,int lb,int ub){
int pivort=arr[lb];
int start=lb;
int end=ub;
while(start<end){
while(arr[start]<=pivort){
  start++;
 }
while(arr[end]>pivot]{
end--;
}
if(start<end){
swap(start,end,arr);
}
}
swap(lb,end,arr);
return end;
}
public void swap(int start,int end,int[] arr){
int temp=arr[low];
arr[low]=arr[high];
arr[high]=temp;
}

      // This algo is work on divide and  conquer
      
      
      
      
      //O(NlogN)
      //O(1)
