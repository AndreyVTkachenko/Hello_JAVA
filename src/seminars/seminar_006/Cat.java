package seminars.seminar_006;

import java.util.List;

public class Cat {
    private String name;
    private int age;
    private String poroda;
    private String nameOwner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", poroda: " + poroda + ", owner: " + nameOwner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && poroda.equals(cat.poroda);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 13*poroda.hashCode();
    }
}