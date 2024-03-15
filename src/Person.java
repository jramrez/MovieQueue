package src;

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;


public class Person {
    private String name;
    private Random rand = new Random();
    
    public Person() throws FileNotFoundException {
        int nameNum = rand.nextInt(0,200);
        File namesFile = new File("src/names.txt");
        Scanner scan  = new Scanner(namesFile);
        for(int count = 0; count < nameNum; count++) {
            scan.nextLine();
        }
        name = scan.nextLine();
        System.out.println(name + " walked in");
        scan.close();
    }

    public String getName() {
        return name;
    }
}
