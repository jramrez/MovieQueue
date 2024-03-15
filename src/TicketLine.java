package src;

import java.util.LinkedList;

public class TicketLine {
    private LinkedList<Object> line;

    public TicketLine() {
        line = new LinkedList<Object>();
    }

    public void addtoLine(Object p){
        line.add(p);
    }

    public Object exitLine(){
        if(line.size() > 0)
        {    System.out.println(((Person)line.getFirst()).getName() + " has left");
            return ((Person)line.removeFirst()).getName();
        }
        else {
            return null;
        }
    }

    public int showLength(){
        return line.size();
    }

    public void printLine(){
        System.out.print("In line: ");
        for(int i = 0; i < line.size(); i++) {
           System.out.print(((Person)line.get(i)).getName());
            System.out.print(", ");
        }
        System.out.println(" ");
    }
}
