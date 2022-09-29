import java.util.Scanner;

/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class Main {
    public static void main(String[] args) {
        double anaPara,kdv1=0.18,kdv2=0.08,kdvTutari;
        Scanner yazici = new Scanner(System.in);
        System.out.println("Lutfen Para Tutarinizi giriniz: ");
        anaPara=yazici.nextDouble();

        kdvTutari = (anaPara>1000) ? anaPara*kdv1 : anaPara*kdv2;
        System.out.println("KDV'siz fiyat: "+anaPara);
        System.out.println("KDV'li fiyat: "+(anaPara+kdvTutari));
        System.out.println("KDV Tutari: "+kdvTutari);

    }
}
