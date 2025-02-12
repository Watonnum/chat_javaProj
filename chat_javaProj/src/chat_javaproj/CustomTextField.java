package chat_javaproj;

import javax.swing.*;
import java.awt.*;


public class CustomTextField extends JTextField {
    private int cornerRadius = 15; // กำหนดความโค้งของขอบ
    private int padding = 10; // กำหนด Padding ด้านใน

    public CustomTextField(int columns) {
        super(columns);
        setOpaque(false); // ทำให้พื้นหลังโปร่งใสเพื่อให้เห็นการวาดเอง
        
    }
   
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // วาดพื้นหลังขอบมน
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // วาดขอบมน
        g2.setColor(Color.GRAY); // สีขอบ
        
        validateFN(g2);
        
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);

        g2.dispose();
    }
    
    @Override
    public Insets getInsets() {
        return new Insets(0, padding, 0, padding); // กำหนดระยะห่างภายใน
    }
    

    private void validateFN(Graphics2D g2) {
        int lengthInput = getText().length();
        
        if(lengthInput == 0) {
            g2.setColor(Color.WHITE);
        }
        else if(lengthInput != 7 && lengthInput != 0){
            g2.setColor(Color.RED);
        } else {
            g2.setColor(Color.WHITE);
        }
    }
}