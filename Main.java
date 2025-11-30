import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();
        Scanner sc = new Scanner(System.in);

        try {
            menu.muatDariFile();
        } catch (IOException e) {
            System.out.println("Gagal memuat menu.");
        }

        while (true) {
            System.out.println("\n=== MANAJEMEN RESTORAN ===");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Tampilkan Menu");
            System.out.println("3. Pesan Menu");
            System.out.println("4. Cetak Struk");
            System.out.println("5. Simpan Menu");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");

            int pilih = sc.nextInt();
            sc.nextLine();

            try {
                switch (pilih) {
                    case 1:
                        System.out.print("Jenis (1. Makanan | 2. Minuman | 3. Diskon): ");
                        int jenis = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama: ");
                        String nama = sc.nextLine();

                        if (jenis == 3) {
                            System.out.print("Diskon (%): ");
                            double d = sc.nextDouble();
                            menu.tambahMenu(new Diskon(nama, d));
                        } else {
                            System.out.print("Harga: ");
                            double harga = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Jenis detail: ");
                            String detail = sc.nextLine();

                            if (jenis == 1)
                                menu.tambahMenu(new Makanan(nama, harga, detail));
                            else
                                menu.tambahMenu(new Minuman(nama, harga, detail));
                        }
                        break;

                    case 2:
                        menu.tampilkanMenu();
                        break;

                    case 3:
                        menu.tampilkanMenu();
                        System.out.print("Pilih nomor: ");
                        int idx = sc.nextInt() - 1;

                        pesanan.tambahPesanan(menu.getDaftarMenu().get(idx));
                        break;

                    case 4:
                        pesanan.cetakStruk();
                        System.out.println("Struk berhasil disimpan!");
                        break;

                    case 5:
                        menu.simpanKeFile();
                        System.out.println("Menu berhasil disimpan!");
                        break;

                    case 6:
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Menu tidak tersedia!");
            } catch (IOException e) {
                System.out.println("Kesalahan file!");
            } catch (Exception e) {
                System.out.println("Kesalahan input!");
            }
        }
    }
}
