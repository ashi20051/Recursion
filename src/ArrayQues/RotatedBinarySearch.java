package ArrayQues;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int key = 7;

        System.out.println(rotatedBS(arr,key,0,arr.length-1));
    }

    private static int rotatedBS(int[] arr, int key, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start)/2;

        if(arr[mid] == key) return mid;

        if(arr[start] <= arr[mid]) {
            if (key >= arr[start] && key <= arr[mid]) return rotatedBS(arr,key,start,mid-1);
            else return rotatedBS(arr,key,mid+1,end);
        }

        //this means first half is not sorted, hence check for second half
        if (key >= arr[mid] && key <=arr[end]) return rotatedBS(arr,key,mid+1,end);

        return rotatedBS(arr,key,start,mid-1);
    }
}
