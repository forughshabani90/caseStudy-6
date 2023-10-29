public class MaxTest {
    public static void main(String[] args) {
        int i=6;
        int j=10;
        int m = Max(i , j);
        System.out.println(m);
    }

    public static int Max(int i , int j) {
        int result;
        if (i > j)
            result = i;
        else
            result = j;
        return result;
    }
}
