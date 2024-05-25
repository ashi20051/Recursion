package ArrayQues;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,71,124,142};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int index) {
        //base condition
        if(index == arr.length-1) return true;

        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
}
