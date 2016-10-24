package ProgKiev.JavaOOP.CorseProjectExampleFromBohdan.io;

import ProgKiev.JavaOOP.CorseProjectExampleFromBohdan.entity.Film;
import ProgKiev.JavaOOP.CorseProjectExampleFromBohdan.entity.Genre;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static ProgKiev.JavaOOP.CorseProjectExampleFromBohdan.io.Validator.isInt;
import static ProgKiev.JavaOOP.CorseProjectExampleFromBohdan.io.Validator.isReleaseYear;

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

public class FilmIOUtils {

    private FilmIOUtils() {}

    public static final String CSV_DELIMITER = ";";

    // Input from text file

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */

    public static List<Film> readFilmsFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFilms(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */

    public static List<Film> readFilms(BufferedReader reader) throws IOException {
        List<Film> res = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Film film = parseFilm(line);
            res.add(film);
        }

        return res;
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */

    public static Film readFilmFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFilm(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */

    public static Film readFilm(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseFilm(line);
    }

    // Output into text file

    public static void writeFilmsIntoFile(String fileName, List<Film> films) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            writeFilms(writer, films);
        }
    }

    public static void writeFilms(PrintWriter writer, List<Film> films) {
        for (Film film : films) {
            writer.println(film.toOutputString(CSV_DELIMITER));
        }
    }

    // Input from binary file

    public static void writeFilmsIntoBinFile(String fileName, List<Film> films) throws IOException {
        try (ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutput.writeObject(films);
        }
    }

    // Output into binary file

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */

    public static List<Film> readFilmsFromBinFile(String fileName) throws IOException {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Film>)objectInput.readObject();
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IllegalFormatException("Binary file is corrupted", e);
        }
    }

    // Common

    /**
     * @throws IllegalFormatException
     */

    public static Film parseFilm(String line) {
        String[] tokens = line.split(CSV_DELIMITER);

        if (tokens.length < 3) {
            throw new IllegalFormatException("Missing values, should be (name;release-year;genres): " + line);
        }
        if (!isInt(tokens[1])) {
            throw new IllegalFormatException("Release year in not a number: " + tokens[1]);
        }

        String name = tokens[0].trim();
        int releaseYear = Integer.parseInt(tokens[1].trim());
        if (!isReleaseYear(releaseYear)) {
            throw new IllegalFormatException("Illegal release year: " + releaseYear);
        }

        Set<Genre> genres = parseGenre(tokens[2]);
        if (genres == null) {
            return null;
        }

        return new Film(name, releaseYear, genres);
    }

    /**
     * @throws IllegalFormatException
     */

    public static Set<Genre> parseGenre(String line) {
        Set<Genre> genres = new HashSet<>();

        String[] genreTokens = line.split(",");
        for (String genreToken : genreTokens) {
            genreToken = genreToken.trim();

            if (!Genre.isGenre(genreToken)) {
                throw new IllegalFormatException("Illegal genre: " + genreToken);
            }

            genres.add(Genre.valueOf(genreToken));
        }

        return genres;
    }
}