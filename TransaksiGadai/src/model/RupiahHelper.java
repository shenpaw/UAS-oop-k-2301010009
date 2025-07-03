/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
import java.text.*;
import java.util.Locale;

public class RupiahHelper {

    private static final DecimalFormat formatter =
        (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

    public static String format(double nilai) {
        return formatter.format(nilai);
    }

    public static double parse(String input) {
        if (input == null || input.trim().isEmpty()) return 0;
        try {
            input = input.replace("Rp", "").replaceAll("\\.", "").replace(",", ".").trim();
            return Double.parseDouble(input);
        } catch (Exception e) {
            return 0;
        }
    }
    
}

