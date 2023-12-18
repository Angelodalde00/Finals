package Finals11;

import java.util.Scanner;

public class Programs extends School {

    Programs(String name) {
        super(name);
    }

    void ProgramName() {
Scanner scanner = new Scanner(System.in);
        System.out.println("1.  BSTEP program"); 
        String tep = scanner.nextLine();
        
        System.out.println("2. BSBA program"); 
        String ba = scanner.nextLine();
        
        System.out.println("3. BSIT program"); 
        String it = scanner.nextLine();
    }

}
