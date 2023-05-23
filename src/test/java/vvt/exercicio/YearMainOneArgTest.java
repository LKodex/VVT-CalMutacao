package vvt.exercicio;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class YearMainOneArgTest extends TestCase {
    public void testInvalidYear0() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "0" };
        Cal.main(args);
        String expected = "Cal: 0: ano invalido.\n";
        assertEquals(expected, err.toString());
    }

    public void testValidYear1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "1" };
        Cal.main(args);
        String expected = "   Janeiro 1\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n\n   Fevereiro 1\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 \n\n   Março 1\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 \n\n   Abril 1\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n\n\n   Maio 1\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 \n\n   Junho 1\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 \n\n   Julho 1\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n\n   Agosto 1\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 \n\n   Setembro 1\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 \n\n   Outubro 1\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n\n   Novembro 1\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 \n\n   Dezembro 1\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n\n\n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "2" };
        Cal.main(args);
        String expected = "   Janeiro 2\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 \n\n   Fevereiro 2\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 \n\n   Março 2\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 \n\n   Abril 2\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 \n\n   Maio 2\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 \n\n   Junho 2\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 \n\n   Julho 2\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n\n   Agosto 2\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 \n\n   Setembro 2\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n\n\n   Outubro 2\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 \n\n   Novembro 2\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 \n\n   Dezembro 2\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n\n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear9998() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "9998" };
        Cal.main(args);
        String expected = "   Janeiro 9998\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n\n\n   Fevereiro 9998\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n\n\n   Março 9998\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 \n\n   Abril 9998\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 \n\n   Maio 9998\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n\n   Junho 9998\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 \n\n   Julho 9998\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 \n\n   Agosto 9998\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n\n   Setembro 9998\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 \n\n   Outubro 9998\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n\n\n   Novembro 9998\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 \n\n   Dezembro 9998\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 \n\n";
        assertEquals(expected, out.toString());
    }

    public void testValidYear9999() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = { "9999" };
        Cal.main(args);
        String expected = "   Janeiro 9999\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n\n   Fevereiro 9999\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 \n\n   Março 9999\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 \n\n   Abril 9999\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 \n\n   Maio 9999\nDo Se Te Qa Qi Se Sa\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 \n\n   Junho 9999\nDo Se Te Qa Qi Se Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 \n\n   Julho 9999\nDo Se Te Qa Qi Se Sa\n             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n\n\n   Agosto 9999\nDo Se Te Qa Qi Se Sa\n 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 \n\n   Setembro 9999\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 \n\n   Outubro 9999\nDo Se Te Qa Qi Se Sa\n                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 \n\n   Novembro 9999\nDo Se Te Qa Qi Se Sa\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 \n\n   Dezembro 9999\nDo Se Te Qa Qi Se Sa\n          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 \n\n";
        assertEquals(expected, out.toString());
    }

    public void testInvalidYear10000() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        System.setErr(new PrintStream(err));

        String[] args = { "10000" };
        Cal.main(args);
        String expected = "Cal: 10000: ano invalido.\n";
        assertEquals(expected, err.toString());
    }
}
