package OOGen;

public interface Processor extends IPModule {
     public int getSizeOfICache();
     public int getSizeOfDCache();
     public int getSizeOfPrivateMemory();
     public void setSizeOfICache(int size);
     public void setSizeOfDCache(int size);
     public void setSizeOfPrivateMemory(int size);
}