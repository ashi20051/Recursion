package ArrayQues;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        int target = 18;
        System.out.println(ls(arr,target,0));

        //for finding the index of the target element
        System.out.println(findIndex(arr,target,0));

        //(multiple occurrence of target) for finding the all positions of target
        findAllIndex(arr,target,0);
        System.out.println(list);

        //find all indices without external parameter
        System.out.println(findAllIndexWEP(arr,target,0,new ArrayList<>()));

        //find all indices without passing the list in parameters
        System.out.println(findAllIndexWEP2(arr,target,0));
    }

    private static ArrayList findAllIndexWEP2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>(); //this will contain ans for particular function call only
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls = findAllIndexWEP2(arr,target,index+1); //ans from below function call

        list.addAll(ansFromBelowCalls);

        return list;
    }

    private static ArrayList findAllIndexWEP(int[] arr, int target, int index,ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) list.add(index);
        return findAllIndexWEP(arr,target,index+1,list);
    }


    static ArrayList<Integer> list = new ArrayList<>();

    private static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return;
        }
        if(arr[index] == target) list.add(index);
        findAllIndex(arr,target,index+1);
    }



    private static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target) return index;
        else return findIndex(arr,target,index+1);

    }

    private static boolean ls(int[] arr, int target, int index) {
        //base condition
        if(index==arr.length) return false;

        return arr[index] == target || ls(arr,target,index+1);
    }
}
