package OOGen;

public class MicroBlaze implements Processor {
    /*IPModlue Implementation*/
    private static final String IPName = "microblaze";
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

    private int sizeOfPrivateMemory;
    private int sizeOfICache;
    private int sizeOfDCache;
    private void incNumsOfInstance() {
        this.numsOfInstances++;
    }
    private int getNumsOfInstance() {
        return this.numsOfInstances;
    }
    public MicroBlaze() {
        setID(getNumsOfInstance());
        setName(getIPName() + '_' + getID());
        incNumsOfInstance();
        setSizeOfICache(0);
        setSizeOfDCache(0);
        setSizeOfPrivateMemory(4);
    }
    public int getSizeOfICache() {
        return this.sizeOfICache;
    }
    public int getSizeOfDCache(){
        return this.sizeOfDCache;
    }
    public int getSizeOfPrivateMemory() {
        return this.sizeOfPrivateMemory;
    }
    public void setSizeOfICache(int size){
        this.sizeOfICache = size;
    }
    public void setSizeOfDCache(int size){
        this.sizeOfDCache = size;
    }
    public void setSizeOfPrivateMemory(int size) {
        this.sizeOfPrivateMemory = size;
    }
}