import java.util.Objects;

public class Comps {
    public String name;
    public String serialNumber;
    public String os;
    public int memory;
    public int hddVolume;
    public int id;

    public Comps(String name, String serialNumber, String os, int memory, int hddVolume, int id) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.os = os;
        this.memory = memory;
        this.hddVolume = hddVolume;
        this.id = id;
    }

    public boolean isExist(){
        return true;
    }

    @Override
    public String toString() {
        return "name=" + name + ", serialNumber=" + serialNumber + ", os=" + os + ", memory=" + memory
                + ", hddVolume=" + hddVolume + " | id= " + id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name , serialNumber, os, memory, hddVolume, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comps nb = (Comps) o;
        return name == nb.name && serialNumber == nb.serialNumber && memory == nb.memory;
    }

    
}
