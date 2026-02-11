import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("C:\\Users\\524234\\OneDrive - San Diego Unified School District\\Documents\\GitHub\\Cereal_Data_Analysis\\cereal.csv");
        Scanner myScanner = new Scanner(myFile);

        myScanner.useDelimiter(",");

        myScanner.nextLine(); // Skip the header row
        for (int i = 0; i < 20; i++){
            System.out.println(myScanner.next());
        }

    }
}