public class Minuman extends MenuItem {
    private String jenisMinuman;

    public Minuman(String nama, double harga, String jenis) {
        super(nama, harga, "Minuman");
        this.jenisMinuman = jenis;
    }

    @Override
    public void tampilMenu() {
        System.out.println("[Minuman] " + getNama() +
                " | Jenis: " + jenisMinuman +
                " | Harga: " + getHarga());
    }

    @Override
    public String toString() {
        return "MINUMAN," + getNama() + "," + getHarga() + "," + jenisMinuman;
    }
}
