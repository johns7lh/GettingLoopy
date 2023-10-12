import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {



        boolean done = false;
        String trash = " ";
        Scanner in = new Scanner(System.in);

        while (!done){
            System.out.print("Enter Temperature in celsius: ");
            double fahrenheit = 0;
            double celsius = 0;
            if (in.hasNextDouble()) {
                celsius = (in.nextDouble());
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " In fahrenheit is: " + fahrenheit);
                done = true;


            } else {

                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Run the program again and do the input correctly");

            }
        }




    }
}
