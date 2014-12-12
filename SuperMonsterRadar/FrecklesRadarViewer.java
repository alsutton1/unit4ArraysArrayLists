import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 19 July 2014
 */
public class FrecklesRadarViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create the radar, set the monster location, and perform the initial scan
        Scanner in = new Scanner(System.in);
        final int ROWS = 100;
        final int COLS = 100;
        int xinit;
        int yinit;
        int xchange;
        int ychange;
        FrecklesRadar radar = new FrecklesRadar(ROWS, COLS);
        radar.setNoiseFraction(0);
        radar.scan();
        
        JFrame frame = new JFrame();
        
        frame.setTitle("Signals in Noise Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the radar component and add it to the frame
        FrecklesRadarComponent component = new FrecklesRadarComponent(radar);
        frame.add(component);
        
        // set the size of the frame to encompass the contained component
        frame.pack();
        
        System.out.print("What row is Freckles starting in? ");
        xinit = in.nextInt();
        System.out.print("What column is Freckles starting in? ");
        yinit = in.nextInt();
        System.out.print("What speed is Freckles moving horizontally?: ");
        xchange = in.nextInt();
        System.out.print("What speed is Freckles moving vertically?: ");
        ychange = in.nextInt();
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        radar.setFrecklesLocation(xinit, yinit);
        // perform 100 scans of the radar wiht a slight pause between each
        // after each scan, instruct the Java Run-Time to redraw the window
        for(int i = 0; i < 100; i++)
        {
            Thread.sleep(100); // sleep 100 milliseconds (1/10 second)
            
            radar.scan();
            radar.updateFrecklesLocation(xchange, ychange);
            
            frame.repaint();
        }
    }

}
