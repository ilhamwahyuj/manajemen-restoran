# 🍽 Aplikasi Manajemen Restoran (Java Console)

![Repo Size](https://img.shields.io/github/repo-size/ilhamwahyuj/manajemen-restoran)
![Language](https://img.shields.io/github/languages/top/ilhamwahyuj/manajemen-restoran)
![Stars](https://img.shields.io/github/stars/ilhamwahyuj/manajemen-restoran?style=social)
![Forks](https://img.shields.io/github/forks/ilhamwahyuj/manajemen-restoran?style=social)
![Last Commit](https://img.shields.io/github/last-commit/ilhamwahyuj/manajemen-restoran)
![Issues](https://img.shields.io/github/issues/ilhamwahyuj/manajemen-restoran)
![License](https://img.shields.io/github/license/ilhamwahyuj/manajemen-restoran)

Aplikasi Manajemen Restoran berbasis Java Console yang dibuat untuk memenuhi **Tugas Praktik 3 Pemrograman Berorientasi Objek**.  
Program ini menerapkan konsep OOP seperti *abstraction, inheritance, polymorphism, encapsulation*, serta *file I/O* dan *exception handling*.

---

## 📌 Fitur Aplikasi

✅ Menambah menu makanan, minuman, dan diskon  
✅ Menampilkan daftar menu restoran  
✅ Mencatat pesanan pelanggan  
✅ Menghitung total pesanan termasuk diskon  
✅ Mencetak struk pesanan ke file `struk.txt`  
✅ Menyimpan & memuat menu dari file `menu.txt`  
✅ Menangani error input & file dengan exception handling  

---

## 🧠 Konsep yang Digunakan

| Konsep OOP | Implementasi |
|------------|--------------|
| Abstraction | `MenuItem` sebagai abstract class |
| Inheritance | `Makanan`, `Minuman`, `Diskon` extends `MenuItem` |
| Polymorphism | Method `tampilMenu()` |
| Encapsulation | Atribut private + getter |
| Exception Handling | Try-catch input error & file error |
| File I/O | `menu.txt` dan `struk.txt` |
| ArrayList | Penyimpanan menu & pesanan |
| Struktur Kontrol | Percabangan & perulangan |

---

## 📂 Struktur Project

manajemen-restoran/ </br>
├── MenuItem.java </br>
├── Makanan.java</br>
├── Minuman.java</br>
├── Diskon.java</br>
├── Menu.java</br>
├── Pesanan.java</br>
├── Main.java</br>
├── menu.txt</br>
└── struk.txt

---

## ⚙ Cara Menjalankan Program
javac *.java </br>
java Main

---

## 📄 Output File </br>
menu.txt	 ── Menyimpan data menu </br>
struk.txt	 ──  Struk pesanan
