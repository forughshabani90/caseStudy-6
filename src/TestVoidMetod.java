public class TestVoidMetod {
    public static void main(String[] args) {
        System.out.println("this grade is : ");
        PrintGrade(89);
        Gcd k = new Gcd();
       int resul=k.gcd(6,9);
        System.out.println(resul);
    }

    public static void PrintGrade(double score) {
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        {

        }
        {

        }
    }
}

