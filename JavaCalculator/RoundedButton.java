import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {

	private static final long serialVersionUID = 1L;

	public RoundedButton(String text) {
        super(text);
        setUI(new RoundedButtonUI());
    }

    static class RoundedButtonUI extends BasicButtonUI {

        @Override
		public void paint(Graphics g, JComponent c) {
            AbstractButton button = (AbstractButton) c;
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = button.getWidth();
            int height = button.getHeight();

            RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, 10, 10);

            if (button.getModel().isPressed()) {
                g2.setColor(new Color(220, 220, 220));
            } else {
                g2.setColor(button.getBackground());
            }

            g2.fill(roundedRectangle);
            g2.dispose();

            super.paint(g, c);
        }

        @Override
        public void installUI(JComponent c) {
            super.installUI(c);
            AbstractButton button = (AbstractButton) c;
            button.setOpaque(false);
            button.setBorderPainted(false);
        }
    }
}
