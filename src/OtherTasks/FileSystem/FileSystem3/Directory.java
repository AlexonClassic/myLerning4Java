package OtherTasks.FileSystem.FileSystem3;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Fileable {
    private List<Fileable> fileList = new ArrayList<Fileable>();
    private int size;

    public Directory(){}

    public Directory(Fileable obj){
        this();
        add(obj);
    }

    public  Directory(Fileable obj1, Fileable obj2){
        add(obj1);
        add(obj2);
    }

    public Directory add(Fileable obj){
        fileList.add(obj);
        return this;
    }

    @Override
    public int getSize(){
        this.size = 0;
        for (Fileable obj : fileList){
            size +=obj.getSize();
        }
        return size;
    }
}