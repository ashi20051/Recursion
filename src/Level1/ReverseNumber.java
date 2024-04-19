package Level1;

public class ReverseNumber {
    static int sum =0;
    public static void main(String[] args) {
        rev1(1842);
        System.out.println(sum);
    }

    static void rev1(int n) {
        //base condition
        if(n==0) return;

        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }
}
