
package chaprter_12.swing;
import javax.swing.JFrame;

import javax.swing.JProgressBar;


public class JProgressBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar Demo");
        JProgressBar progressBar = new JProgressBar(0,100);
        
        progressBar.setValue(80);
        progressBar.setStringPainted(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,70);
        frame.setVisible(true);
        frame.add(progressBar);
    }
}
