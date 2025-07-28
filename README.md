# 🧮 Kalkulator Sederhana Java

A simple **console-based calculator** written in Java that supports basic arithmetic operations, factorial calculation, and exponentiation.

---

## 📋 Fitur

- Penjumlahan
- Pengurangan
- Perkalian
- Pembagian (dengan validasi pembagi nol)
- Faktorial (validasi input negatif dan terlalu besar)
- Pangkat (eksponen)
- Validasi input non-angka
- Menu interaktif CLI (Command Line Interface)

---

## 🚀 Cara Menjalankan

### 1. Simpan kode ke file `Kalkulator.java`

### 2. Compile dengan:
```bash
javac Kalkulator.java
```

### 3. Jalankan dengan:
```bash
java Kalkulator
```

---

## 📌 Contoh Output

```
=== KALKULATOR SEDERHANA ===
1. Tambah
2. Kurang
3. Kali
4. Bagi
5. Faktorial
6. Pangkat
7. Keluar
Pilih menu: 5
Masukkan angka: 5
5! = 120
```

---

## 📎 Catatan

- Program akan menampilkan error jika input bukan angka (misal huruf).
- Faktorial dibatasi sampai `20!` untuk mencegah overflow (`long` max).
- Tidak bisa membagi dengan `0`.
- Gunakan di terminal/command prompt yang sudah terpasang JDK (Java Development Kit).

---

## 🛠️ Dibuat Dengan

- Bahasa: Java
- IDE rekomendasi: VS Code, IntelliJ IDEA, atau Notepad biasa + terminal
- Java version: 11 ke atas

---

## 🧑‍💻 Author

Dibuat sebagai latihan dasar logika pemrograman dan struktur Java.
