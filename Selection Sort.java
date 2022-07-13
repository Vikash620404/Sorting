public int[] selectionSort(int[] arr,int n){
  for(int i=0;i<n-1;i++){
int min=i;
for(int j=i+1;j<n;j++){
if(arr[j]<arr[min]){
min=j;
}
}
if(min!=i){
  swap(arr[i],arr[min]);
}    

  }
return arr;
}
public void swap(int i,int min,int[] arr){
int temp=arr[i];
  arr[i]=arr[min];
arr[min]=temp;
}





//O(N^2)
//O(1)
