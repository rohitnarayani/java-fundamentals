package innerclass.static_innerclass;
import innerclass.static_innerclass.Computer.Builder;

public class ComputerTest {
    public static void main(String []args){
        Builder build = new Builder().setBrand("Lenovo").setRAM(16).setStorage(512);
        Computer computer = build.buildComputer();
        build.displayConfig();
    }
}
