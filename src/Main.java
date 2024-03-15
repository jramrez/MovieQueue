/* Program Name: MovieQueue
 * Program Purpose: simulate 4 ticket lines. person is added to the shortest and first person in queue is removed. arrivals and time at booth is random. 
 * Created / Revised: jramrez   
*/
package src;

import java.util.Random;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Random rand = new Random();
        Library.clearCon();
        TicketLine line1 = new TicketLine();
        TicketLine line2 = new TicketLine();
        TicketLine line3 = new TicketLine();
        TicketLine line4 = new TicketLine();
        do {
        
            if (rand.nextInt(0,3) != 0) {
                TicketLine smallest = line1;
                if (line2.showLength() < smallest.showLength()) {
                    smallest = line2;
                }
                if (line3.showLength() < smallest.showLength()) {
                    smallest = line3;
                }
                if (line4.showLength() < smallest.showLength()) {
                    smallest = line4;
                }
                smallest.addtoLine(new Person());
            }
            System.out.println("-------------------------");
            line1.printLine();
            line2.printLine();
            line3.printLine();
            line4.printLine();

            Library.sleep(rand.nextInt(1000,2000));
            Library.clearCon();

            switch(rand.nextInt(0,8)) {
                case 1:
                    line1.exitLine();
                    break;
                case 2:
                    line2.exitLine();
                    break;
                case 3:
                    line3.exitLine();
                    break;
                case 4:
                    line4.exitLine();
                    break;
                default:
                    break;
            }
        }
        while(true);    
    }
}