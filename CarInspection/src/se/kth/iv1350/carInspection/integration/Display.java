package se.kth.iv1350.carInspection.integration;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Controls the queue number display outside the garage.
 * @contributor Leif L.
 */
class Display {
    private static String HEADER = "Now Serving:";
    private int queueNumber = -1;
    private JLabel queueNumberLabel = new JLabel("", SwingConstants.CENTER);

    /**
     * Connects to the queue number display and shows the number
     * <code>zero</code>.
     */
    Display() {
        nextNumber();
        contactDisplay();
    }

    /**
     * Increments the displayed number.
     */
    final void nextNumber() {
        queueNumberLabel.setText(Integer.toString(++queueNumber));
    }

    private void contactDisplay() {
        JFrame frame = new JFrame(HEADER);
        Font labelFont = new Font(Font.SERIF, Font.BOLD, 30);
        queueNumberLabel.setFont(labelFont);
        frame.getContentPane().setBackground(Color.BLACK);
        queueNumberLabel.setForeground(Color.WHITE);
        frame.getContentPane().add(queueNumberLabel);
        frame.setBounds(600, 0, 200, 80);
        frame.setVisible(true);
    }
}