//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char grade = 'D';

        switch (grade)   {
            case 'A':
                System.out.println("Mükemmel");
            break;
                case 'B':
                System.out.println("Güzel");
                break;
                case 'C':
                System.out.println("İdare Eder");
                break;
                case 'D':
                System.out.println("Eh");
                break;
            default:
                System.out.println("Kötü aga");


        }

    }
}