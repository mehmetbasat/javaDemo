public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1= 30;
        sayi2 = sayi1;
        System.out.println(sayi2);

        int[] sayilar = new int[] {4,5,6};
        int[] sayilar2 = new int[] {7,8,9};
        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);



    }
}

