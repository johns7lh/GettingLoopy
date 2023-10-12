public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 31; i++) {
            System.out.println(i);
        }

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);

        }
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);

        }

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = rows; i >= 1; i--) {


            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int columns = 5;

        for (int i = 1; i <= rows; i++){

            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}