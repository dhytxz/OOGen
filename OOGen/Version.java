package OOGen;

public class Version {
    private int major;
    private int minor;
    public Version(){
        this.major = 0;
        this.minor = 0;
    }
    public Version(int major, int minor) {
        this.major = major;
        this.minor = minor;
    }
    public void setVersion(int major, int minor) {
        if (major != 0) {
            this.major = major;
        }
        if (minor != 0) {
            this.minor = 0;
        }
    }
    public String getVersion() {
        return major + "." + minor;
    }
    public int getMajor() {
        return this.major;
    }
    public int getMinor() {
        return this.minor;
    }
}