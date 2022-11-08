import javax.swing.*;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int userNumber = getNumber();
        String UserString = " " + getWord();
        System.out.println("For Count Up");
        forCountUp(userNumber);
        System.out.println("For Count Down");
        forCountDown(userNumber);
        System.out.println("while Count Up");
        whileCountUp(userNumber);
        System.out.println("While Count Down");
        whileCountDown(userNumber);
        System.out.println("Do While Count Up");
        doWhileCountUp(userNumber);
        System.out.println("Say The Word While");
        sayTheWordWhile(UserString);
        System.out.println("Say The Word Do While");
        sayTheWordDoWhile(UserString);
        System.out.println("wordStairs");
        wordStairs( UserString, userNumber);
    }

    public static int getNumber() {

        return IO.getInt("Please enter an integer:");

    }

    public static String getWord() {

        return IO.getString("Please enter a String:");

    }

    public static void forCountUp(int userNumber) {

        for (int x = 0; x <= userNumber; x++) {
            System.out.println(x);


        }


    }

    public static void forCountDown(int userNumber) {

        for (int x = userNumber; !(x <= 0); x-- ) {
            System.out.println(x);
        }


    }

    public static void whileCountUp(int userNumber) {

        int x = 1;

        while ( x <= userNumber) {

            System.out.println(x);

            x *= 2;


        }


    }

    public static void whileCountDown(int userNumber) {

        while(userNumber >= 0) {
            System.out.println(userNumber);
            userNumber--;

        }

    }

    public static void doWhileCountUp(int userNumber) {

        int x = 1;

        do {

            System.out.println(x);

            x *= 2;



        } while(x <= userNumber);

    }




    public static void sayTheWordWhile(String UserString) {


        boolean x = IO.getBoolean("boolean?");

        while (x == true ) {


            System.out.println(UserString);

            x = IO.getBoolean("Boolean?");

        }


    }



    public static void sayTheWordDoWhile(String UserString) {


        boolean x = IO.getBoolean("boolean?");

        do {

            System.out.println(UserString);
            x = IO.getBoolean("Boolean?");

        } while (x == true);

    }


    public static void wordStairs(String UserString, int userNumber) {



        for ( int x = UserString.length(); x >= 0; x-- ) {

            for (int p = x; p <= userNumber; p++) {
                System.out.println(p);


            }


            System.out.println(UserString);
            UserString = "\t\n" + UserString;



        }

    }


}