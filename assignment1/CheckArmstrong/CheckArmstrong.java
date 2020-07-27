public class CheckArmstrong {
    public static void main(String[] args) {

        int initial = 10, finale  = 100;
        int temp, rem, result = 0;

        System.out.println("Armstrong numbers between 10 and 100:");
        
        while (initial <= finale) {
            temp = initial;

            while (temp != 0) {
                rem = temp % 10;
                result = result + (rem * rem * rem);
                temp = temp / 10;
            }

            if (initial == result)
                System.out.println(initial);
            else
                System.out.println(initial + " is not an Armstrong number");
            
            initial++;
            result = 0;
        }
    }    
}