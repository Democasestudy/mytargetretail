/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail;

import java.util.Currency;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        Locale in = new Locale(" ", "IN");
        // Use of getInstance() method to 'AUD' instance
        Currency c1 = Currency.getInstance("AUD"); //Australian Dollar
        Currency c2 = Currency.getInstance("JPY");  //Japan Yen
        Currency c3 = Currency.getInstance("USD");  //Japan Yen
       Currency c4 = Currency.getInstance(in);  //Japan Yen

        // Use of getCurrencyCode() method
        String cCode1 = c1.getCurrencyCode();
        String cCode2 = c2.getCurrencyCode();
        String cCode4 = c2.getCurrencyCode();
        System.out.println("Australian Dollar code : " + cCode1);
        System.out.println("Japan Yen code : " + cCode2);
       System.out.println("Indian code : " + cCode4);
        System.out.println("");

        // Use of getDefaultFractionDigits() method
        int D1 = c1.getDefaultFractionDigits();
        System.out.println("AUD Fraction digits : " + D1);

        int D2 = c2.getDefaultFractionDigits();
        System.out.println("JPY fraction digits : " + D2);
        System.out.println("");

        // Use of getDisplayName() method
        System.out.println("AUD Display : "+c1.getDisplayName());
        System.out.println("JPY Display : "+c2.getSymbol());
        System.out.println("IND Display : "+c4.getSymbol());
        System.out.println("");

        // Use of getSymbol() method
        System.out.println("JPY Symbol : "+c2.getSymbol());
        System.out.println("USD Symbol : "+c3.getSymbol());
        System.out.println("INd Symbol : "+c4.getSymbol());
    }
}



