package pl.bekz.parserNumber;

import org.junit.Assert;
import org.junit.Test;


public class NumberInputTest {
    private String inputNumber;

    private String getInputNumber() {
        return inputNumber;
    }

    @Test
    public void onlyNumberRemain() throws Exception {
        this.inputNumber = "*/-*-9*-*1234";
        this.inputNumber = getInputNumber().replaceAll( "\\D", "" );
        Assert.assertEquals( "91234", getInputNumber() );
    }

    @Test
    public void removeBeginZeros() throws Exception {
        this.inputNumber = "0004560789";
        char zeroNumberSeeker;

        do {
            if (this.inputNumber.charAt( 0 ) == '0') {
                this.inputNumber = getInputNumber().replaceFirst( "0", "" );
            } else {
                return;
            }
            zeroNumberSeeker = getInputNumber().charAt( 0 );
        }
        while (zeroNumberSeeker == '0');
        Assert.assertEquals( "4560789", getInputNumber() );
    }
}