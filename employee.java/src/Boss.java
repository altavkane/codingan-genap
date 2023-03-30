public class Boss extends Employee {
    public Boss(int nip, String nama, String status, double jamKerja) {
        super(nip, nama, "Boss", status, jamKerja);
    }

    public void hitungGaji() {
        double gaji = getJamKerja() * 75000;
        double bonus = gaji * 0.2;
        double potongan = 0;
        if (getJamKerja() < 8) {
            potongan = gaji * 0.1;
        }
        setGaji(gaji);
        setBonus(bonus);
        setPotongan(potongan);
    }
}