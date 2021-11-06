package com.company.object;

import java.time.LocalDate;
import java.util.Random;

public class Humans {


    private static final Random random = new Random();
    private static final int begin_contacts = 88888888;

    private static String generateRandomFirstName() {
        return FIRST_NAME[random.nextInt(FIRST_NAME.length)];
    }

    private static String generateRandomLastName() {
        return LAST_NAME[random.nextInt(LAST_NAME.length)];
    }


    private static String generateRandomContacts() {
        return String.valueOf(11111111 + random.nextInt(begin_contacts));
    }

    public static String generate() {
        return String.format(TEMPLATES, generateRandomFirstName(), generateRandomLastName(), generateRandomContacts());
    }

    private static final String TEMPLATES = "INSERT INTO humans(name, surname, phone_number) VALUES('%s', '%s', '%s');";

    private static final String[] FIRST_NAME =
            {
                    "Алексей",
                    "София",
                    "Виктория",
                    "Арина",
                    "Максим",
                    "Матвей",
                    "Александра",
                    "Алина",
                    "Тимур",
                    "Михаил",
                    "Ева",
                    "Евгения",
                    "Дмитрий",
                    "Амелия",
                    "Анастасия",
                    "Иван",
                    "Денис",
                    "Эмилия",
                    "Софья",
                    "Амина",
                    "Захар",
                    "Варвара",
                    "Дарья",
                    "Алёна",
                    "Степан",
                    "Мирон",
                    "Яков",
                    "Артём",
                    "Полина",
                    "Алиса",
                    "Платон",
                    "Макар",
                    "Мира",
                    "Тимофей",
                    "Маргарита",
                    "Лука",
                    "Ксения",
                    "Павел",
                    "Милана",
                    "Владимир",
                    "Сафия",
                    "Всеволод",
                    "Юрий",
                    "Надежда",
                    "Кирилл",
                    "Тихон",
                    "Елизавета",
                    "Даниил",
                    "Егор",
                    "Илья",
                    "Мария",
                    "Вера",
                    "Дамир",
                    "Людмила",
                    "Даниль",
                    "Эмма",
                    "Оливия",
                    "Николай",
                    "Никита",
                    "Руслан",
                    "Семён",
                    "Есения",
                    "Данила",
                    "Татьяна",
                    "Богдан",
                    "Олег",
                    "Аврора",
                    "Роберт",
                    "Глеб",
                    "Лев",
                    "Кира",
                    "Пётр",
                    "Андрей",
                    "Борис",
                    "Вячеслав",
                    "Роман",
                    "Александр",
                    "Злата",
                    "Али",
                    "Рустам",
                    "Юлия",
                    "Фёдор",
                    "Таисия",
                    "Вероника",
                    "Анна",
                    "Савва",
                    "Николь",
                    "Екатерина",
                    "Ясмина",
                    "Гордей",
                    "Виктор",
                    "Ясина",
                    "Владислав",
                    "Константин",
                    "Евгений",
                    "Василиса",
                    "Артур",
                    "Ангелина",
                    "Марьяна",
                    "Лейла"
            };
    private static final String LAST_NAME[] =
            {
                    "Авдеев",
                    "Агафонов",
                    "Алексеев",
                    "Алексеев",
                    "Андрейко",
                    "Андрусейко",
                    "Баранов",
                    "Батейко",
                    "Белозёров",
                    "Белозёров",
                    "Бердник",
                    "Бердник",
                    "Бирюков",
                    "Борисенко",
                    "Борисов",
                    "Борисов",
                    "Буров",
                    "Веселов",
                    "Виноградов",
                    "Голубев",
                    "Денисов",
                    "Дидовец",
                    "Дмитриев",
                    "Дубченко",
                    "Жданов",
                    "Зварыч",
                    "Иванив",
                    "Исаев",
                    "Исаков",
                    "Калинин",
                    "Каськив",
                    "Кириленко",
                    "Кличко",
                    "Ковальчук",
                    "Ковалёв",
                    "Козлов",
                    "Коновалов",
                    "Копылов",
                    "Королёв",
                    "Коцюбинский",
                    "Кошелев",
                    "Кравченко",
                    "Кудряшов",
                    "Кузьмин",
                    "Кулаков",
                    "Лановой",
                    "Легойда",
                    "Логинов",
                    "Лукин",
                    "Лыткин",
                    "Миронов",
                    "Миронов",
                    "Михеев",
                    "Мясников",
                    "Никифоров",
                    "Новиков",
                    "Острожский",
                    "Острожский",
                    "Павлив",
                    "Павлик",
                    "Пестов",
                    "Петровский",
                    "Попов",
                    "Романенко",
                    "Русаков",
                    "Савенко",
                    "Савенко",
                    "Савин",
                    "Саксаганский",
                    "Самойлов",
                    "Семёнов",
                    "Сидоров",
                    "Сидоров",
                    "Сорокин",
                    "Сорокин",
                    "Спивак",
                    "Стрелков",
                    "Субботин",
                    "Суворов",
                    "Сусаренко",
                    "Тихонов",
                    "Трофимов",
                    "Трясило",
                    "Туров",
                    "Уваров",
                    "Федотов",
                    "Фомичёв",
                    "Хижняк",
                    "Хохлов",
                    "Цушко",
                    "Червоний",
                    "Чернов",
                    "Чумак",
                    "Шаров",
                    "Шкраба",
                    "Шубин",
                    "Шумейко",
                    "Шумило",
                    "Шухевич"
            };
}
