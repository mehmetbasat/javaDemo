//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String[] ogrenciler = new String[5];
        ogrenciler[0] = "mehmet";
        ogrenciler[1] = "barış";
        ogrenciler[2] = "ferdi";
        ogrenciler[3] = "salih";
        ogrenciler[4] = "oğuz";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}