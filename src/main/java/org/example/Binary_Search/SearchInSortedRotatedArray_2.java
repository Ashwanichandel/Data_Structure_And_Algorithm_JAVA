package org.example.Binary_Search;

public class SearchInSortedRotatedArray_2 {
    public static void main(String[] args) {

    }
    public static int searchInSortedRotatedArray(int arr[], int n, int target) {
        int low =0;
        int high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(target==arr[mid]&&arr[mid]==arr[high]) {
                low++;
                high--;
                continue;
            }

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

