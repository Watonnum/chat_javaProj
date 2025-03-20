package chat_javaproj.Components;

import javax.swing.*;
import java.awt.*;

public class CustomPasswordField extends JPasswordField {
    private int cornerRadius = 15;
    private int padding = 10;

    public CustomPasswordField(int columns) {
        super(columns);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.GRAY);
//        validateFN(g2);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
        g2.dispose();
    }

    @Override
    public Insets getInsets() {
        return new Insets(padding, padding, padding, padding);
    }
    
    private void validateFN(Graphics2D g2) {
        int lengthInput = getText().length();
        
        if(lengthInput == 0) {
            g2.setColor(Color.WHITE);
        }
        else if(lengthInput != 13 && lengthInput != 0){
            g2.setColor(Color.RED);
        } else {
            g2.setColor(Color.WHITE);
        }
    }
}