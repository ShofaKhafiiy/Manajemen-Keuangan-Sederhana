# 💰 Manajemen Keuangan Sederhana

Program **ManajemenKeuangan** ini dibuat sebagai bagian dari latihan *Codelab Modul 3 - Modern Programming Environment and Documentation Style*.  
Tujuannya adalah untuk memahami dasar penggunaan Git, GitHub, dan dokumentasi proyek, sekaligus menerapkan gaya pemrograman yang bersih dan modern dalam Java.

---

## 📘 Deskripsi Program

Program ini membantu pengguna menghitung kondisi keuangan sederhana berdasarkan **pemasukan** dan **pengeluaran** yang diinputkan oleh pengguna.  
Hasilnya akan menampilkan **saldo akhir** serta memberikan analisis otomatis apakah keuangan pengguna **sehat**, **seimbang**, atau **perlu evaluasi**.

---

## ⚙️ Fitur Utama

- Input jumlah **pemasukan**
- Input jumlah **pengeluaran**
- Hitung **saldo akhir** secara otomatis
- Tampilkan **ringkasan keuangan**
- Analisis kondisi keuangan:
    - `Saldo > 0` → *Keuangan Anda sehat*
    - `Saldo == 0` → *Keuangan Anda seimbang*
    - `Saldo < 0` → *Pengeluaran melebihi pemasukan. Perlu evaluasi!*

---

## 🧩 Struktur Kode

```java
public class ManajemenKeuangan {
    public static void main(String[] args) { ... }    // Titik masuk utama program
    private static void display(...) { ... }          // Menampilkan hasil ringkasan
    private static void logic(...) { ... }            // Memberikan analisis kondisi keuangan
}



🚀 Instalasi

Untuk menjalankan proyek ini secara lokal, ikuti langkah-langkah berikut:

1️⃣ Clone repository
git clone https://github.com/ShofaKhafiiy/Manajemen-Keuangan-Sederhana.git

2️⃣ Masuk ke direktori proyek
cd ManajemenKeuangan

3️⃣ Kompilasi program

Jika kamu menggunakan terminal:
javac src/com/ShofaKhafiy/codelab1/ManajemenKeuangan.java
Atau jika menggunakan IntelliJ IDEA / VSCode:
Buka folder proyek.
Klik kanan file ManajemenKeuangan.java.

Pilih Run 'ManajemenKeuangan.main()'.

4️⃣ Jalankan program
java com.ShofaKhafiy.codelab1.ManajemenKeuangan

🧾 Contoh Output
Masukkan total pemasukan: Rp 5000000
Masukkan total pengeluaran: Rp 3000000

--- Ringkasan Keuangan ---
Pemasukan: Rp 5000000.0
Pengeluaran: Rp 3000000.0
Saldo akhir: Rp 2000000.0
Keuangan Anda sehat.

📁 Struktur Folder Proyek
ManajemenKeuangan/
├── .idea/
├── src/
│   └── com/
│       └── ShofaKhafiy/
│           └── codelab1/
│               └── ManajemenKeuangan.java
├── pom.xml
└── README.md

🧰 Teknologi yang Digunakan

Java 17+

IntelliJ IDEA

Git & GitHub

