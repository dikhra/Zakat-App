# ZakatApp

ZakatApp adalah proyek inovatif yang bertujuan untuk memberikan solusi modern dalam mengelola zakat, menggunakan bahasa pemrograman Java dengan JavaFX, dan API JDBC sebagai koneksi ke database MySQL. Dengan menggabungkan keahlian di bidang zakat dengan kemampuan teknologis Java dan JavaFX, proyek ini memperkenalkan platform yang memungkinkan orang mengelola zakat mereka secara lebih efisien dan transparan.

## Persyaratan Sistem

Sebelum menjalankan ZakatApp, pastikan sistem pengguna telah memenuhi persyaratan berikut:

1. **Java Runtime Environment (JRE):** Instal Java Runtime Environment di perangkat Anda. Pastikan JRE yang diinstal mencakup modul JavaFX. Anda dapat mengunduh JRE dari [situs resmi Java](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Path Environment Variable:** Pastikan direktori bin dari instalasi JRE (dan JavaFX jika tidak termasuk dalam distribusi JRE) ditambahkan ke variabel lingkungan PATH di sistem pengguna. Ini memungkinkan sistem untuk menemukan perintah Java dan JavaFX.

3. **Periksa JavaFX di JRE:** Dengan menggunakan perintah berikut di terminal atau command prompt, Anda dapat memastikan bahwa JavaFX termasuk dalam distribusi JRE yang diinstal:
    ```bash
    java --list-modules | grep javafx
    ```

    Pastikan JavaFX tercantum dalam daftar modul.

4. **Unduh JavaFX Terpisah (Opsional):** Jika JRE yang Anda instal tidak menyertakan JavaFX, Anda dapat mengunduh JavaFX terpisah dari [situs web resmi JavaFX](https://openjfx.io/) dan mengikuti petunjuk instalasinya.

## Cara Menggunakan

1. **Unduh Aplikasi:** Dari repositori ini, unduh ZakatApp ke perangkat Anda.

2. **Impor Skema Database:** Pada direktori `database`, impor skema database yang disediakan ke dalam MySQL.

3. **Jalankan Aplikasi:** Jalankan aplikasi ZakatApp dengan menjalankan file eksekusi atau menggunakan perintah `java -jar ZakatApp.jar`.

4. **Masukkan Informasi Zakat:** Isi informasi yang diperlukan untuk menghitung zakat berdasarkan pendapatan dan aset Anda.

5. **Jelajahi Informasi Tambahan:** Temukan informasi tambahan tentang jenis zakat, penerima zakat, dan metode pembayaran.
