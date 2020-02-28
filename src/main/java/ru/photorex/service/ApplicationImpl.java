package ru.photorex.service;

import ru.photorex.model.Phone;

import java.util.List;

public class ApplicationImpl implements Application {
    @Override
    public void startProgram() {
        boolean exit = false;
        IOService ioService = new ConsoleService();
        PhoneBookService phoneBookService = new PhoneBookServiceImpl();
        SearchService searchService = new SearchServiceImpl(phoneBookService);

        while (!exit) {
            ioService.printString("Введите Фамилию");
            String lastName = ioService.readString();
            ioService.printString("Введите Имя");
            String firstName = ioService.readString();

            List<Phone> phones = searchService.searchPerLastNameAndFirstName(lastName, firstName);
            if (phones.isEmpty())
                ioService.printString("Нет такой записи");
            else phones.forEach(p -> ioService.printString(p.getPhone()));
            ioService.printString("Продолжить? Y : N");
            String ans = ioService.readString();
            if (!ans.equals("Y"))
                exit = true;
        }

    }
}
