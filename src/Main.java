import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        boolean durum=true;

        Modul modul = new Modul();

        do{
            modul.run();

            switch (modul.getTalep())
            {
                case 2:
                    System.out.format("---------------------------------------------------------------------------%n");
                    System.out.format("| %-15s | %-35s | %-15s | %n","Id","Ad","Marka");
                    System.out.format("---------------------------------------------------------------------------%n");
                    for(Telefon n:Telefon.telList)
                    {
                        System.out.format("| %-15s | %-35s | %-15s | %n",n.getId(),n.getName(),n.getMarka().getName());
                    }
                    System.out.format("---------------------------------------------------------------------------%n");
                    break;

                case 1:
                    System.out.format("---------------------------------------------------------------------------%n");
                    System.out.format("| %-15s | %-35s | %-15s | %n","Id","Ad","Marka");
                    System.out.format("---------------------------------------------------------------------------%n");
                    for(Notebook n:Notebook.noteList)
                    {
                        System.out.format("| %-15s | %-35s | %-15s | %n",n.getId(),n.getName(),n.getMarka().getName());
                    }
                    System.out.format("---------------------------------------------------------------------------%n");

                    break;


                case 3:
                    Collections.sort(Marka.markaList);
                    for (Marka m: Marka.markaList)
                        System.out.println(m.getName());

                    break;
                case 4:
                    System.out.println("Ürün grubu seç");
                    System.out.println("1 - Telefon");
                    System.out.println("2 - Notebook");
                    Scanner sc=new Scanner(System.in);
                    int talep = sc.nextInt();
                    if(talep==2)
                        modul.notebook();
                    else if (talep ==1)
                        modul.telefon();

                    break;
                case 6:
                    System.out.println("Ürün grubu seç");
                    System.out.println("1 - Telefon");
                    System.out.println("2 - Notebook");
                    Scanner sc4=new Scanner(System.in);
                    int talep4 = sc4.nextInt();
                    if(talep4==2)
                    {
                        System.out.println("Sileceğiniz ürün id numarasını giriniz");
                        Scanner input2 = new Scanner(System.in);
                        int veri2= input2.nextInt();
                        modul.silNotebook(veri2);
                    }
                    else if (talep4 ==1)
                    {
                        System.out.println("Sileceğiniz ürün id numarasını giriniz");
                        Scanner input = new Scanner(System.in);
                        int veri = input.nextInt();
                        modul.silTelefon(veri);
                    }


                    break;
                case 0:
                     durum=false;
                     break;
                case 5:
                    System.out.println("Ürün adına göre sorgu");
                    System.out.println("Ürün grubu seç");
                    System.out.println("1 - Telefon");
                    System.out.println("2 - Notebook");
                    Scanner sc2=new Scanner(System.in);
                    int talep2 = sc2.nextInt();
                    if(talep2==2)
                    {
                        Scanner s = new Scanner(System.in);
                        String veri = s.nextLine();
                        modul.sorgulamaNote(veri);
                    }
                    else if (talep2 ==1)
                    {
                        Scanner s = new Scanner(System.in);
                        String veri = s.nextLine();
                        modul.sorgulamaTel(veri);
                    }
                    break;
                default:
                    System.out.println("Uygun seçim yapmadınız");
            }
        }while(durum);






    }
}