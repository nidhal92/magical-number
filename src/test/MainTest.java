package test;


import junit.framework.TestCase;
import main.Main;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainTest extends TestCase {
  private   OutputStream mOutputStream = new ByteArrayOutputStream();
 private    PrintStream mPrintStream = new PrintStream(mOutputStream);


    public void testDisplayMultipleOfThreeChar() {

        System.setOut(mPrintStream);

       Main.display(3);
        assertEquals("H"+ System.lineSeparator(), mOutputStream.toString());

    }
    public void testDisplayMultipleOfFiveChar() {
        System.setOut(mPrintStream);

        Main.display(5);
        assertEquals("S"+ System.lineSeparator(), mOutputStream.toString());

    }

}
