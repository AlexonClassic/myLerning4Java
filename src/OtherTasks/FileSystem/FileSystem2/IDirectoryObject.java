package OtherTasks.FileSystem.FileSystem2;

public interface IDirectoryObject extends IFileObject {
    IDirectoryObject add(IFileObject obj);
}