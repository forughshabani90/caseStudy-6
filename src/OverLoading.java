public class OverLoading {
    public static void main(String[] args) {
        System.out.println("the maximum of 3 and 4 is" + max(3, 4));
        System.out.println("the maximum of 3.0 and 4.5 is " + max(3.0, 4.5));
        System.out.println("the maximum of 3.0 and 4.5 and 6.3 is " + max (3.0 , 4.5, 6.3));

    }

    public static int max(int n1, int n2) {
        if (n1 > n2) ;
        int max = n1;
        else max = n2;
        return max;
    }

    public static double max(double n1, double n2) {
        if (n1 > n2) ;
        double max = n1;
        else max = n2;
        return max;
    }

    public static doublemax(double n1, double n2, double n3) {
        return max(max(n1, n2), n3);
    }
}
