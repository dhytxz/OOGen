package OOGen;

public class AXIBus implements Bus {
    private int numsOfMaster;
    private int numsOfSlave;
    public AXIBus() {
        this.numsOfMaster = 0;
        this.numsOfSlave = 0;
    }
    public AXIBus(int numsOfMaster, int numsOfSlave) {
        this.numsOfMaster = numsOfMaster;
        this.numsOfSlave = numsOfSlave;   
    }
    @Override
    public void setNumsOfMaster(int numsOfMaster) {
        this.numsOfMaster = numsOfMaster;
    }
    @Override
    public void setNumsOfSlave(int numsOfSlave) {
        this.numsOfSlave = numsOfSlave;
    }
    @Override
    public int getNumsOfMaster() {
        return numsOfMaster;
    }
    @Override
    public int getNumsOfSlave() {
        return numsOfSlave;
    }   
}