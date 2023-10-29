public class Incriment {
    public static void main(String[] args) {
        int n=0;
        System.out.println("the befor call incriment n is" + n);
        incriment(n);
        System.out.println("the after call incriment n is" + n);
    }

    public static int incriment(int m) {
        m++;
        return m;

    }
}
