public class PrimeRange {
    public static void main(String[] args) {

        int initial = 10, finale = 100;
        boolean check = false;

        System.out.println("Prime numbers between 10 to 100");

        for (int i = initial; i != finale; ++i) {
            for (int j = 2; j <= (i / 2); ++j)
                if (i % j == 0) {
                    check = true;
                    break;
                }
            if (check == false)
                System.out.println(i);
            check = false;
        }
    }
}