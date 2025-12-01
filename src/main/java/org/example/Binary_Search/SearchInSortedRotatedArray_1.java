package org.example.Binary_Search;

public class SearchInSortedRotatedArray_1 {
    public static void main(String[] args) {
        int[] arr = {27, 28, 29,12, 23, 24, 25, 26};
        int target = 23;
        System.out.println(searchInSortedRotatedArray(arr, 8,target));
    }

    public static int searchInSortedRotatedArray(int arr[], int n, int target) {
     int low =0;
     int high=n-1;
     while (low<=high){
         int mid=(low+high)/2;
         if(target==arr[mid])return mid;

         if(arr[low]<=arr[mid]){
             if(arr[low]<=target&& target<=arr[mid]){
                 high=mid-1;
             }else {
                 low=mid+1;
             }
         }else {
             if(arr[mid]<=target&&arr[high]>=target){
                 low=mid+1;
             }else {
                 high=mid+1;
             }
         }
     }
     return -1;
    }

}
