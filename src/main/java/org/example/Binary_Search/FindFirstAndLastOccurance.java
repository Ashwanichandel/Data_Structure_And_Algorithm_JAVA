package org.example.Binary_Search;

public class FindFirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,10,10,10};
        int x=10;
        int n=arr.length;
        int ans[] = findFirstOccurance(arr,x,n);

        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] findFirstOccurance(int[] arr, int x, int n){
        int lb = lowerBound(arr, n, x);
        if(lb == n || arr[lb] != x){
            return new int[]{-1, -1};
        }
        return new int[]{lb, upperBound(arr, n, x) - 1};
    }

    static int upperBound(int[] arr, int n, int x){
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int lowerBound(int[] arr, int n, int x){
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
