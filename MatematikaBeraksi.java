`11import java.util.Scanner;

class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        return a / b;
    }
}

class MatematikaBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematika matematika = new Matematika();

        System.out.println("Menu Aplikasi Matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Pilih Menu = ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= 4) {
            System.out.print("Masukkan Angka Pertama = ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan Angka Kedua = ");
            int angka2 = scanner.nextInt();

            int hasil = 0;
            String operasi = "";
            switch (pilihan) {
                case 1:
                    hasil = matematika.pertambahan(angka1, angka2);
                    operasi = "Pertambahan";
                    break;
                case 2:
                    hasil = matematika.pengurangan(angka1, angka2);
                    operasi = "Pengurangan";
                    break;
                case 3:
                    hasil = matematika.perkalian(angka1, angka2);
                    operasi = "Perkalian";
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = matematika.pembagian(angka1, angka2);
                        operasi = "Pembagian";
                    } else {
                        System.out.println("Error: Pembagian dengan angka nol tidak diizinkan.");
                        return;
                    }
                    break;
            }

            System.out.println("Hasil " + operasi + " antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
        } else {
            System.out.println("Error: Pilihan tidak valid.");
        }

        scanner.close();
    }
}
