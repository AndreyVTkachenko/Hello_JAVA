package homeworks.homework_006;

public class Laptop {
    private int ram;
    private int rom;
    private String os;
    private String color;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "RAM: \t" + ram +
                ",\t ROM: \t" + rom +
                ",\t Color: \t" + color+
                ",\t OS: \t" + os;
    }
}
