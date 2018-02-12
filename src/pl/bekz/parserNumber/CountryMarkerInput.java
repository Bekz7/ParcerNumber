package pl.bekz.parserNumber;

import java.util.Scanner;

public class CountryMarkerInput {


    public String addCountryMarker(String countryMarker) {
        Scanner in = new Scanner( System.in );

        System.out.println("Podaj kod kraju: ");
        countryMarker = in.nextLine();

        return countryMarker;
    }
}
