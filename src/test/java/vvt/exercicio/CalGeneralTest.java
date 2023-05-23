package vvt.exercicio;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import junit.framework.TestCase;

public class CalGeneralTest extends TestCase {
    // Kills a specific mutant
    public void testValidYear1900AndMonth10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "10", "1900" };
        Cal.main(args);
        String expected = "   Outubro 1900\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 \n";
        assertEquals(expected, out.toString());
    }

    // The test can't be hard coded because the output
    // is calculated at runtime so the expected
    // result must be processed at runtime too
    public void testValidMainMehtodWithoutArguments() throws UnsupportedEncodingException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, false, "UTF-8"));
        String[] argsExpected = { };
        Cal.main(argsExpected);
        String expected = out.toString("UTF-8");

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, false, "UTF-8"));

        Calendar calendar = Calendar.getInstance();
        String MONTH = String.format("%d", calendar.get(Calendar.MONTH) + 1);
        String YEAR = String.format("%d", calendar.get(Calendar.YEAR));
        String[] args = { MONTH, YEAR };
        Cal.main(args);
        assertEquals(expected, out.toString("UTF-8"));
    }


}
