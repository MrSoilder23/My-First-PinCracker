import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {

    private static void robotE() throws AWTException {
        Robot robotE = new Robot();
        robotE.keyPress(KeyEvent.VK_E);
        robotE.keyRelease(KeyEvent.VK_E);
    }

    private static void robot(int x, int y) throws AWTException {
        Robot robot0 = new Robot();
        robot0.mouseMove(x, y);
        robot0.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot0.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        int[] x = new int[]{890, 890, 960, 1020, 890, 960, 1020, 890, 960, 1020};
        int[] y = new int[]{730, 520, 520, 520, 580, 580, 580, 650, 650, 650};

        int password = -1;

        for(int i = 0; i < 10000; i++) {
            Thread.sleep(250);

            password++;
            String passwordLines = String.format("%04d", password);

            char[] numbers = passwordLines.toCharArray();
            System.out.println(passwordLines);

            robotE();
            Thread.sleep(10);

            for (int a = 0; a < 9; a++) {
                Thread.sleep(15);
                switch(numbers[a]) {
                    case '0':
                        robot(x[0], y[0]);
                        break;
                    case '1':
                        robot(x[1], y[1]);
                        break;
                    case '2':
                        robot(x[2], y[2]);
                        break;
                    case '3':
                        robot(x[3], y[3]);
                        break;
                    case '4':
                        robot(x[4], y[4]);
                        break;
                    case '5':
                        robot(x[5], y[5]);
                        break;
                    case '6':
                        robot(x[6], y[6]);
                        break;
                    case '7':
                        robot(x[7], y[7]);
                        break;
                    case '8':
                        robot(x[8], y[8]);
                        break;
                    case '9':
                        robot(x[9], y[9]);
                        break;
                }
            }
        }

    }
}
