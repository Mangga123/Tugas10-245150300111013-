import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pemain> timA = new ArrayList<>(List.of(
            new Pemain(168, 50), new Pemain(170, 60), new Pemain(165, 56), new Pemain(168, 55),
            new Pemain(172, 60), new Pemain(170, 70), new Pemain(169, 66), new Pemain(165, 56),
            new Pemain(171, 72), new Pemain(166, 56)
        ));

        ArrayList<Pemain> timB = new ArrayList<>(List.of(
            new Pemain(170, 66), new Pemain(167, 60), new Pemain(165, 59), new Pemain(166, 58),
            new Pemain(168, 58), new Pemain(175, 71), new Pemain(172, 68), new Pemain(171, 68),
            new Pemain(168, 65), new Pemain(169, 60)
        ));

        // Sorting Tinggi
        System.out.println("=== Urutan Tinggi Badan ===");
        TimFutsalHelper.urutkanBerdasarkanTinggi(timA, true);
        System.out.println("Tim A (Ascending): " + timA);
        TimFutsalHelper.urutkanBerdasarkanTinggi(timA, false);
        System.out.println("Tim A (Descending): " + timA);

        TimFutsalHelper.urutkanBerdasarkanTinggi(timB, true);
        System.out.println("Tim B (Ascending): " + timB);
        TimFutsalHelper.urutkanBerdasarkanTinggi(timB, false);
        System.out.println("Tim B (Descending): " + timB);

        // Sorting Berat
        System.out.println("\n=== Urutan Berat Badan ===");
        TimFutsalHelper.urutkanBerdasarkanBerat(timA, true);
        System.out.println("Tim A (Ascending): " + timA);
        TimFutsalHelper.urutkanBerdasarkanBerat(timA, false);
        System.out.println("Tim A (Descending): " + timA);

        TimFutsalHelper.urutkanBerdasarkanBerat(timB, true);
        System.out.println("Tim B (Ascending): " + timB);
        TimFutsalHelper.urutkanBerdasarkanBerat(timB, false);
        System.out.println("Tim B (Descending): " + timB);

        // Max/Min Data
        System.out.println("\n=== Data Maksimal & Minimal ===");
        TimFutsalHelper.tampilkanMaxMin(timA, "Tim A");
        TimFutsalHelper.tampilkanMaxMin(timB, "Tim B");

        // Copy Tim B ke Tim C
        ArrayList<Pemain> timC = new ArrayList<>(timB);
        System.out.println(">> Data Tim C (Copy dari Tim B):");
        System.out.println(timC + "\n");

        // Hitung pemain dengan tinggi tertentu di Tim B
        int jumlah168 = TimFutsalHelper.hitungPemainDenganTinggi(timB, 168);
        int jumlah160 = TimFutsalHelper.hitungPemainDenganTinggi(timB, 160);
        System.out.println("Jumlah pemain Tim B dengan tinggi 168 cm: " + jumlah168);
        System.out.println("Jumlah pemain Tim B dengan tinggi 160 cm: " + jumlah160 + "\n");

        // Hitung pemain dengan berat tertentu di Tim A
        int jumlah56 = TimFutsalHelper.hitungPemainDenganBerat(timA, 56);
        int jumlah53 = TimFutsalHelper.hitungPemainDenganBerat(timA, 53);
        System.out.println("Jumlah pemain Tim A dengan berat 56 kg: " + jumlah56);
        System.out.println("Jumlah pemain Tim A dengan berat 53 kg: " + jumlah53 + "\n");

        // Cek pemain dengan tinggi atau berat sama
        TimFutsalHelper.cariPemainSama(timA, timB);
    }
}
