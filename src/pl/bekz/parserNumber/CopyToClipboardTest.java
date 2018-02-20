package pl.bekz.parserNumber;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CopyToClipboardTest {
    @Test
    public void copyToClip_Null() throws Exception {
        String inputNumbers = null;
        StringSelection stringSelection = new StringSelection( inputNumbers );
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents( stringSelection, null );
        Assert.assertNull( inputNumbers );
    }
    @Test
    public void copyToClip_Something() throws Exception {
        String inputNumbers = "3";
        StringSelection stringSelection = new StringSelection( inputNumbers );
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents( stringSelection, null );
        Assert.assertNotNull( inputNumbers );
    }

}