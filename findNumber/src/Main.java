public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{
                1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18
        };

        int numberFind = 58;
        boolean isFound = false;

        for (int number : numbers) {
            if (number == numberFind) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("number is exist");
        } else {
            System.out.println("number is not exist");
        }


    }
}
