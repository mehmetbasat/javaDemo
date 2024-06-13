public class Main {
    public static void main(String[] args) {
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();
        manGameCalculator.gameOver();

        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.hesapla();

       GameCalculator gameCalculator = new WomanGameCalculator();
    }
}