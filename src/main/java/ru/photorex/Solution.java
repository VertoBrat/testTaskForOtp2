package ru.photorex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {

        Map<String, List<String>> telBook = Util.getBook();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ФИО");
        String fio = reader.readLine();
        if (telBook.containsKey(fio)) {
            List<String> telephones = telBook.get(fio);
            for (String s : telephones) {
                System.out.println(s);
            }
        } else System.out.println("такого ФИО в БД нет");

    }
}
