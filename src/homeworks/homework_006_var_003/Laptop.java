package homeworks.homework_006_var_003;

class Laptop {
    private int ram;
    private int rom;
    private String os;
    private String color;

    public Laptop(int ram, int rom, String os, String color) {
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %s, %s", ram, rom, os, color );
    }
}
