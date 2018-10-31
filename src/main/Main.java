package main;

public class Main  {

    public static void main(String[] args) {

         InputNumber tInput =new InputNumber();


                displayMagicalNumber(tInput.readMinValue(),tInput.readMaxValue());



    }

    private static void displayMagicalNumber(int pIMin, int pIMax) {
        int tICount=pIMin ;

        while (tICount<=pIMax){
            display(tICount);
            tICount++;
        }
    }

    private static void display(int pICount) {
        if (pICount == 0) {
            System.out.println(0);
            return;
        }if (pICount%5==0){
            System.out.println("S");
            return;
        }
        if (pICount%3==0) {
            System.out.println("H");
            return;
        }
        System.out.println(pICount);
    }
}
