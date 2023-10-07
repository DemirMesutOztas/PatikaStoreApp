import java.util.ArrayList;

public class Telefon extends Product{

    private String hafiza;
    private int pilGucu;

    private String renk;

    private static int artirTel=0;

    public static ArrayList<Telefon> telList = new ArrayList<>();



    Telefon(String name, Marka marka, double birimFiyat, double indirimOrani, int stokMiktari, String ekranBoyutu, String ram, String hafiza, int pilGucu)
    {

        super(name, marka,  birimFiyat,  indirimOrani,  stokMiktari,  ekranBoyutu,  ram);
        this.hafiza=hafiza;
        this.pilGucu=pilGucu;
        this.setId(artirTel++);


    }

    static{
        telList.add(new Telefon("iphone15",Marka.markaList.get(0),10500,10,100,"6.1","6GB",
                "64GB",5000));
        telList.add(new Telefon("SamsungS21",Marka.markaList.get(2),8000,15,250,"6.3","8GB",
                "64GB",6000));
    }



}
