package pl.bekz.parserNumber;

public class NumberInput {

    private static String inputNumber;


    public NumberInput(String inputNumber) {
        this.inputNumber = inputNumber;
    }


    public static String getInputNumber() {
        return inputNumber.replaceAll( "\\D", "" );
    }

    public void removeBeginZeros() {
        char zeroNumberSeeker;
        do {
            zeroNumberSeeker = getInputNumber().charAt( 0 );

            removeFrontZeros();
        }
        while (zeroNumberSeeker == '0');
    }

    private void removeFrontZeros() {
        if (isZeroInFront()) {
            inputNumber = getInputNumber().replaceFirst( "0", "" );
        } else {
            return;
        }
    }

    boolean isZeroInFront() {
        return getInputNumber().charAt( 0 ) == '0';
    }
}

