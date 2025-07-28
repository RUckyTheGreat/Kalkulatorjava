import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== KALKULATOR SEDERHANA ===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Faktorial");
            System.out.println("6. Pangkat");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                pilihan = input.nextInt();
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka 1-7.");
                input.nextLine(); // Clear the invalid input
                pilihan = 0; // Set to invalid choice to continue loop
                continue;
            }

            switch (pilihan) {
                case 1:
                    operasiDuaAngka(input, "tambah");
                    break;
                case 2:
                    operasiDuaAngka(input, "kurang");
                    break;
                case 3:
                    operasiDuaAngka(input, "kali");
                    break;
                case 4:
                    operasiDuaAngka(input, "bagi");
                    break;
                case 5:
                    hitungFaktorialDenganValidasi(input);
                    break;
                case 6:
                    hitungPangkatDenganValidasi(input);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-7.");
            }
        } while (pilihan != 7);

        input.close();
    }

    static void operasiDuaAngka(Scanner input, String operasi) {
        double x, y;
        
        try {
            System.out.print("Masukkan angka pertama: ");
            x = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            y = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Input tidak valid! Masukkan angka yang benar.");
            input.nextLine(); // Clear the invalid input
            return;
        }
        
        double hasil = 0;

        switch (operasi) {
            case "tambah":
                hasil = x + y;
                break;
            case "kurang":
                hasil = x - y;
                break;
            case "kali":
                hasil = x * y;
                break;
            case "bagi":
                if (y != 0) hasil = x / y;
                else {
                    System.out.println("Tidak bisa dibagi dengan 0.");
                    return;
                }
                break;
        }
        System.out.println("Hasil: " + hasil);
    }

    static void hitungFaktorialDenganValidasi(Scanner input) {
        int n;
        try {
            System.out.print("Masukkan angka: ");
            n = input.nextInt();
            if (n < 0) {
                System.out.println("Faktorial tidak terdefinisi untuk angka negatif.");
                return;
            }
            if (n > 20) {
                System.out.println("Angka terlalu besar! Masukkan angka <= 20.");
                return;
            }
            System.out.println(n + "! = " + hitungFaktorial(n));
        } catch (Exception e) {
            System.out.println("Input tidak valid! Masukkan angka yang benar.");
            input.nextLine(); // Clear the invalid input
        }
    }

    static void hitungPangkatDenganValidasi(Scanner input) {
        int a, b;
        try {
            System.out.print("Masukkan basis: ");
            a = input.nextInt();
            System.out.print("Masukkan pangkat: ");
            b = input.nextInt();
            System.out.println(a + "^" + b + " = " + Math.pow(a, b));
        } catch (Exception e) {
            System.out.println("Input tidak valid! Masukkan angka yang benar.");
            input.nextLine(); // Clear the invalid input
        }
    }

    static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
