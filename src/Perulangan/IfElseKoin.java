package Perulangan;

public class IfElseKoin {
        public static void main(String [] args) {
            int koin = 0;
            int penuh = 500;

            System.out.println("Taruh koin ke Celengan : " + koin + "buah");
            System.out.println("Tetap Taruh koin : " + penuh + "buah");

            for(koin = 0; koin <= penuh ; koin++){
                koin++;
                System.out.println("Sedang menaruh koin..");
                System.out.println("Taruh koin sekarang : " + koin + "buah");
            }
            System.out.println("Isi Akkhir : " + koin + "buah");
        }
    }
