package OOGen;

import java.util.*;

public interface Bus extends IPModule{
    public void setNumsOfMaster(int numsOfMaster);
    public void setNumsOfSlave(int numsOfSlave);
    public int getNumsOfMaster();
    public int getNumsOfSlave();
    public void add(IPModule module);
    public List<IPModule> getContents();
    //public void connect();
    //public void create();
}