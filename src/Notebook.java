import java.util.ArrayList;

public class Notebook extends Product
{
    private String depolama;
    private static int artirNot=0;

    public static ArrayList<Notebook> noteList = new ArrayList<>();

    Notebook( String name, Marka marka, double birimFiyat, double indirimOrani, int stokMiktari, String ekranBoyutu, String ram, String depolama)
    {
        super(name, marka, birimFiyat, indirimOrani, stokMiktari, ekranBoyutu, ram);
        this.depolama=depolama;
        this.setId(artirNot++);


    }

    public String getDepolama() {
        return depolama;
    }

    public void setDepolama(String depolama) {
        this.depolama = depolama;
    }


    static {
        noteList.add(new Notebook("Ultrabook",Marka.markaList.get(0),30000,10,1000,
                "14.1","32GB","512GB SDD"));
        noteList.add(new Notebook("Macbook",Marka.markaList.get(1),45000,10,500,
                "14.1","16GB","512GB SDD"));
    }

}
