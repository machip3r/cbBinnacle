package controller;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

public class blocked {

    private JFrame jframe = null;

    public blocked(JFrame f) {
        this.jframe = f;
    }

    public void block(int confirm) {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(
                new Runnable() {
            @Override
            public void run() {
                front(confirm);
            }
        }, 500, 50, TimeUnit.MILLISECONDS);
    }

    public void front(int confirm) {
        if (confirm == 1) {
            jframe.setExtendedState(MAXIMIZED_BOTH);
            jframe.toFront();
        } else if (confirm == 2) {
            jframe.toFront();
        }
    }
}
