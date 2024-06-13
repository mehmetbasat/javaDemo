public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{
                1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18
        };

        int numberFind = 8;
        boolean isFound = false;

        for (int number : numbers) {
            if (number == numberFind) {
                isFound = true;
                break;
            }
        }

        String message ="";
        if (isFound) {
            message = ("number is exist:" + numberFind);
            getMessage(message);
        } else {
            getMessage("number is not exist:" + numberFind);
        }
    }

    public static void getMessage(String message) {
        System.out.println(message);
    }
}