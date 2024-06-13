//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        //while

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti");

        //do-while
        int j = 15;
        do {
            System.out.println(j);
            j+=2;

        } while (j<10);

        System.out.println("do-while döngüsü bitti");


    }
}