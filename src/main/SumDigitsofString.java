package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by peiqiutian on 10/11/2018.
 */
public class SumDigitsofString {
    static final String TYPE_FILE = "-f";
    static final String TYPE_HEX = "-x";

    public static long getSumDigits(String s, boolean typeofHex) {
        if(s == null || s.length() == 0) throw new IllegalArgumentException();
        long res = 0;
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if(typeofHex && Character.isLetter(c)) {
                char temp = Character.toLowerCase(c);
                if(temp - 'a' < 6) res += (temp - 'a') + 10;
            }
            if(Character.isDigit(c)) {
                res += c - '0';
            }
        }
        return res;
    }

    public static long readFile(String fileName, boolean typeofHex) {
        if(fileName == null || fileName.length() == 0) throw new IllegalArgumentException();
        long res = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(sc.hasNext()) {
                String line = sc.next();
                res += getSumDigits(line, typeofHex);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(sc != null) sc.close();
        }
        return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args == null || args.length == 0) throw new IllegalArgumentException();
        boolean isHex = false;
        long res = 0;
        if (args[0].equals(TYPE_FILE)) {
            // read file
            String fileName = null;
            if (args.length < 2) throw new IllegalArgumentException();
            else if (args.length == 2) {
                // just have specify file
                fileName = args[1];
            } else if (args.length == 3) {
                fileName = args[1];
                if (args[2].equals(TYPE_HEX)) isHex = true;
            }
            res = readFile(fileName, isHex);
        } else {
            // STDIN Default
            String input = null;
            if (args.length == 1) {
                input = args[0];
            } else if (args.length == 2) {
                input = args[0];
                if (args[1].equals(TYPE_HEX)) isHex = true;
            }
            res = getSumDigits(input, isHex);
        }
        System.out.println(res);
    }
}
