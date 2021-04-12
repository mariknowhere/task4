package com.company;

public class Data {
    final String[] firstNames;
    final String[] surnames;
    final String[] lastNames;
    final String[] phones;

    public Data(String[] firstNames, String[] surnames, String[] lastNames, String[] phones) {
        this.firstNames = firstNames;
        this.surnames = surnames;
        this.lastNames = lastNames;
        this.phones = phones;
    }

    static public Data createDataFromLanguage(String userLanguage) {
        switch (userLanguage) {
            case "ru":
                return new Data(FIRST_NAME_RU, SUR_NAME_RU, LAST_NAME_RU, NUMBER_RU);
            case "en":
                return new Data(FIRST_NAME_EN, SUR_NAME_EN, LAST_NAME_EN, NUMBER_EN);
            case "uk":
                return new Data(FIRST_NAME_UK, SUR_NAME_UK, LAST_NAME_UK, NUMBER_UK);
            default:
                return new Data(FIRST_NAME_RU, SUR_NAME_RU, LAST_NAME_RU, NUMBER_RU);
        }
    }

    static String[] FIRST_NAME_RU = {
            "Марк", "Андрей", "Сергей", "Даниил", "Роман",
            "Павел", "Иван", "Владимир", "Ярослав", "Ян",
            "Илья", "Константин", "Николай", "Герман", "Олег",
    };
    static String[] SUR_NAME_RU = {
            "Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев",
            "Петров", "Соколов", "Михайлов", "Новиков", "Фёдоров",
            "Морозов", "Волков", "Алексеев", "Лебедев", "Семёнов",
    };
    static String[] LAST_NAME_RU = {
            "Игоревич", "Сергеевич", "Геннадьевич", "Никитич", "Ильич",
            "Ефимович", "Михайлович", "Павлович", "Петрович", "Романович",
            "Алексеевич", "Ярославович", "Юрьевич", "Филиппович", "Тарасович",
    };
    static String[] NUMBER_RU = {
            "+7388", "+7385", "+7416", "+7814", "+7851", "+7472", "+7483", "+7302", "+7492", "+7844",
            "+7817", "+7473", "+7426", "+7493", "+7395", "+7866", "+7401", "+7484", "+7415", "+7878",
            "+7384", "+7833", "+7494", "+7861", "+7391", "+7352", "+7471", "+7812", "+7474", "+7413",
    };
    static String[] FIRST_NAME_EN = {
            "Noah", "Liam", "Mason", "Jacob", "William",
            "Ethan", "Alexander", "Michael", "James", "Daniel",
            "Charles", "David", "Richard", "Joseph", "German",
    };
    static String[] SUR_NAME_EN = {
            "Smith", "Johnson", "Brown", "Taylor", "Moore",
            "Macintosh", "Harris", "White", "Clark", "Lewis",
            "Rodriguez", "Allen", "Young", "Lopez", "Baker",
    };
    static String[] LAST_NAME_EN = {
            "Jr.", "Sr.",
    };
    static String[] NUMBER_EN = {
            "+11", "+12", "+13", "+14", "+15", "+16", "+17", "+18", "+19", "+10"
    };
    static String[] FIRST_NAME_UK = {
            "Oliver", "Jack", "Harry", "Jacob", "Charley",
            "Thomas", "George", "Oscar", "James", "William",
            "John", "Connor", "Mark", "Kyle", "Harry",
    };
    static String[] SUR_NAME_UK = {
            "Jones", "Williams", "Wright", "Patel", "Hill",
            "Allen", "Phillips", "Davis", "Parker", "Cox",
            "Griffiths", "Kelly", "Bailey", "Shaw", "Murphy",
    };
    static String[] LAST_NAME_UK = {
            "Jr.", "Sr.",
    };
    static String[] NUMBER_UK = {
            "+443", "+447", "+449", "+4420", "+4423", "+4428", "+4429", "+643",
    };
}
