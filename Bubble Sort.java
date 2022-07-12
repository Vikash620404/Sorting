public int[] bubbleSort(int[] arr,int n){
int[]bubbleSort=new int[n];
int store=checkSwapping=0;
for(int i=0;i<n-1;i++){
checkSwapping=0;
for(int j=0;j<n-1-i;j++){
if(arr[i]>arr[j+1]){
swapping(i,j,arr);
checkSwapping=1
}
} 
if(checkSwapping==0) break;
}
return arr;
}
public void swapping(int i,int j,int[] arr){
int store=arr[i];
arr[i]=arr[j+1];
arr[j]=store;
}



//O(N^2)
//O(N)
