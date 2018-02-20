package pl.bekz.parserNumber;

import org.junit.Assert;
import org.junit.Test;

public class IndexInputTest {
    private String inputNumber;

    private String getInputNumber() {
        return inputNumber;
    }

    @Test
    public void indexSetting() throws Exception {
        final String DL_INDEX = "+49";
        this.inputNumber = "+9505654";

        if (!getInputNumber().startsWith( "+49" )) {
            this.inputNumber = DL_INDEX + getInputNumber();
            Assert.assertEquals( "+49+9505654", getInputNumber() );
        } else {
            return;
        }
    }

    @Test
    public void indexSetting_Null() throws Exception {
        final String DL_INDEX = "+49";
        this.inputNumber = null;

        if (getInputNumber() != null && !getInputNumber().startsWith( "+49" )) {
            this.inputNumber = DL_INDEX + getInputNumber();
            Assert.assertEquals( "+49", getInputNumber() );
        } else {
            Assert.assertNull( getInputNumber() );
        }
    }

    @Test
    public void indexRepairing() throws Exception {
        final String BAD_INDEX = "+4949";
        this.inputNumber = "+49+49505654";

        if (getInputNumber().startsWith( "+4949" )) {
            this.inputNumber.replace( BAD_INDEX, "+49" );
            Assert.assertEquals( "+49505654", getInputNumber() );
        } else {
            return;
        }
    }

    @Test
    public void indexRepairing_Null() throws Exception {
        final String BAD_INDEX = "+4949";
        this.inputNumber = null;

        if (getInputNumber() != null && !getInputNumber().startsWith( "+4949" )) {
            this.inputNumber.replace( BAD_INDEX, "+49" );
            Assert.assertEquals( "+49", getInputNumber() );
        } else {
            Assert.assertNull( getInputNumber() );
        }
    }

}