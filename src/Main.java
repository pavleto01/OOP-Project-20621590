import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
import static java.lang.System.exit;
public class Main {
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while (option!="exit"){
            System.out.println("Type help for command list");
            System.out.println("Enter command: ");
            try {
                option = scanner.next();
                switch (option){
                    case "open": open(); break;
                    case "close": open(); break;
                    case "save": option3(); break;
                    case "saveas": option3(); break;
                    case "help": help(); break;
                    case "exit": exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter a valid command");
                scanner.next();
            }
        }
    }
    // Options
    private static void help() {
        System.out.println("open   -   opens file");
        System.out.println("close   -   closes file");
        System.out.println("save   -   saves the currently open file");
        System.out.println("saveas <file>   -   saves the currently open file in <file>");
        System.out.println("help   -   prints this information");
        System.out.println("exit   -   exits the program ");
    }
    private static void open() throws IOException {
        System.out.println("Enter address of file");
        Scanner scanner = new Scanner(System.in);
        String file = "";
        file = scanner.next();
        File files = new File(file);
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
    private static void option3() {
        System.out.println("Thanks for choosing option 3");
    }
}