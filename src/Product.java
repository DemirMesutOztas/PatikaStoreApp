import java.util.ArrayList;

public abstract class Product {
    private int id;
    private String name;
    private Marka marka;
    private double birimFiyat;
    private double indirimOrani;
    private int stokMiktari;
    private String ekranBoyutu;
    private String ram;

    public static ArrayList<Product> productList = new ArrayList<>();

    Product(String name, Marka marka, double birimFiyat, double indirimOrani, int stokMiktari, String ekranBoyutu, String ram)
    {
        this.id=id;
        this.name=name;
        this.marka=marka;
        this.birimFiyat=birimFiyat;
        this.indirimOrani=indirimOrani;
        this.stokMiktari=stokMiktari;
        this.ekranBoyutu=ekranBoyutu;
        this.ram=ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public double getIndirimOranı() {
        return indirimOrani;
    }

    public void setIndirimOranı(double indirimOranı) {
        this.indirimOrani = indirimOranı;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(String ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
