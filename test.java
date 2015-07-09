import OOGen.*;


public class test {
    public static void main(String[] args) {
        Bus global = new AXIBus();
        for (int i = 0; i < 10; i++) {
            global.add(new MicroBlaze());
        }
        Processor mb = new MicroBlaze();
        global.add(mb);
        for (IPModule module : global.getContents()) {
            System.out.println(module.getName());
        }
    }
}