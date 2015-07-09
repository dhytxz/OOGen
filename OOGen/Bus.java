package OOGen;

public interface Bus {
    public void setNumsOfMaster(int numsOfMaster);
    public void setNumsOfSlave(int numsOfSlave);
    public int getNumsOfMaster();
    public int getNumsOfSlave();
    public void add();
    public void connect();
    public void generate():
}