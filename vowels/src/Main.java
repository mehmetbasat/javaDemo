public class Main {
    public static void main(String[] args) {
        char letter = 'Y';

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'İ':
            case 'O':
            case 'Ö':
            case 'U':
            case 'Ü':
                System.out.println("Letter is vowels");
                break;
            default:
                System.out.println("Letter is not vowels");


        }
    }
}