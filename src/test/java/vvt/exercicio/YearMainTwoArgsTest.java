package vvt.exercicio;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class YearMainTwoArgsTest extends TestCase {
    public void testInvalidYear0AndMonth1() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "1", "0" };
        Cal.main(args);
        String expected = "Cal: 0: ano invalido.\n";
        assertEquals(expected, err.toString());
    }

    public void testValidYear1AndMonth1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "1", "1" };
        Cal.main(args);
        String expected = "   Janeiro 1\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear2AndMonth1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "1", "2" };
        Cal.main(args);
        String expected = "   Janeiro 2\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 \n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear9998AndMonth1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "1", "9998" };
        Cal.main(args);
        String expected = "   Janeiro 9998\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n\n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear9999AndMonth1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "1", "9999" };
        Cal.main(args);
        String expected = "   Janeiro 9999\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n";
        assertEquals(expected, out.toString());
    }

    public void testInvalidYear10000AndMonth1() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "1", "10000" };
        Cal.main(args);
        String expected = "Cal: 10000: ano invalido.\n";
        assertEquals(expected, err.toString());
    }
}
