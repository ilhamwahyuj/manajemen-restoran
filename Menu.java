import java.io.*;
import java.util.*;

public class Menu {
    private ArrayList<MenuItem> daftarMenu = new ArrayList<>();

    public void tambahMenu(MenuItem item) {
        daftarMenu.add(item);
    }

    public ArrayList<MenuItem> getDaftarMenu() {
        return daftarMenu;
    }

    public void tampilkanMenu() {
        if (daftarMenu.isEmpty()) {
            System.out.println("Menu kosong!");
            return;
        }
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).tampilMenu();
        }
    }

    // FILE SAVE
    public void simpanKeFile() throws IOException {
        FileWriter writer = new FileWriter("menu.txt");
        for (MenuItem item : daftarMenu) {
            writer.write(item.toString() + "\n");
        }
        writer.close();
    }

    // FILE LOAD
    public void muatDariFile() throws IOException {
        File file = new File("menu.txt");
        if (!file.exists()) return;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            switch (data[0]) {
                case "MAKANAN":
                    tambahMenu(new Makanan(data[1], Double.parseDouble(data[2]), data[3]));
                    break;
                case "MINUMAN":
                    tambahMenu(new Minuman(data[1], Double.parseDouble(data[2]), data[3]));
                    break;
                case "DISKON":
                    tambahMenu(new Diskon(data[1], Double.parseDouble(data[2])));
                    break;
            }
        }
        reader.close();
    }
}
