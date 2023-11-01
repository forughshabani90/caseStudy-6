public class Gcd {

    public Gcd(){
    }

    public  int gcd(int n1, int n2) {
        int k = 2;
        int gcd = 1;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) ;
            gcd = k;
            k++;
        }
        return gcd;
    }

}

