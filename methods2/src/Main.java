public class Main {
    public static void main(String[] args) {
        String message = "Today weather is good";
        String newMessage = getCity();
        System.out.println(newMessage);
        int number = addition(5,7);
        int number2 = addition2(5,7,4,548);
        System.out.println(number2);
    }

    public static void add() {
        System.out.println("Added.");
    }

    public static void delete() {
        System.out.println("Deleted.");

    }

    public static void update() {
        System.out.println("Updated.");

    }

    public static int addition (int number1, int number2) {
        return number1 + number2;
    }

    public static int addition2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String getCity() {
        return "Ankara";
    }
}