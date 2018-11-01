package test;

import junit.framework.TestCase;
import main.InputNumber;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputNumberTest extends TestCase {
    private InputNumber mInputNumber=new InputNumber();
    public void testNotNullInputMinNumber(){
        String tSInput = "7";
        InputStream tInputStreamIn = new ByteArrayInputStream(tSInput.getBytes());
        System.setIn(tInputStreamIn);
       int tIMin =mInputNumber.readMinValue();

       assertNotNull(tIMin);

    }
    public void testNotNullMaxNumber(){
        String tSInput = "7";
        InputStream tInputStreamIn = new ByteArrayInputStream(tSInput.getBytes());
        System.setIn(tInputStreamIn);

       int tIMax =mInputNumber.readMaxValue();
       assertNotNull(tIMax);

    }
    public void testValidInputMinNumber(){
        String tSInput = "4";
        InputStream tInputStreamIn = new ByteArrayInputStream(tSInput.getBytes());
        System.setIn(tInputStreamIn);
       int tIMin =mInputNumber.readMinValue();

       assertNotNull(tIMin);

    }

    public void testValidInputMaxNumber(){
        String input = "7";
        InputStream tInputStreamIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(tInputStreamIn);

       int tIMax =mInputNumber.readMaxValue();
       assertNotNull(tIMax);

    }

    public void testMaxIsGreaterThanMin()
    {
        String tSMinInput = "7";
        InputStream tMinIn = new ByteArrayInputStream(tSMinInput.getBytes());
        System.setIn(tMinIn);
        int tIMin =mInputNumber.readMaxValue();
        String tSMaxInput = "9";
        InputStream tMaxIn = new ByteArrayInputStream(tSMaxInput.getBytes());
        System.setIn(tMaxIn);
        int tIMax =mInputNumber.readMaxValue();
        assertTrue(tIMin < tIMax );
    }
}
