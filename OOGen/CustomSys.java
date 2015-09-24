package OOGen;

import java.util.*;

public class CustomSys implements System {
	/*System Implementation*/
    public void add(IPModule module) {
        contents.add(module);
	}
    public void generate() {

    }
    /*System Implementation*/
    private List<IPModule> contents;
    public CustomSys() {
        contents = new ArrayList<IPModule>();
    }
    public 
}