package Finals11;

import java.util.Scanner;

public class Program extends School {

    Program(String name) {
        super(name);
    }

    void ProgramName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. BSTEP program");
        System.out.println("2. BSBA program");
        System.out.println("3. BSIT program");
        System.out.println(name + "Please the course that you want");
        String selectedProgram = scanner.nextLine(); 

        

        if (selectedProgram.equals("1")) {
            System.out.println(name + ".Teacher Education Program");
        } else if (selectedProgram.equals("2")) {
            System.out.println(name + ".Bachelor in Science Business Administration");
        } else if (selectedProgram.equals("3")) {
            System.out.println(name + ".Bachelor in Science in Information Technology");
        } else {
            System.out.println("Invalid input. Please enter a value between 1 and 3!");
        }

        scanner.close(); 
    }

    public static void main(String[] args) {
        Program program = new Program("Sample School");
        program.ProgramName();
    }
}
