package OOGen;

import java.util.*;

public class AXIBus implements Bus {
    /*IPModlue Implementation*/
    private static final String IPName = "axi_interconnection";
    private static final Version ver = new Version(9, 4);
    private static int numsOfInstances = 0;
    private String instanceName;
    private int instanceID;
    public String getIPName() {
        return this.IPName;
    }
    public String getName() {
        return this.instanceName;
    }
    public int getID() {
        return this.instanceID;
    }
    public String getVersion() {
        return this.ver.getVersion();
    }
    public boolean isSameIPType(IPModule module) {
        return getIPName().equals(module.getIPName());
    }
    public void setName(String name) {
        this.instanceName = name;
    }
    public void setID(int id) {
        this.instanceID = id;
    }
    /*IPModlue Implementation*/

    private int numsOfMaster;
    private int numsOfSlave;
    private List<IPModule> contents;
    private void incNumsOfInstance() {
        this.numsOfInstances++;
    }
    private int getNumsOfInstance() {
        return this.numsOfInstances;
    }
    public AXIBus() {
        setID(getNumsOfInstance());
        setName(getIPName() + '_' + getID());
        incNumsOfInstance();
        contents = new ArrayList<IPModule>();
        this.numsOfMaster = 0;
        this.numsOfSlave = 0;
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