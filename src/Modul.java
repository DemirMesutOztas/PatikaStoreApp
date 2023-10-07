import java.util.List;
import java.util.Scanner;

public  class Modul {

    private int talep;

    public void run()
    {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("4 - Ürün ekleme");
        System.out.println("5 - Ürün sorgulama");
        System.out.println("6 - Ürün sil");
        System.out.println("0 - Çıkış Yap");
        Scanner input = new Scanner(System.in);
        System.out.print("Tercihiniz: ");
        talep=input.nextInt();


    }

    public void notebook()
    {
        System.out.println("Ekleyeceğiniz ürün markasını seçin");
        for(Marka marka:Marka.markaList)
            System.out.println(marka.getName());

        Scanner scan =  new Scanner(System.in);
        int marka = Integer.parseInt(scan.nextLine());
        System.out.println("Ürün bilgilerini giriniz?");
        System.out.println("İsmi:");
        String name = scan.nextLine();
        System.out.println("Birim fiyat:");
        double birimFiyat = Double.parseDouble(scan.nextLine());
        System.out.println("İndirim oranı:");
        int indirimOrani = Integer.parseInt(scan.nextLine());
        System.out.println("Stok miktarı:");
        int stokMiktari = Integer.parseInt(scan.nextLine());
        System.out.println("Ekran boyutu:");
        String ekranBoyutu = scan.nextLine();
        System.out.println("Ram:");
        String ram = scan.nextLine();
        System.out.println("Depolama:");
        String depolama = scan.nextLine();

       Notebook.noteList.add(new Notebook(name,Marka.markaList.get(marka),birimFiyat,indirimOrani,stokMiktari,ekranBoyutu,ram,depolama));

    }

    public void silNotebook(int id)
    {

        Notebook.noteList.remove(id);
    }

    public void silTelefon(int id)
    {
        Telefon.telList.remove(id);
    }

    public void telefon()
    {
        System.out.println("Ekleyeceğiniz ürün markasını seçin");
        for(Marka marka:Marka.markaList)
            System.out.println(marka.getName());

        Scanner scan =  new Scanner(System.in);
        int marka = Integer.parseInt(scan.nextLine());
        System.out.println("Ürün bilgilerini giriniz?");
        System.out.println("İsmi:");
        String name = scan.nextLine();
        System.out.println("Birim fiyat:");
        double birimFiyat = Double.parseDouble(scan.nextLine());
        System.out.println("İndirim oranı:");
        int indirimOrani = Integer.parseInt(scan.nextLine());
        System.out.println("Stok miktarı:");
        int stokMiktari = Integer.parseInt(scan.nextLine());
        System.out.println("Ekran boyutu:");
        String ekranBoyutu = scan.nextLine();
        System.out.println("Ram:");
        String ram = scan.nextLine();
        System.out.println("Hafıza:");
        String depolama = scan.nextLine();
        System.out.println("Pil gücü:");
        int pilgucu = Integer.parseInt(scan.nextLine());
        Telefon.telList.add(new Telefon(name,Marka.markaList.get(marka),birimFiyat,indirimOrani,stokMiktari,ekranBoyutu,ram,depolama,pilgucu));

    }


    void sorgulamaNote(String s)
    {
        List<Notebook> temp = Notebook.noteList.stream().filter(x -> x.getName().contains(s)).toList();
        for (Notebook n:temp
             ) {
            System.out.println(n.getName());

        }
    }

    void sorgulamaTel(String s)
    {
        List<Telefon> temp = Telefon.telList.stream().filter(x -> x.getName().contains(s)).toList();
        for (Telefon n:temp
        ) {
            System.out.println(n.getName());

        }
    }
    public int getTalep() {
        return talep;
    }

    public void setTalep(int talep) {
        this.talep = talep;
    }
}
