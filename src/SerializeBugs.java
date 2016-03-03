import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by hammidfunsho on 2/8/16.
 * create a serializable file containing bug records and the nmber of legs
 */
public class SerializeBugs {


    private static ObjectOutputStream output;
    private static BugII bugs;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        //open the new file using the formatoutputstream class

        try {

            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("bugs.ser")));
        } catch (SecurityException securityException) {
            System.err.print("Error opening file. Terminating");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.print("File not found. Terminating");
        } catch (IOException ioException) {
            System.err.print("Error opening file. Terminating");
        }
    }

    public static void addRecords() {

        //write a loop to read the input and create a new object of the bug class
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the bug name and number of legs");

        while (true) {
            try {
                bugs = new BugII(input.next(), input.nextInt());
                output.writeObject(bugs);

            } catch (IOException ioException) {
                System.err.print("Error writing to the file. Terminating");
            }
        }

    }

    public static void closeFile() {

        try {
            if (output != null)
                output.close();
        } catch (IOException ioException) {
            System.err.print("Error closing the file. Terminating");
        }
    }
}
