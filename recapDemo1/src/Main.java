//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi1 = 25;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (sayi1<sayi2) {
            enBuyuk = sayi2;
        } else if (sayi1 < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println(enBuyuk);


    }
}