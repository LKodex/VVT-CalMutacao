package vvt.exercicio;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class MonthMainTwoArgsTest extends TestCase {
    public void testInvalidYear2000AndMonth0() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "0", "2000" };
        Cal.main(args);
        String expected = "Cal: 0: mes invalido.\n";
        assertEquals(expected, err.toString());
    }

    public void testValidYear2000AndMonth1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "1", "2000" };
        Cal.main(args);
        String expected = "   Janeiro 2000\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n";
        assertEquals(expected, out.toString());
    }
    
    public void testValidYear2000AndMonth2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "2", "2000" };
        Cal.main(args);
        String expected = "   Fevereiro 2000\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 \n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear2000AndMonth11() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "11", "2000" };
        Cal.main(args);
        String expected = "   Novembro 2000\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 \n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear2000AndMonth12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "12", "2000" };
        Cal.main(args);
        String expected = "   Dezembro 2000\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n";
        assertEquals(expected, out.toString());
    }

    public void testInvalidYear2000AndMonth13() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "13", "2000" };
        Cal.main(args);
        String expected = "Cal: 13: mes invalido.\n";
        assertEquals(expected, err.toString());
    }
}
