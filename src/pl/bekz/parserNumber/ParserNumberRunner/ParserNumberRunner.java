package pl.bekz.parserNumber.ParserNumberRunner;

import pl.bekz.parserNumber.*;

public class ParserNumberRunner {
    static NumberInput numberInput = new NumberInput();
    static CopyToClipboard clipboard = new CopyToClipboard();
    static CountryMarkerInput countryMarkerInput = new CountryMarkerInput();

    private static String yourNumber;

    public static String getYourNumber() {
        return numberInput.getInputNumber();
    }


    public static void main(String[] args) {
        String countryCode = null;

        numberInput.addNumber( yourNumber );
        clipboard.copy( getYourNumber() );
        countryMarkerInput.addCountryMarker( countryCode );


    }
}
