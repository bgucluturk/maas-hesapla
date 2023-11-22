import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String cevap = "y";

        while (cevap.equals("y")) {
            int maas;
            Scanner klavye = new Scanner(System.in);
            System.out.print("Maaş Giriniz: ");
            maas = klavye.nextInt();

            int saat;
            Scanner klavye2 = new Scanner(System.in);
            System.out.print("Ders Saati Giriniz: ");
            saat = klavye.nextInt();

            while (saat > 30) {
                System.out.println("Ders saati 30'dan büyük olamaz !");
                System.out.print("Ders Saati Giriniz: ");
                saat = klavye.nextInt();
            }

            System.out.println("Maaş :" + maas + " Ders Saati:" + saat);

            int ekDers = saat > 15 ? saat - 15 : 0;
            int totalEkUcret = ekDers > 10 ? (10 * 20 + 30 * (ekDers - 10)) : ekDers * 20;

            System.out.println("Maaş :" + maas + " Ders Ücreti:" + totalEkUcret);

            System.out.println("Toplam Maaş :" + (maas + totalEkUcret));

            Scanner klavye3 = new Scanner(System.in);
            System.out.print("Devam etmek istiyor musunuz ? (y/n) ");
            cevap = klavye3.next();
        }
    }
}