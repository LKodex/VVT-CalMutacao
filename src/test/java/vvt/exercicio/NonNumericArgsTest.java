package vvt.exercicio;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class NonNumericArgsTest extends TestCase {
    public void testNonNumericYear() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "hello world" };
        Cal.main(args);
        String expected = "Cal: hello world: ano invalido.\n";
        assertEquals(expected, err.toString());
    }

    public void testYear1AndNonNumericMonth() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "hello world", "1" };
        Cal.main(args);
        String expected = "Cal: hello world: mes invalido.\n";
        assertEquals(expected, err.toString());
    }

    public void testNonNumericYearAndMonth1() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "1", "hello world" };
        Cal.main(args);
        String expected = "Cal: hello world: ano invalido.\n";
        assertEquals(expected, err.toString());
    }

    public void testNonNumericYearAndNonNumericMonth() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "hello", "world" };
        Cal.main(args);
        String expected = "Cal: hello: mes invalido.\n";
        assertEquals(expected, err.toString());
    }
}
