import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        /*
        Ödev
            Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
            kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        Scanner input = new Scanner(System.in);

        int sayi,toplam=0 ;

        do {
            System.out.print("Bir sayı giriniz:");
            sayi = input.nextInt();
            if (sayi%4 == 0) {
                toplam = sayi+toplam;
            }
        }while (sayi%2 == 0);

        System.out.println("Girilen değer 2 ve 4 katı değildir." + toplam);







       }









    }


