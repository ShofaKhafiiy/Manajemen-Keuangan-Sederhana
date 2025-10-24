package com.ShofaKhafiy.codelab1;

import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pemasukan, pengeluaran, saldo;

        System.out.print("Masukkan total pemasukan: Rp ");
        pemasukan = input.nextDouble();

        System.out.print("Masukkan total pengeluaran: Rp ");
        pengeluaran = input.nextDouble();

        saldo = pemasukan - pengeluaran;

        display(pemasukan, pengeluaran, saldo);

        logic(saldo);
    }

    private static void logic(double saldo) {
        if (saldo > 0) {
            System.out.println("Keuangan Anda sehat.");
        } else if (saldo == 0) {
            System.out.println("Keuangan Anda seimbang.");
        } else {
            System.out.println("Pengeluaran melebihi pemasukan. Perlu evaluasi!");
        }
    }

    private static void display(double pemasukan, double pengeluaran, double saldo) {
        System.out.println("\n--- Ringkasan Keuangan ---");
        System.out.println("Pemasukan: Rp " + pemasukan);
        System.out.println("Pengeluaran: Rp " + pengeluaran);
        System.out.println("Saldo akhir: Rp " + saldo);
    }
}
