package OtherTasks.FileSystem.FileSystem3;

public class File implements Fileable {
    private int size;

    public File(int size){
        setSize(size);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}