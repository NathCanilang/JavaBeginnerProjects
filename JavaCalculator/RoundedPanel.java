import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

class RoundedPanel extends JPanel {
    
	private static final long serialVersionUID = 1L;
	private int radius;

    public RoundedPanel(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(radius,radius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

 
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width-1,
                height-1, arcs.width, arcs.height); 
    }
}