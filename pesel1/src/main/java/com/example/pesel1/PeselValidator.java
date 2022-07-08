package com.example.pesel1;

public class PeselValidator {

    private Boolean checkLength(String pesel) {
        return pesel.length() == 11;
    }

    private Boolean checkIsNumber(String pesel) {
        try {
            Double.parseDouble(pesel);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public boolean validTest(String pesel) {
        if (!checkIsNumber(pesel)){
            System.out.println("kupadupaNumer");
            return false;
        }
        if (!checkLength(pesel)){
            System.out.println("kupadupaLength");
            return false;
        }

        int[] intsPesel = pesel.chars()
                .map(x -> x - '0')
                .toArray();

        int controlSum =
                        intsPesel[0] * 1 +
                        intsPesel[1] * 3 +
                        intsPesel[2] * 7 +
                        intsPesel[3] * 9 +
                        intsPesel[4] * 1 +
                        intsPesel[5] * 3 +
                        intsPesel[6] * 7 +
                        intsPesel[7] * 9 +
                        intsPesel[8] * 1 +
                        intsPesel[9] * 3 +
                        intsPesel[10] * 1;
        System.out.println(controlSum);
        if (controlSum%10==0){
            return true;
        }
        return false;
    }


}
