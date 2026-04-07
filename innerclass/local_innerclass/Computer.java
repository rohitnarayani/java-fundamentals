package innerclass.local_innerclass;

public class Computer {

    private String brand;
    private int RAM;
    private long storage;

    private Computer() {
    }

    static class Builder {
        private String brand;
        private int RAM;
        private long storage;

        Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder setRAM(int ram) {
            this.RAM = ram;
            return this;
        }

        Builder setStorage(long storage) {
            this.storage = storage;
            return this;
        }

        Computer buildComputer() {
            Computer computer = new Computer();
            computer.brand = this.brand;
            computer.RAM = this.RAM;
            computer.storage = this.storage;

            return computer;
        }

        void displayConfig() {
            System.out.println("=== Computer Config ===");
            System.out.println("Brand   : " + brand);
            System.out.println("RAM     : " + RAM + "GB");
            System.out.println("Storage : " + storage);
        }
    }
}
