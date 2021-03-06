package com.company.object;

import java.util.Random;

public class District {

    private static final Random random = new Random();
    private static int i = 1;

    public static String generate() {
        return String.format(TEMPLATES, i++, generateRandomName(), 1 + random.nextInt(255));
    }

    private static String generateRandomName() {
        return NAME[random.nextInt(144)];
    }

    private static final String TEMPLATES = "INSERT INTO district(id, name, city_id) VALUES(%s, '%s', %s);";

    private static final String[] NAME =
            {"Академический",
                    "Алексеевский",
                    "Алтуфьевский",
                    "Арбат",
                    "Аэропорт",
                    "Бабушкинский",
                    "Басманный",
                    "Беговой",
                    "Бескудниковский",
                    "Бибирево",
                    "Бирюлёво Восточное",
                    "Бирюлёво Западное",
                    "Богородское",
                    "Братеево",
                    "Бутырский",
                    "Вешняки",
                    "Внуково",
                    "Войковский",
                    "Восточное Дегунино",
                    "Восточное Измайлово",
                    "Восточный",
                    "Выхино-Жулебино",
                    "Гагаринский",
                    "Головинский",
                    "Гольяново",
                    "Даниловский",
                    "Дмитровский",
                    "Донской",
                    "Дорогомилово",
                    "Замоскворечье",
                    "Западное Дегунино",
                    "Зюзино",
                    "Зябликово",
                    "Ивановское",
                    "Измайлово",
                    "Капотня",
                    "Коньково",
                    "Коптево",
                    "Косино-Ухтомский",
                    "Котловка",
                    "Красносельский",
                    "Крылатское",
                    "Крюково",
                    "Кузьминки",
                    "Кунцево",
                    "Куркино",
                    "Левобережный",
                    "Лефортово",
                    "Лианозово",
                    "Ломоносовский",
                    "Лосиноостровский",
                    "Люблино",
                    "Марфино",
                    "Марьина Роща",
                    "Марьино",
                    "Матушкино",
                    "Метрогородок",
                    "Мещанский",
                    "Митино",
                    "Можайский",
                    "Молжаниновский",
                    "Москворечье-Сабурово",
                    "Нагатино-Садовники",
                    "Нагатинский Затон",
                    "Нагорный",
                    "Некрасовка",
                    "Нижегородский",
                    "Ново-Переделкино",
                    "Новогиреево",
                    "Новокосино",
                    "Обручевский",
                    "Орехово-Борисово Северное",
                    "Орехово-Борисово Южное",
                    "Останкинский",
                    "Отрадное",
                    "Очаково-Матвеевское",
                    "Перово",
                    "Печатники",
                    "Покровское-Стрешнево",
                    "Преображенское",
                    "Пресненский",
                    "Проспект Вернадского",
                    "Раменки",
                    "Ростокино",
                    "Рязанский",
                    "Савёлки",
                    "Савёловский",
                    "Свиблово",
                    "Северное Бутово",
                    "Северное Измайлово",
                    "Северное Медведково",
                    "Северное Тушино",
                    "Северный",
                    "Силино",
                    "Сокол",
                    "Соколиная Гора",
                    "Сокольники",
                    "Солнцево",
                    "Старое Крюково",
                    "Строгино",
                    "Таганский",
                    "Тверской",
                    "Текстильщики",
                    "Тёплый Стан",
                    "Тимирязевский",
                    "Тропарёво-Никулино",
                    "Филёвский Парк",
                    "Фили-Давыдково",
                    "Хамовники",
                    "Ховрино",
                    "Хорошёво-Мнёвники",
                    "Хорошёвский",
                    "Царицыно",
                    "Черёмушки",
                    "Чертаново Северное",
                    "Чертаново Центральное",
                    "Чертаново Южное",
                    "Щукино",
                    "Южное Бутово",
                    "Южное Медведково",
                    "Южное Тушино",
                    "Южнопортовый",
                    "Якиманка",
                    "Ярославский",
                    "Ясенево",
                    "Адмиралтейский район",
                    "Василеостровский район",
                    "Выборгский район",
                    "Калининский район",
                    "Кировский район",
                    "Колпинский район",
                    "Красногвардейский район",
                    "Красносельский район",
                    "Кронштадтский район",
                    "Курортный район",
                    "Московский район",
                    "Невский район",
                    "Область",
                    "Петроградский район",
                    "Петродворцовый район",
                    "Приморский район",
                    "Пушкинский район",
                    "Фрунзенский район",
                    "Центральный район",


            };
}
