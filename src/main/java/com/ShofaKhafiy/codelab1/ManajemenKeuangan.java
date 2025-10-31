package com.ShofaKhafiy.codelab1;

import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Aplikasi Mnajemen Keuangan Sederhana ===");
        System.out.println("Masukan nama Anda: ");
        String nama = input.nextLine(); // menambhakan informasi untuk nama user

        double pemasukan, pengeluaran, saldo;

        System.out.print("Masukkan total pemasukan: Rp ");
        pemasukan = input.nextDouble();

        System.out.print("Masukkan total pengeluaran: Rp ");
        pengeluaran = input.nextDouble();

        saldo = pemasukan - pengeluaran;

        //hallo

        display(nama,pemasukan, pengeluaran, saldo);

        logic(saldo, pemasukan, pengeluaran); // menambhakan 2 parameter yaitu pemasukan dan pengeluaran untuk menghitung rata rata pengeluaran uang

        input.close();
    }

    private static void logic(double saldo, double pemasukan, double pengeluaran) {

        System.out.println("Analisis Keuangan");
        if (saldo > 0) {
            System.out.println("Keuangan Anda sehat.");
        } else if (saldo == 0) {
            System.out.println("Keuangan Anda seimbang.");
        } else {
            System.out.println("Pengeluaran melebihi pemasukan. Perlu evaluasi!");
        }

        double persenPengeluaran = (pengeluaran / pemasukan) * 100;

        System.out.printf("Pengeluaran Anda adalah %.2f%% dari pemasukan.%n", persenPengeluaran);

        // Tambahan analisis ringan
        if (persenPengeluaran < 50) {
            System.out.println("💡 Anda tergolong hemat, pertahankan kebiasaan baik ini!");
        } else if (persenPengeluaran < 80) {
            System.out.println("🟡 Pengeluaran Anda cukup besar, tetap waspada.");
        } else {
            System.out.println("🔴 Pengeluaran Anda sangat tinggi, pertimbangkan untuk menabung lebih banyak.");
        }
    }

    //Hallo guys

    private static void display(String nama,double pemasukan, double pengeluaran, double saldo) {
        System.out.println("\n--- Ringkasan Keuangan ---");
        System.out.println("Pemasukan: Rp " + pemasukan);
        System.out.println("Pengeluaran: Rp " + pengeluaran);
        System.out.println("Saldo akhir: Rp " + saldo);
    }
}
