package OtherTasks.FileSystem.FileSystem1;

/**
* Создать классы Directory, File, которые имеют метод getSize().
*
* Файл имеет фиксированный размер, размер директории считается по
* содержимому.
*
* В директорию можно вкладывать как файл, так и другую директорию.
* Зацикливания недопустимы.
*
* Создать иерархию директорий (клиентский код):
*        root
*        |--- dir1
*        |     |--- f1 (10 B)
*        |     |--- f2 (20 B)
*        |
*        |--- dir2
*        |     |--- dir3
*        |     |     |--- f3 (30 B)
*        |     |
*        |     |--- f4 (40 B)
*        |
*        |--- f5 (50 B)
*
* Посчитать размер директории root.
*
* Пример клиентского кода:
*       https://gist.github.com/anonymous/c8cfbd4b0692d80376a6.
*
* Иерархия директорий - это ИЕРАРХИЯ ОБЪЕКТОВ, а НЕ классов.
* Реально создавать файлы и директории НЕ НУЖНО.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory();

        Directory d1 = new Directory(
                new File(10),
                new File(20)
        );

        Directory d2 = new Directory(
                new Directory(
                        new File(30)
                ),
                new File(40)
        );

        root.add(d1).add(d2).add(new File(50));

        System.out.println(root.getSize());
        System.out.println(root);
    }
}

class File {
    private int size;
    private int level;

    public File(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        String view = "|";

        for (int i = 0; i < this.level; i++) {
            view += "---";
            view += "File{" +
                    "size=" + size +
                    '}' + "\n";
        }

        return view;
    }
}

class Directory {
    private Directory Parent;
    private int level;

    private List<Directory> dirs = new ArrayList<Directory>();
    private List<File> files = new ArrayList<File>();

    private Directory getParent() {
        return Parent;
    }

    private int getLevel() {
        return level;
    }

    private boolean dirCheck(Directory directory) {
        boolean result = true;

        if (this.Parent == null) {
            result = true;
        } else {
            if (directory == this.Parent) result = false;
            else dirCheck(this.Parent);
        }

        return result;
    }

    private void newDir(Directory directory) {
        if (dirCheck(directory)) {
            this.dirs.add(directory);
            directory.setParent(this);
        } else {
            System.out.println("You can't add a directory.");
        }
    }

    public Directory() {
        this.level = 0;
    }

    public Directory(File file1, File file2) {
        this.files.add(file1);
        this.files.add(file2);
    }

    public Directory(File file) {
        this.files.add(file);
    }

    public Directory(Directory directory) {
        newDir(directory);
    }

    public Directory(Directory directory, File file) {
        newDir(directory);
        this.files.add(file);
    }

    public Directory add(Directory directory) {
        newDir(directory);
        return this;
    }

    public Directory add(File file) {
        this.files.add(file);
        return this;
    }

    private void setParent(Directory parent) {
        Parent = parent;
    }

    public int getSize() {
        int SUM = 0;
        int level = 0;

        for (int i = 0, length = files.size(); i < length; i++) {
            SUM += files.get(i).getSize();
            level = this.level;
            files.get(i).setLevel(++level);
        }

        for (int i = 0, length = dirs.size(); i < length; i++) {
            SUM += dirs.get(i).getSize();
            level = this.level;
            dirs.get(i).level = ++level;
        }

        return SUM;
    }

    @Override
    public String toString() {
        String view = "|";

        for (int i = 0; i < this.level; i++) {
            view += "---";
            view += "Directory:" + "DIR: size" + this.getSize() + "\n";
        }

        for (int i = 0, length = dirs.size(); i < length; i++) {
            view += dirs.get(i).toString();
        }

        for (int i = 0, length = files.size(); i < length; i++) {
            view += files.get(i).toString();
        }

        return view;
    }
}