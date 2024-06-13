public class FourTransactions {
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    public int addition(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public int addition (int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total;
    }


}
