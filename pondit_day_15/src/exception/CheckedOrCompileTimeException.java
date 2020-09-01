package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Muhammad Saimon
 * @since Aug 8/30/20 11:13 PM
 */

public class CheckedOrCompileTimeException {
    public static void main(String[] args) {
        CheckedOrCompileTimeException checkExp = new CheckedOrCompileTimeException();
        checkExp.readFile();
    }

    /*
    * Checked exception er khetre Either exception handle korte hobe try/catch diye or Exception throws korte hobe.
    * First a she try/catch er maddome caught korche kina check kore. jodi caught kore then solved. jodi na kore tahole throws korche kina check kore.
    * throws korle then next method a jai jekhan theke ai method k call kora hoyeche. jemon ekhane readFile() method k main()
    * method theke call kora hoyeche.
    * then main() method a giye she abar try/catch er maddome caught korche kina check kore. jodi na kore tahole throws korche kina check kore.
    * */
    public void readFile() {
        File file = new File("src/inpu/abc.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            System.out.println("File found");
        } catch (IOException e) {
            System.out.println("Exception:: " + e.toString());
            e.printStackTrace();
        } catch (NullPointerException ex) { // multiple catch can be write.
            ex.printStackTrace();
        }

        try {
            fileReader.read();
        } catch (IOException | NullPointerException e) {  // instead of writing multiple catch, you can write this way.
            if (e instanceof NullPointerException) {  // evabe exception ta ashole kisher seta ber kora jai.
                System.out.println("Null pointer Exception");
            } else {
                System.out.println("Another Exception");
            }
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Out of try catch");

    }
}
