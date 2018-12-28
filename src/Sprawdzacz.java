import javax.swing.*;

public class Sprawdzacz extends Thread {
    private JTextArea okno;
    volatile boolean zakonczyc;

    Sprawdzacz(JTextArea comp) {
        okno = comp;
        zakonczyc = false;
    }

    public void run() {
        while (!zakonczyc) {
            try {
                String tekst = okno.getText();
                int indeks = tekst.indexOf("cholera");
                if (indeks >= 0) {
                    JOptionPane.showMessageDialog(okno, "NIECENZURALNE SŁOWO");
                }
                sleep(10000);
            } catch (Exception ignored) {
            }
        }
    }
}