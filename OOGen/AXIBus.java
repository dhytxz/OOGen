package OOGen;

import java.util.*;

public class AXIBus implements Bus {
    /*IPModule Begin*/
    private static int count = 0;
    private static final String IPName = "axi_interconnection";
    private String name;
    private int id;
    /*IPModule End*/

    private int numsOfMaster;
    private int numsOfSlave;
    private List<IPModule> contents;
    public AXIBus() {
        id = count;
        name = IPName + '_' + id;
        count++;
        contents = new ArrayList<IPModule>();
        this.numsOfMaster = 0;
        this.numsOfSlave = 0;
    }
    public String getIPName() {
        return IPName;
    }
    public String getName() {
        return this.name;
    }
    public int getID() {
        return this.id;
    }    
    public void setNumsOfMaster(int numsOfMaster) {
        this.numsOfMaster = numsOfMaster;
    }
    public void setNumsOfSlave(int numsOfSlave) {
        this.numsOfSlave = numsOfSlave;
    }
    public int getNumsOfMaster() {
        return numsOfMaster;
    }
    public int getNumsOfSlave() {
        return numsOfSlave;
    }  
    public void add(IPModule module) {
        contents.add(module);
    } 
    public List<IPModule> getContents() {
        return contents;
    }
}