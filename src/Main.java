import java.util.Scanner;

public class Main {

    // Soru 1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ürün almak istiyorsunuz? ");
        int urunSayisi = scanner.nextInt();
        double toplamTutar = 0;

        for (int i = 0; i < urunSayisi; i++) {
            System.out.print("Ürünün fiyatını giriniz: ");
            double fiyat = scanner.nextDouble();
            toplamTutar += fiyat;
        }

        System.out.println("Toplam alışveriş tutarı: " + toplamTutar);


    }





}

