package pl.bekz.parserNumber.ParserNumberRunner;

import pl.bekz.parserNumber.*;

import java.util.Arrays;

import static pl.bekz.parserNumber.NumberInput.getInputNumber;

public class ParserNumberRunner {

    public static void main(String[] args) {
        String yourNumber = Arrays.deepToString( args );

        if (args.length > 0) {
            NumberInput numberInput = new NumberInput( yourNumber );
            CopyToClipboard toClipboard = new CopyToClipboard();

            numberInput.removeBeginZeros();
            IndexInput indexInput = new IndexInput( getInputNumber() );
            indexInput.indexSetting();
            indexInput.indexRepairing();

            toClipboard.copyToClip( indexInput.getInputNumber() );
        } else {
            System.out.println( "Put something" );
        }
    }
}
