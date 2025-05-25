public class Pemain {
    int tinggiBadan;
    int beratBadan;

    public Pemain(int tinggiBadan, int beratBadan) {
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    @Override
    public String toString() {
        return "[Tinggi: " + tinggiBadan + " cm, Berat: " + beratBadan + " kg]";
    }
}