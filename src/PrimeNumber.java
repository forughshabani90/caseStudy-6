public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("the prime number is: ");
        primeNambers(9);
    }

    public static boolean primeNambers(int num) {
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                return true;
            else return false;

            }
            i++;

        }
    }
}
