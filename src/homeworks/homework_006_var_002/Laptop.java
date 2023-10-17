package homeworks.homework_006_var_002;

import java.util.*;

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

    public static Laptop createLaptop(int ram, int rom, String os, String color) {
        Laptop laptop = new Laptop();
        laptop.setRam(ram);
        laptop.setRom(rom);
        laptop.setOs(os);
        laptop.setColor(color);
        return laptop;
    }

    @Override
    public String toString() {
        return
                "RAM: \t" + ram +
                ",\t\t ROM: \t" + rom +
                ",\t\t Color: \t" + color+
                ",\t\t OS: \t" + os;
    }
}
