package OtherTasks.FileSystem.FileSystem2;

public class File implements IFileObject {
    private int size;

    public File(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}