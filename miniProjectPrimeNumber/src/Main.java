public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
       // int remainder = number % 2;

        if (number==1) {
            System.out.println("Number is not prime");
            return;
        }

        if (number < 2) {
            System.out.println("Invalid number");
        }

        for (int i = 2; i <number ; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}