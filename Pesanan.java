import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Pesanan {
    private ArrayList<MenuItem> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem item) {
        daftarPesanan.add(item);
    }

    public double hitungTotal() {
        double total = 0;
        double diskon = 0;

        for (MenuItem item : daftarPesanan) {
            if (item instanceof Diskon) {
                diskon += ((Diskon) item).getDiskon();
            } else {
                total += item.getHarga();
            }
        }

        if (diskon > 0) {
            total -= total * (diskon / 100);
        }
        return total;
    }

    public void cetakStruk() throws IOException {
        FileWriter writer = new FileWriter("struk.txt");
        writer.write("====== STRUK PESANAN ======\n");
        for (MenuItem item : daftarPesanan) {
            writer.write(item.getNama() + " - " + item.getHarga() + "\n");
        }
        writer.write("---------------------------\n");
        writer.write("TOTAL BAYAR: " + hitungTotal());
        writer.close();
    }
}
