package TD.HTW.App;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console implements IConsole {

    Scanner in = new Scanner(System.in);


    @Override
    public int readInteger(String text) {

        while (true) {
            System.out.print(text);
            try {
                int num = in.nextInt();
                return num;
            } catch (InputMismatchException e) {
                System.err.println("Wrong input! Input only integer number allowed!");
                in.nextLine();
            }
        }
    }

    @Override
    public String readString(String text) {
        System.out.print(text);
        String txt =  in.next();
        return txt;
    }

    @Override
    public void write(String s) {
        System.out.println(s);
    }

}
