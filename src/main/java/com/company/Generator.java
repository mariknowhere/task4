package com.company;

import com.github.javafaker.Faker;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Random;

public class Generator {
    public static Faker createFaker(String userLanguage) {
        if (userLanguage.equals("en")) {
            return new Faker(Locale.ENGLISH);
        } else if (userLanguage.equals("uk")) {
            return new Faker(Locale.UK);
        } else {
            return new Faker(new Locale("ru_RU"));
        }
    }

    public static int createNumber(String userLanguage, Faker faker) {
        if (userLanguage.equals("en")) {
            return faker.number().numberBetween(100000000, 999999999);
        } else if (userLanguage.equals("ru")) {
            return faker.number().numberBetween(100000, 999999);
        } else {
            return faker.number().numberBetween(100000, 999999);
        }
    }

    public static String generateUsers(
            int usersAmount,
            String userLanguage,
            Data data
    ) throws IOException {
        Faker faker = Generator.createFaker(userLanguage);
        StringWriter writer = new StringWriter();
        ICsvBeanWriter csvBeanWriter = new CsvBeanWriter(writer, CsvPreference.EXCEL_NORTH_EUROPE_PREFERENCE);
        String[] header = new String[]{"firstName", "surName", "lastName", "address", "phone"};
        csvBeanWriter.writeHeader(header);
        Random rnd = new Random();

        for (int i = 0; i < usersAmount; i++) {
            String fName = data.firstNames[rnd.nextInt(data.firstNames.length)];
            String sName = data.surnames[rnd.nextInt(data.surnames.length)];
            String lName = data.lastNames[rnd.nextInt(data.lastNames.length)];
            String fNumber = data.phones[rnd.nextInt(data.phones.length)];
            String streetAddress = faker.address().streetAddress();

            int numberUser = createNumber(userLanguage, faker);

            String phone = fNumber + numberUser;

            Person person = new Person(fName, sName, lName, streetAddress, phone);

            csvBeanWriter.write(person, header);

        }
        csvBeanWriter.close();

        return writer.toString();
    }
}
