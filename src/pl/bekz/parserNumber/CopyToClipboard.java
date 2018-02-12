package pl.bekz.parserNumber;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CopyToClipboard {

    public void copy(String inputNumbers) {
        StringSelection stringSelection = new StringSelection( inputNumbers );
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents( stringSelection, null );
    }
}
