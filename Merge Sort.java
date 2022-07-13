public int[] mergeSort(int[] arr,int lb,int ub){
if(lb<ub){
int mid=(lb+ub)/2;
mergeSprt(arr,lb,mid);
mergeSort(arr,mid+1,ub);
merge(arr,lb,mid,ub);
}
return arr;
}










public int[] merge(int arr[],int lb,int mid,int ub){
int[] store=new int[arr.length];
int start=lb;
int end=mid+1;
int put=lb;
while(start<=mid&&end<=ub){
if(arr[start]<=arr[end]){
store[put]=arr[start];
start++;
}else{
store[put]=arr[end];
end++;
}
put++;
}
if(start>mid){
while(end<=ub){
store[put++]=arr[end++];
}

}else{
while(start<=ub){
store[put++]=arr[start++];
}
}
for( put=lb;put<=ub;put++){
arr[put]=store[put];
}
return arr;

}



// this algo is work on divide and conquer
 //O(NlogN)
 //O(N)
