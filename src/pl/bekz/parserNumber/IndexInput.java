package pl.bekz.parserNumber;

import java.util.Objects;

public class IndexInput {
    private String inputNumber;
    private final String DL_INDEX = "+49";
    private final String BAD_INDEX = "+4949";

    public String getInputNumber() {
        return inputNumber;
    }

    public IndexInput(String inputNumber) {
        this.inputNumber = inputNumber;

    }

    public void indexSetting() {
        if (!isNullNumber() && !isIndexInFront()) {
            this.inputNumber = this.DL_INDEX + getInputNumber();
        } else {
            return;
        }
    }

    public void indexRepairing() {
        if (!isNullNumber() && isBadIndex()) {
            this.inputNumber = getInputNumber().replace( BAD_INDEX, DL_INDEX );
        }
    }

    private boolean isNullNumber() {
        return Objects.equals( this.inputNumber, null );
    }

    private boolean isIndexInFront() {
        return this.inputNumber.startsWith( DL_INDEX );
    }

    private boolean isBadIndex() {
        return this.inputNumber.startsWith( BAD_INDEX );
    }
}
