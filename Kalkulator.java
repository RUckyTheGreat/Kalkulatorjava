import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== KALKULATOR LENGKAP ===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Faktorial");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Modulus");
            System.out.println("9. Logaritma (log basis 10)");
            System.out.println("10. Fungsi Trigonometri (sin, cos, tan)");
            System.out.println("11. KPK & FPB");
            System.out.println("12. Konversi Suhu (C, F, K)");
            System.out.println("13. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = input.nextInt();
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka 1-13.");
                input.nextLine();
                pilihan = 0;
                continue;
            }

            switch (pilihan) {
                case 1:
                case 2:
                case 3:
                case 4:
                    operasiDuaAngka(input, 
                        pilihan == 1 ? "tambah" :
                        pilihan == 2 ? "kurang" :
                        pilihan == 3 ? "kali" : "bagi"
                    );
                    break;
                case 5:
                    hitungFaktorialDenganValidasi(input);
                    break;
                case 6:
                    hitungPangkatDenganValidasi(input);
                    break;
                case 7:
                    akarKuadrat(input);
                    break;
                case 8:
                    modulus(input);
                    break;
                case 9:
                    logaritma(input);
                    break;
                case 10:
                    trigonometri(input);
                    break;
                case 11:
                    kpkFpb(input);
                    break;
                case 12:
                    konversiSuhu(input);
                    break;
                case 13:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-13.");
            }

        } while (pilihan != 13);

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
            System.out.println("Input tidak valid!");
            input.nextLine();
            return;
        }

        double hasil = 0;
        String formula = "";
        switch (operasi) {
            case "tambah":
                hasil = x + y;
                formula = x + " + " + y;
                break;
            case "kurang":
                hasil = x - y;
                formula = x + " - " + y;
                break;
            case "kali":
                hasil = x * y;
                formula = x + " * " + y;
                break;
            case "bagi":
                if (y == 0) {
                    System.out.println("Tidak bisa dibagi dengan 0.");
                    return;
                }
                hasil = x / y;
                formula = x + " / " + y;
                break;
        }
        System.out.println("Rumus: " + formula);
        System.out.println("Hasil: " + hasil);
    }

    static void hitungFaktorialDenganValidasi(Scanner input) {
        int n;
        try {
            System.out.print("Masukkan angka: ");
            n = input.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Angka harus antara 0 dan 20.");
                return;
            }
            System.out.println("Rumus: " + n + "! = " + n + " x (" + (n-1) + ") x ... x 1");
            System.out.println(n + "! = " + hitungFaktorial(n));
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static void hitungPangkatDenganValidasi(Scanner input) {
        try {
            System.out.print("Masukkan basis: ");
            double a = input.nextDouble();
            System.out.print("Masukkan pangkat: ");
            double b = input.nextDouble();
            System.out.println("Rumus: " + a + "^" + b);
            System.out.println(a + "^" + b + " = " + Math.pow(a, b));
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) hasil *= i;
        return hasil;
    }

    static void akarKuadrat(Scanner input) {
        try {
            System.out.print("Masukkan angka: ");
            double x = input.nextDouble();
            if (x < 0) {
                System.out.println("Tidak bisa menghitung akar dari angka negatif.");
                return;
            }
            System.out.println("Rumus: √" + x);
            System.out.println("√" + x + " = " + Math.sqrt(x));
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static void modulus(Scanner input) {
        try {
            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();
            if (b == 0) {
                System.out.println("Tidak bisa modulus dengan 0.");
                return;
            }
            System.out.println("Rumus: " + a + " % " + b);
            System.out.println("Hasil: " + (a % b));
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static void logaritma(Scanner input) {
        try {
            System.out.print("Masukkan angka (positif): ");
            double x = input.nextDouble();
            if (x <= 0) {
                System.out.println("Logaritma hanya didefinisikan untuk angka > 0.");
                return;
            }
            System.out.println("Rumus: log10(" + x + ")");
            System.out.println("log10(" + x + ") = " + Math.log10(x));
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static void trigonometri(Scanner input) {
        try {
            System.out.print("Masukkan sudut dalam derajat: ");
            double derajat = input.nextDouble();
            double radian = Math.toRadians(derajat);
            System.out.println("Rumus: sin(x), cos(x), tan(x) dengan x = " + derajat + "°");
            System.out.printf("sin(%.2f) = %.4f\n", derajat, Math.sin(radian));
            System.out.printf("cos(%.2f) = %.4f\n", derajat, Math.cos(radian));
            System.out.printf("tan(%.2f) = %.4f\n", derajat, Math.tan(radian));
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static void kpkFpb(Scanner input) {
        try {
            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();
            if (a == 0 || b == 0) {
                System.out.println("FPB dan KPK tidak terdefinisi jika salah satu angka 0.");
                return;
            }
            int fpb = hitungFPB(a, b);
            int kpk = Math.abs(a * b) / fpb;
            System.out.println("Rumus FPB: Euclidean Algorithm");
            System.out.println("FPB = " + fpb);
            System.out.println("Rumus KPK: |a * b| / FPB");
            System.out.println("KPK = " + kpk);
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }

    static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static void konversiSuhu(Scanner input) {
        try {
            System.out.println("Pilih konversi:");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Celcius ke Kelvin");
            System.out.println("3. Fahrenheit ke Celcius");
            System.out.println("4. Kelvin ke Celcius");
            int pilih = input.nextInt();

            System.out.print("Masukkan suhu: ");
            double suhu = input.nextDouble();
            double hasil;
            String satuan = "";
            String rumus = "";

            switch (pilih) {
                case 1 -> { hasil = suhu * 9/5 + 32; satuan = "F"; rumus = suhu + " * 9/5 + 32"; }
                case 2 -> { hasil = suhu + 273.15; satuan = "K"; rumus = suhu + " + 273.15"; }
                case 3 -> { hasil = (suhu - 32) * 5/9; satuan = "C"; rumus = "(" + suhu + " - 32) * 5/9"; }
                case 4 -> { hasil = suhu - 273.15; satuan = "C"; rumus = suhu + " - 273.15"; }
                default -> {
                    System.out.println("Pilihan tidak valid.");
                    return;
                }
            }

            System.out.println("Rumus: " + rumus);
            System.out.println("Hasil konversi: " + hasil + " " + satuan);
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
            input.nextLine();
        }
    }
}
