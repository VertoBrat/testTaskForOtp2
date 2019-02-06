package ru.photorex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {

    @Test
    public void getIvanovTelTest() {
        List<String> ivanov = new ArrayList<String>();
        ivanov.add("+8 800 2000 500");
        ivanov.add("+8 800 200 600");

        List<String> actual = Util.getBook().get("Иванов И.И.");
        assertEquals(ivanov, actual);
    }
}
