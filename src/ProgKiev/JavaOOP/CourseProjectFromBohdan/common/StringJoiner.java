package ProgKiev.JavaOOP.CourseProjectFromBohdan.common;

/**
 * @author bvanchuhov
 *
 * Задание на курсовой проект Java OOP
 * В курсовом проекте должно быть реализовано ядро Web-сервиса или Android-приложения. Проект может служить основой для выполнения дипломного проекта на курсе Java Pro / Android и последующего добавления в резюме.

 * Проект выполняется в группах по 2-3 человека. Сдача происходит коллективно.

 * Ориентировочные темы курсового проекта:
 * Web-сервис: поисковая или рекомендательная система (фильмов, музыки, фотографий), интернет магазин (техники, автомобилей, услуг), приложения бронирования или заказа товаров/услуг (еды, такси) и т. д.

 * Android-приложение: таск-менеджер, фитнес-тренер, приложение для хранения заметок.

 * Что должно быть в проекте:
 * Часть 1. Разработанная примитивная бизнес-модель предметной области.
 * Часть 2. Гибкая система фильтрации и сортировки.
 * Часть 3. Файловый ввод/вывод в текстовом и бинарном форматах.

 * Чего НЕ должно быть в проекте:
 * Web-интерфейс с использованием HTML, CSS, JS. (Это темы для самостоятельного обучения, которые понадобятся для дипломной работы курса Java Pro. Реализация удобного интерфейса у программиста занимает 80% времени и полностью отвлекает от реализации необходимого функционала)

 * Работа с базой данных. (Это тема курса Java Pro. Хороший программист должен знать, как продуктивно работать с базой данных. Но сейчас неграмотное использование может только усложнить приложение и нарушить гибкость системы)

 * Desktop-интерфейс с использованием Swing/JavaFX. (Рынок Desktop для Java практически умер. Подобные знания абсолютно не пригодятся. Построение фронтенда занимает 80% времени программиста)

 * Консольный интерфейс. (Построение фронтенда занимает 80% времени программиста)

 * В дальнейшем все примеры демонстрируются для приложения: поисковая система фильмов.

 * Часть 1
 * Выбрать предметную область. (рекомендательная система фильмов)
 * Описать сущности, которые присутствуют в системе. (фильм, актер, пользователь системы и т. д.)

 * Описать связи между сущностями. (в фильме снимается много актеров; каждый актер может сниматься во множестве фильмов; относительно пользователя хранится список любимых фильмов и актеров, список просмотренных фильмов с рейтингом и т. д.) Необходимо строить максимально гибкую систему используя интерфейсы, абстрактные и конкретные классы, перечисления, вложенные классы; используя связи композиции, имплементации и наследования.

 * Как правило, сущности не обладают поведением, а хранят только значения своих свойств. Хорошо и оправданно поиграться с полиморфизмом можно в части 2. (НЕ нужно, чтобы актер умел играть, танцевать или улыбаться)

 * Важно: Используйте все с умом. Использование каждого типа класса и связей должно было оправданным, а не высосанным из пальца. Необходимо стараться сделать прототип, максимально похожий на реальное приложение.

 * Важно: Будьте проще, следуйте принципу KISS. Приложение НЕ должно быть сложным и всеохватывающим. Попытка достичь перфекционизма обычно заканчивается неоправданным усложнением системы и не сданным проектом. Количество уровней иерархии не должно превышать 3, количество подклассов не должно превышать 3-4. Очень сложные связи лучше не использовать.

 * Порядок сдачи:
 * UML-диаграмма классов, нарисованная от руки (разборчивый почерк), в редакторе или сгенерированная из кода. Необходимо предоставить картинку или несколько картинок, которые помогут быстро понять, в чем заключается предметная область. Можно показывать до/после лекции или отправлять в Skype.

 * Дополнительное задание (для тех, кто уже справился со 2 частью):
 * Придумать и реализовать функциональную изюминку сервиса. (гибкая система рекомендаций по просмотренным фильмам пользователя, выставленным оценкам, любимым актерам) Не нужно делать алгоритмически сложную систему. Необходимо лишь показать умение работы с уже готовыми данными, возможность интеллектуальной манипуляции с ними.

 * Часть 2
Гибкая система фильтрации и сортировки. (в процессе доработки…)

 * Часть 3
 * Файловый ввод/вывод в текстовом и бинарном форматах. (в процессе доработки…)
 */

public class StringJoiner {

    private final String delimiter;

    public StringJoiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(Object... elems) {
        StringBuilder res = new StringBuilder();
        for (Object elem : elems) {
            res.append(elem).append(delimiter);
        }
        deleteLastDelimiter(res);

        return res.toString();
    }

    private StringBuilder deleteLastDelimiter(StringBuilder res) {
        return res.delete(res.length() - delimiter.length(), res.length());
    }
}
