package Modul4;

import com.sun.security.jgss.GSSUtil;

import java.lang.invoke.MethodHandle;
import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPratikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPratikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Mahasiswa("Arro", "30", "Pemrograman", 2020017));

        System.out.println("Masukan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiwa : " + data.nama + ", Kelas : " + data.kelas + ", mata kuliah pratikum : " + data.matkulPratikum + ", nim : " + data.nim);
        }
    }
}
