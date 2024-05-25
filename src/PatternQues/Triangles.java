package PatternQues;

public class Triangles {
    public static void main(String[] args) {
        System.out.println("Inverted Triangle: ");
        triangle1(4,0);
        System.out.println();
        System.out.println("Normal Triangle: ");
        triangle2(4,0);
    }

    private static void triangle1(int r, int c) {

        //base condition
        if(r==0) return;
        if(c<r) {
            System.out.print("*");
            triangle1(r,c+1);
        } else {
            System.out.println();
            triangle1(r-1,0);
        }
    }

    private static void triangle2(int r, int c) {

        //base condition
        if(r==0) return;
        if(c<r) {
            triangle2(r,c+1);
            System.out.print("*");
        } else {
            triangle2(r-1,0);
            System.out.println();
        }
    }
}
