package OtherTasks.FileSystem.FileSystem2;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IDirectoryObject {
    private List<IFileObject> listFileDir = new ArrayList<IFileObject>();
    private int size;

    public Directory(IFileObject... objsDirFile){
        for (IFileObject obj : objsDirFile){
            add(obj);
        }
    }

    public IDirectoryObject add(IFileObject obj){
        if( obj == this ) {
            throw new IllegalArgumentException();
        }

        if (obj.getClass() == Directory.class){
            listFileDir.add(obj);
            size+=obj.getSize();
            return this;
        }

        if (obj.getClass() == File.class) {
            listFileDir.add(obj);
            size += obj.getSize();
            return this;
        }

        throw new IllegalArgumentException();
    }

    public int getSize(){
        return size;
    }
}