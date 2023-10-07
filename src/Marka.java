import java.util.ArrayList;
import java.util.Collections;

public class Marka implements Comparable<Marka> {
    private int id;
    private String name;
    private static int artir=0;

    public static ArrayList<Marka> markaList = new ArrayList<>();

    Marka( String name)
    {
        this.id=artir++;
        this.name=name;
        Collections.sort(Marka.markaList);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Marka m) {
        return this.name.compareTo(m.name);
    }

    static {
        Marka.markaList.add(new Marka("Samsung"));
        Marka.markaList.add(new Marka("Lenovo"));
        Marka.markaList.add(new Marka("Apple"));
        Marka.markaList.add(new Marka("Huawei"));
        Marka.markaList.add(new Marka("Casper"));
        Marka.markaList.add(new Marka("Asus"));
        Marka.markaList.add(new Marka("HP"));
        Marka.markaList.add(new Marka("Xiaomi"));
        Marka.markaList.add(new Marka("Monster"));
    }




}
