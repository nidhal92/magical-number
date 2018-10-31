package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {
    private int mIMinValue;
    private int mIMaxValue;



    public int readMinValue() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Min Int ");
            this.mIMinValue = in.nextInt();
            return mIMinValue;
        }
        catch (InputMismatchException mException){
            return readMinValue();
        }
    }


    public int readMaxValue() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Max Int ");
            this.mIMaxValue = in.nextInt();
            if (!isBigger())
                return readMaxValue();
            return mIMaxValue;
        }
        catch (InputMismatchException mException){
            return readMaxValue();
        }
    }

    private boolean isBigger() {
        return mIMaxValue >= mIMinValue;
    }


}
