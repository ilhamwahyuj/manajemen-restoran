public class Makanan extends MenuItem {
    private String jenisMakanan;

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga, "Makanan");
        this.jenisMakanan = jenis;
    }

    @Override
    public void tampilMenu() {
        System.out.println("[Makanan] " + getNama() +
                " | Jenis: " + jenisMakanan +
                " | Harga: " + getHarga());
    }

    @Override
    public String toString() {
        return "MAKANAN," + getNama() + "," + getHarga() + "," + jenisMakanan;
    }
}
