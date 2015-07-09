package OOGen;

public class MicroBlaze implements Processor {
    private static int count = 0;
    private static final String IPName = "microblaze";
    private String name;
    private int id;
    public MicroBlaze() {
        id = count;
        name = IPName + '_' + id;
        count++;
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
} 