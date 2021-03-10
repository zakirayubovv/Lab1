package ru.mtuci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";

        while (!text.equals("Стоп")) {
            text = reader.readLine();

            if (isPalindrome(text)) {
                System.out.println("Строка является палиндромом: " + text);
            } else {
                System.out.println("Строка не является палиндромом: " + text);
            }
        }

    }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
