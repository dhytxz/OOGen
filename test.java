import OOGen.*;


public class test {
    public static void main(String[] args) {
        Bus axi = new AXIBus();
        axi.setNumsOfMaster(1);
        System.out.println(axi.getNumsOfMaster());
    }
}