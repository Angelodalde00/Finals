package Finals11;

import java.util.Scanner;

public class Program extends School {

    Program(String name) {
        super(name);
    }

    void ProgramName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.  BSTEP program");

        System.out.println("2. BSBA program");

        System.out.println("3. BSIT program");
        String it = scanner.nextLine();
        
        System.out.println("Bachelor of Science Teacher Educ");
        System.out.println("Bachelor of Science Information Tech");
        System.out.println("Bachelor of Science Business Ad");
    }

}
