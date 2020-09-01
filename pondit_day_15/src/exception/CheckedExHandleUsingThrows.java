package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author Muhammad Saimon
 * @since Aug 8/31/20 9:27 AM
 */

public class CheckedExHandleUsingThrows {
    public static void main(String[] args) {
        CheckedExHandleUsingThrows checkExp = new CheckedExHandleUsingThrows();

        /*
        * Akhon readFile() method theke throws korar por ai method a ashlo.
        * akhon she abar try/catch er maddome caught korche kina check kore. jodi na kore tahole throws korche kina check kore.
        * amra ekhane try/catch diye exception ta ke handle korechi
        * */
        try {
            checkExp.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception:: " + e.toString());
            e.printStackTrace();
        }

        System.out.println("Out of try catch");
    }

    /*
     * Checked exception er khetre Either exception handle korte hobe try/catch diye or Exception throws korte hobe.
     * First a she try/catch er maddome caught korche kina check kore. jodi caught kore then solved. jodi na kore tahole throws korche kina check kore.
     * throws korle then next method a jai jekhan theke ai method k call kora hoyeche. jemon ekhane readFile() method k main()
     * method theke call kora hoyeche. tai ekhane main() method a throw hobe.
     * then main() method a giye she abar try/catch er maddome caught korche kina check kore. jodi na kore tahole throws korche kina check kore.
     * */
    public void readFile() throws FileNotFoundException {
        File file = new File("src/inpu/abc.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println("File found");
    }
}
