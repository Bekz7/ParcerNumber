package pl.bekz.parserNumber;

import java.util.Scanner;

public class NumberInput {

    private static String inputNumber;


    public static String getInputNumber() {
        return inputNumber;
    }

    public void addNumber(String inputNumber) {
        Scanner in = new Scanner( System.in );

        System.out.println( "Podaj numer telefonu: " );
        inputNumber = in.nextLine();
        this.inputNumber = inputNumber.replace( " ", "" );
    }


}
