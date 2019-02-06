package ru.photorex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {

    public static Map<String, List<String>> getBook(){
        List<String> ivanov = new ArrayList<String>();
        ivanov.add("+8 800 2000 500");
        ivanov.add("+8 800 200 600");
        List <String> petrov = new ArrayList<String>();
        petrov.add("+8 800 2000 700");
        List <String> sidorov = new ArrayList<String>();
        sidorov.add("+8 800 2000 800");
        sidorov.add("+8 800 2000 900");
        sidorov.add("+8 800 2000 000");

        Map<String, List<String>> book = new HashMap<String, List<String>>();
        book.put("Иванов И.И.", ivanov);
        book.put("Петров П.П.", petrov);
        book.put("Сидоров С.С.", sidorov);

        return book;
    }
}
