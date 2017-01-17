package desain;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import usu.util.StringUtil;
import usu.widget.text.DefaultDocument;

public class PasswordBox extends usu.widget.glass.PasswordBox {

    public PasswordBox() {
        super();
        setSelectionColor(Color.BLUE.brighter());
        setCaretColor(Color.black);
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.BLACK);
        setHorizontalAlignment(LEFT);
        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                selectAll();
            }
        });
        setDocument(new DefaultDocument() {

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (StringUtil.containQuote(str)) {
                    return;
                }
                super.insertString(offs, str, a);
            }
        });
    }
}
