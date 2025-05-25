import java.util.*;

public class TimFutsalHelper {

    public static void urutkanBerdasarkanTinggi(ArrayList<Pemain> tim, boolean naik) {
        if (naik) {
            tim.sort(Comparator.comparingInt(p -> p.tinggiBadan));
        } else {
            tim.sort((p1, p2) -> p2.tinggiBadan - p1.tinggiBadan);
        }
    }

    public static void urutkanBerdasarkanBerat(ArrayList<Pemain> tim, boolean naik) {
        if (naik) {
            tim.sort(Comparator.comparingInt(p -> p.beratBadan));
        } else {
            tim.sort((p1, p2) -> p2.beratBadan - p1.beratBadan);
        }
    }

    public static void tampilkanMaxMin(ArrayList<Pemain> tim, String namaTim) {
        int tinggiMax = Integer.MIN_VALUE, tinggiMin = Integer.MAX_VALUE;
        int beratMax = Integer.MIN_VALUE, beratMin = Integer.MAX_VALUE;

        for (Pemain p : tim) {
            tinggiMax = Math.max(tinggiMax, p.tinggiBadan);
            tinggiMin = Math.min(tinggiMin, p.tinggiBadan);
            beratMax = Math.max(beratMax, p.beratBadan);
            beratMin = Math.min(beratMin, p.beratBadan);
        }

        System.out.println(">> " + namaTim);
        System.out.println("Tinggi Badan Tertinggi: " + tinggiMax + " cm | Terendah: " + tinggiMin + " cm");
        System.out.println("Berat Badan Terberat: " + beratMax + " kg | Terendah: " + beratMin + " kg\n");
    }

    public static int hitungPemainDenganTinggi(ArrayList<Pemain> tim, int tinggiCari) {
        int jumlah = 0;
        for (Pemain p : tim) {
            if (p.tinggiBadan == tinggiCari) jumlah++;
        }
        return jumlah;
    }

    public static int hitungPemainDenganBerat(ArrayList<Pemain> tim, int beratCari) {
        int jumlah = 0;
        for (Pemain p : tim) {
            if (p.beratBadan == beratCari) jumlah++;
        }
        return jumlah;
    }

    public static void cariPemainSama(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println(">> Pemain yang memiliki Tinggi / Berat Sama:");
        for (Pemain a : timA) {
            for (Pemain b : timB) {
                if (a.tinggiBadan == b.tinggiBadan || a.beratBadan == b.beratBadan) {
                    System.out.println("Tim A " + a + " -- Tim B " + b);
                }
            }
        }
        System.out.println();
    }
}
