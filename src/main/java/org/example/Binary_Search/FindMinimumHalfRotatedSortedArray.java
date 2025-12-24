package org.example.Binary_Search;

import static java.lang.Math.min;

public class FindMinimumHalfRotatedSortedArray {
    public static void main(String[] args) {

    }
    public static int halfSortedRotatedSortedArray(int[] arr, int n){
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=min(ans,arr[low]);
                low=mid+1;
            }else{
                high=mid-1;
                ans=min(ans,arr[mid]);
            }
        }
        return ans;
    }
}
