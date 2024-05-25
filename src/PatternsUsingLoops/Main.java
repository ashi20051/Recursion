package PatternsUsingLoops;

public class Main {
    public static void main(String[] args) {
        System.out.println("PATTERN 1: ");
        pattern1(4);
        System.out.println();
        System.out.println("PATTERN 2: ");
        pattern2(4);
        System.out.println();
        System.out.println("PATTERN 3: ");
        pattern3(4);
        System.out.println();
        System.out.println("PATTERN 4: ");
        pattern4(4);
        System.out.println();
        System.out.println("PATTERN 5: ");
        pattern5(4);
        System.out.println();
        System.out.println("PATTERN 28: ");
        pattern28(4);
        System.out.println();
        System.out.println("PATTERN 30: ");
        pattern30(4);
        System.out.println();
        System.out.println("PATTERN 17: ");
        pattern17(5);
        System.out.println();
        System.out.println("PATTERN 31: ");
        pattern31(5);
    }

    /*
    Pattern 1:
                *****
                *****
                *****
                *****
                *****
     */
    private static void pattern1(int n) {
        for(int row=1; row<=n; row++) {
            for(int col =1; col<=n; col++) System.out.print("*");

            System.out.println();
        }
    }

    /*
    Pattern 2:
                *
                **
                ***
                ****
                *****
     */
    private static void pattern2(int n) {

        for(int row=1; row<=n; row++) {
            //for every row, run the col
            for(int col=1; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Pattern 3:
                *****
                ****
                ***
                **
                *
     */

    private static void pattern3(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n-row+1; col++) System.out.print("*");

            System.out.println();
        }
    }
    /*
    pattern 4:
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
     */
    private static void pattern4(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) System.out.print(col+" ");

            System.out.println();
        }
    }

    /*
    Pattern 5:
                *
                **
                ***
                ****
                *****
                ****
                ***
                **
                *
     */

    private static void pattern5(int n) {
        for(int row = 1; row <= 2*n - 1; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;

            for(int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    Pattern 28:
                 *
                * *
               * * *
              * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *
     */
    private static void pattern28(int n) {
        for(int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row>n ? 2*n-row : row;
            int noOfSpaces = n-totalColsInRow;

            for(int space=1; space <= noOfSpaces; space++ ) {
                System.out.print(" ");
            }
            for(int col=1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /*
    Pattern 30:
                    1
                  2 1 2
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5
     */

    private static void pattern30(int n) {
        for(int row=1; row<=n; row++) {
            for(int spaces=0; spaces<n-row; spaces++) {
                System.out.print("  ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
    /*
    Pattern 17:
                 1
                212
               32123
              4321234
               32123
                212
                 1
     */
    private static void pattern17(int n) {
        for(int row=1; row<=2*n; row++) {

            //c is starting of each col
            int c = row>n ? 2*n-row : row;

            for(int spaces=0; spaces<n-c; spaces++) {
                System.out.print("  ");
            }
            for(int col=c; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=c; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    /*
    Pattern 31:
                 4 4 4 4 4 4 4
                 4 3 3 3 3 3 4
                 4 3 2 2 2 3 4
                 4 3 2 1 2 3 4
                 4 3 2 2 2 3 4
                 4 3 3 3 3 3 4
                 4 4 4 4 4 4 4
     */
    private static void pattern31(int n) {
        int originalN = n;
        n = 2*n;
        for(int row=0; row<=n ; row++) {
            for(int col=0; col<= n; col++){
                int atEveryindex = originalN - Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryindex+" ");
            }
            System.out.println();
        }
    }

}
