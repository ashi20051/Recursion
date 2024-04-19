package Level1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,10,21,66};
        int target = 4;

        System.out.println("target : "+target+" is in the position : "+ (BS(arr,target,0,arr.length-1) + 1));
    }

    static int BS(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end-start) / 2;

        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] > target) {
            return BS(arr,target,start,mid-1);
        }

        return BS(arr,target,mid+1,end);
    }
}
